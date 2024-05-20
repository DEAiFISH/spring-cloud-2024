package com.deaifish.cloud.service.impl;

import com.deaifish.cloud.entities.Pay;
import com.deaifish.cloud.mapper.PayMapper;
import com.deaifish.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2024/5/14 17:36
 */
@Service
public class PayServiceImpl implements PayService {
    @Resource
    PayMapper payMapper;

    @Override
    public int add(Pay pay) {
        return payMapper.insertSelective(pay);
    }

    @Override
    public int delete(Integer id) {
        return payMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Pay pay) {
        return payMapper.updateByPrimaryKeySelective(pay);
    }

    @Override
    public Pay getById(Integer id) {
        return payMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Pay> getAll() {
        return payMapper.selectAll();
    }
}
