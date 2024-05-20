package com.deaifish.cloud.service;

import com.deaifish.cloud.entities.Pay;

import java.util.List;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/14 17:35
 */
public interface PayService {
    int add(Pay pay);

    int delete(Integer id);

    int update(Pay pay);

    Pay getById(Integer id);

    List<Pay> getAll();
}
