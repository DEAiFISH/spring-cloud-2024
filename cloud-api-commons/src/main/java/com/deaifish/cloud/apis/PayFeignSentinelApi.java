package com.deaifish.cloud.apis;

import com.deaifish.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/19 16:45
 */
@FeignClient(value = "nacos-payment-provider",fallback = PayFeignSentinelApiFallBack.class)
public interface PayFeignSentinelApi
{
    @GetMapping("/pay/nacos/get/{orderNo}")
    ResultData getPayByOrderNo(@PathVariable("orderNo") String orderNo);

    @GetMapping(value = "/pay/nacos/{id}")
    String getPayInfo(@PathVariable("id") Integer id);
}
