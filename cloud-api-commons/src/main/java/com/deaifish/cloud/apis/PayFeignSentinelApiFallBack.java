package com.deaifish.cloud.apis;

import com.deaifish.cloud.enums.ReturnCodeEnum;
import com.deaifish.cloud.resp.ResultData;
import org.springframework.stereotype.Component;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/19 16:45
 */
@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi
{
    @Override
    public ResultData getPayByOrderNo(String orderNo)
    {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),"getPayByOrderNo ==> 对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }

    @Override
    public String getPayInfo(Integer id) {
        return "getPayInfo ==> 对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o\");";
    }
}
