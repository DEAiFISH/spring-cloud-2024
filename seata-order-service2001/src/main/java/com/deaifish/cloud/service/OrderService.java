package com.deaifish.cloud.service;

import com.deaifish.cloud.entities.Order;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/20 19:10
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);

}
