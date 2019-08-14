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

    /**
     * 添加用户
     * @param user
     * @return
     */
    void add(User user);

    /**
     * 更新用户
     * @param user
     */
    void update(User user);

    /**
     * 删除用户
     * @param user
     */
    void delete(User user);

}
