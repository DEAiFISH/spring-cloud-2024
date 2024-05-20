package com.deaifish.cloud.controller;

import cn.hutool.core.date.DateUtil;
import com.deaifish.cloud.apis.PayFeignApi;
import com.deaifish.cloud.dto.PayDTO;
import com.deaifish.cloud.enums.ReturnCodeEnum;
import com.deaifish.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/14 22:50
 */
@RestController
public class OrderController {
    @Resource
    private PayFeignApi payFeignApi;

    @PostMapping("/feign/pay/add")
    public ResultData<String> addOrder(@RequestBody PayDTO payDTO){
        return payFeignApi.addPay(payDTO);
    }

    @GetMapping("/feign/pay/get/{id}")
    public ResultData<PayDTO> getOrder(@PathVariable("id") Integer id){

        System.out.println("-------支付微服务远程调用，按照id查询订单支付流水信息");

        ResultData resultData = null;
        try
        {
            System.out.println("调用开始-----:"+DateUtil.now());
            resultData = payFeignApi.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("调用结束-----:"+ DateUtil.now());
            ResultData.fail(ReturnCodeEnum.RC500.getCode(),e.getMessage());
        }

        return resultData;
    }

    @GetMapping("/feign/pay/mylb")
    public String mylb(){
        return payFeignApi.mylb();
    }
}
