package com.aibaiyang.idemo.mapper;

import com.aibaiyang.idemo.entity.Account;
import com.aibaiyang.idemo.util.MyMapper;

public interface AccountMapper extends MyMapper<Account> {

    Account findUserByName(String name);

}