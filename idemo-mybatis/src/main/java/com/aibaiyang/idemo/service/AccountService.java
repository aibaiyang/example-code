package com.aibaiyang.idemo.service;

import com.aibaiyang.idemo.entity.Account;

/**
 * @Author zhong guo
 * @Date 2019/10/5 23:15
 * @description 账户相关方法
 **/
public interface AccountService {

    /**
     * 通过方法名查询
     * @return
     */
    Account findByName(String name);

}
