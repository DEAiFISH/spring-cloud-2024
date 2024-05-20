package com.deaifish.cloud.service.impl;

import com.deaifish.cloud.mapper.StorageMapper;
import com.deaifish.cloud.service.StorageService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/20 19:50
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService
{

    @Resource
    private StorageMapper storageMapper;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageMapper.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");
    }
}
