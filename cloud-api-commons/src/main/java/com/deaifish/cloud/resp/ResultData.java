package com.deaifish.cloud.resp;

import com.deaifish.cloud.enums.ReturnCodeEnum;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @description 统一返回对象
 *
 * @author DEAiFISH
 * @date 2024/5/14 18:33
 */
@Data
@Accessors(chain = true)    /*相当于Builder*/
public class ResultData<T> {

    private String code;/** 结果状态 ,具体状态码参见枚举类ReturnCodeEnum.java*/
    private String message;
    private T data;
    private long timestamp ;


    public ResultData (){
        this.timestamp = System.currentTimeMillis();
    }

    /**
     * @description 成功调用方法
     *
     * @author DEAiFISH
     * @date 2024/5/14 18:36
     * @param data 返回数据
     * @return com.deaifish.cloud.resp.ResultData<T>
     */
    public static <T> ResultData<T> success(T data) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setCode(ReturnCodeEnum.RC200.getCode());
        resultData.setMessage(ReturnCodeEnum.RC200.getMessage());
        resultData.setData(data);
        return resultData;
    }

/**
 * @description 错误调用方法
 *
 * @author DEAiFISH
 * @date 2024/5/14 18:37
 * @param code 错误码
 * @param message 错误信息
 * @return com.deaifish.cloud.resp.ResultData<T>
 */
    public static <T> ResultData<T> fail(String code, String message) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setCode(code);
        resultData.setMessage(message);

        return resultData;
    }

}
