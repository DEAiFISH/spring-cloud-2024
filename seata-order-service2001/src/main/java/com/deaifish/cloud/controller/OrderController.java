package com.deaifish.cloud.controller;

import com.deaifish.cloud.entities.Order;
import com.deaifish.cloud.resp.ResultData;
import com.deaifish.cloud.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/20 19:44
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public ResultData<Order> create(Order order)
    {
        orderService.create(order);
        return ResultData.success(order);
    }
}