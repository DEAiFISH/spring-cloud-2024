package com.deaifish.cloud.controller;

import com.deaifish.cloud.dto.PayDTO;
import com.deaifish.cloud.resp.ResultData;
import jakarta.annotation.Resource;
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
    //    public static final String PaymentSrv_URL = "http://localhost:8001";//先写死，硬编码
    public static final String PaymentSrv_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    /**
     * 一般情况下，通过浏览器的地址栏输入url，发送的只能是get请求
     * 我们底层调用的是post方法，模拟消费者发送get请求，客户端消费者
     * 参数可以不添加@RequestBody
     * @param payDTO
     * @return
     */
    @PostMapping("/consumer/pay/add")
    public ResultData addOrder(PayDTO payDTO) {
        return restTemplate.postForObject(PaymentSrv_URL + "/pay/add", payDTO, ResultData.class);
    }

    @GetMapping("/consumer/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(PaymentSrv_URL + "/pay/get/" + id, ResultData.class, id);
    }

    @DeleteMapping("/consumer/pay/del/{id}")
    public ResultData deleteOrder(@PathVariable("id") Integer id) {
        restTemplate.delete(PaymentSrv_URL + "/pay/del/" + id, id);
        return ResultData.success(null);
    }

    @PutMapping("/consumer/pay/update")
    public ResultData updateOrderById(PayDTO payDTO) {
        restTemplate.put(PaymentSrv_URL + "/pay/update", payDTO);
        return ResultData.success(null);
    }

    @GetMapping("/consumer/pay/get/info")
    public String getPayInfo() {
        return restTemplate.getForObject(PaymentSrv_URL + "/pay/get/info", String.class);
    }
}
