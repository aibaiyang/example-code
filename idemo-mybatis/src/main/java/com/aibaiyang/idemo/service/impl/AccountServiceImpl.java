package com.aibaiyang.idemo.service.impl;

import com.aibaiyang.idemo.entity.Account;
import com.aibaiyang.idemo.mapper.AccountMapper;
import com.aibaiyang.idemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhong guo
 * @Date 2019/10/5 23:16
 * @description
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account findByName(String name) {
        return accountMapper.findUserByName(name);
    }
}
