package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @author zhongguo
 * @data 2019-08-11
 * @description 用户相关接口
 */
public interface UserService {

    /**
     * 通过名称查询用户
     * @param name
     * @return
     */
    List<User> getAll(String name);

}
