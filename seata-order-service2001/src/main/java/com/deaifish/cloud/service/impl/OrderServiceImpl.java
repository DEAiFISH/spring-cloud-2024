package com.deaifish.cloud.service.impl;

import com.deaifish.cloud.apis.AccountFeignApi;
import com.deaifish.cloud.apis.StorageFeignApi;
import com.deaifish.cloud.entities.Order;
import com.deaifish.cloud.mapper.OrderMapper;
import com.deaifish.cloud.service.OrderService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/20 19:10
 */
@Slf4j
@Service
@GlobalTransactional(name = "deaifish-create-order", rollbackFor = Exception.class) // AT
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Resource//订单微服务通过OpenFeign去调用库存微服务
    private StorageFeignApi storageFeignApi;
    @Resource//订单微服务通过OpenFeign去调用账户微服务
    private AccountFeignApi accountFeignApi;

    @Override
    public void create(Order order) {
        // xid 全局事物检查， 重要！！！
        String xid = RootContext.getXID();

        //1、新建订单
        log.info("\n==================>开始新建订单\txid_order:{}", xid);
        // 订单新建时默认初始订单状态是 0
        order.setStatus(0);
        int result = orderMapper.insertSelective(order);
        // 插入订单成功后获得插入mysql的实体对象
        Order orderFromDB = null;
        if (result > 0) {
            // 从mysql中查出刚插入的记录
            orderFromDB = orderMapper.selectOne(order);
            log.info("-----> 新建订单成功，orderFromDB info：{}}", orderFromDB);

            //2、扣减库存
            log.info("\n-------> 订单微服务开始调用Storage库存，做扣减count");
            storageFeignApi.decrease(orderFromDB.getProductId(), orderFromDB.getCount());
            log.info("-------> 订单微服务结束调用Storage库存，扣减完成");

            //3、扣减账户余额
            log.info("\n-------> 订单微服务开始调用Account账号，做扣减money");
            accountFeignApi.decrease(orderFromDB.getUserId(), orderFromDB.getMoney());
            log.info("-------> 订单微服务结束调用Account账号，做扣减完成");

            //4、修改订单状态
            // 将订单状态从 0 修改为 1，表示已完成
            log.info("\n-------> 修改订单状态");

            orderFromDB.setStatus(1);

            Example whereCondition = new Example(Order.class);
            Example.Criteria criteria = whereCondition.createCriteria();
            criteria.andEqualTo("userId", orderFromDB.getUserId());
            criteria.andEqualTo("status", 0);

            int updateResult = orderMapper.updateByExampleSelective(orderFromDB, whereCondition);
            log.info("-------> 修改订单状态完成" + "\t" + updateResult);
            log.info("-------> orderFromDB info: " + orderFromDB);
        }
        log.info("\n==================>结束新建订单\txid_order:{}", xid);
    }
}
