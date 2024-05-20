package com.deaifish.cloud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/14 17:33
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PayDTO implements Serializable {
    /**
     * 支付流水号
     */
    private String payNo;

    /**
     * 订单流水号
     */
    private String orderNo;

    /**
     * 用户账号ID
     */
    private Integer userId;

    /**
     *
     * 交易金额
     */
    private BigDecimal amount;
}
