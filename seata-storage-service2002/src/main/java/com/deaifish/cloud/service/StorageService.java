package com.deaifish.cloud.service;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/20 19:50
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}