package com.deaifish.cloud.controller;

import com.deaifish.cloud.apis.PayFeignSentinelApi;
import com.deaifish.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/18 16:43
 */
@RestController
public class OrderNacosController
{
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private PayFeignSentinelApi payFeignSentinelApi;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/consumer/pay/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id)
    {
        String result = restTemplate.getForObject(serverURL + "/pay/nacos/" + id, String.class);
        return result+"\t"+"    我是OrderNacosController83调用者。。。。。。";
    }

    @GetMapping(value = "/consumer/pay/nacos/get/{orderNo}")
    public ResultData getPayByOrderNo(@PathVariable("orderNo") String orderNo)
    {
        return payFeignSentinelApi.getPayByOrderNo(orderNo);
    }

    @GetMapping(value = "/consumer/pay/nacos/id/{id}")
    public String getPayInfo(@PathVariable("id") Integer id)
    {
        return payFeignSentinelApi.getPayInfo(id);
    }
}
