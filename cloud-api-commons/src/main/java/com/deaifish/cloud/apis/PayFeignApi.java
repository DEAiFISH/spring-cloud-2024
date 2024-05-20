package com.deaifish.cloud.apis;

import com.deaifish.cloud.dto.PayDTO;
import com.deaifish.cloud.resp.ResultData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/16 14:55
 */
@FeignClient(value = "cloud-payment-service")
public interface PayFeignApi {

    @PostMapping(value = "/pay/add")
    ResultData<String> addPay(@RequestBody PayDTO payDTO);

    @DeleteMapping(value = "/pay/del/{id}")
    ResultData<Integer> deletePay(@PathVariable("id") Integer id);

    @PutMapping(value = "/pay/update")
    ResultData<String> updatePay(@RequestBody PayDTO payDTO);

    @GetMapping(value = "/pay/get/{id}")
    ResultData<PayDTO> getById(@PathVariable("id") Integer id);

    @GetMapping("/pay/get/all")
    ResultData<List<PayDTO>> getAll();

    @GetMapping("/pay/get/info")
    String mylb();

    /**
     * Resilience4j CircuitBreaker 的例子
     * @param id
     * @return
     */
    @GetMapping(value = "/pay/circuit/{id}")
    String myCircuit(@PathVariable("id") Integer id);

    /**
     * Resilience4j Bulkhead 的例子
     * @param id
     * @return
     */
    @GetMapping(value = "/pay/bulkhead/{id}")
    String myBulkhead(@PathVariable("id") Integer id);

    /**
     * Resilience4j Ratelimit 的例子
     * @param id
     * @return
     */
    @GetMapping(value = "/pay/ratelimit/{id}")
    public String myRatelimit(@PathVariable("id") Integer id);


    /**
     * Micrometer(Sleuth)进行链路监控的例子
     * @param id
     * @return
     */
    @GetMapping(value = "/pay/micrometer/{id}")
    String myMicrometer(@PathVariable("id") Integer id);

    /**
     * GateWay进行网关测试案例01
     * @param id
     * @return
     */
    @GetMapping(value = "/pay/gateway/get/{id}")
    ResultData getByIdGateway(@PathVariable("id") Integer id);

    /**
     * GateWay进行网关测试案例02
     * @return
     */
    @GetMapping(value = "/pay/gateway/info")
    ResultData<String> getGatewayInfo();
}
