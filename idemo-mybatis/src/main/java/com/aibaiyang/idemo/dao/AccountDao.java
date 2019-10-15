package com.aibaiyang.idemo.dao;

import com.aibaiyang.idemo.entity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author zhong guo
 * @Date 2019/10/5 23:12
 * @description
 **/
@Mapper
public interface AccountDao {

    Account findUserByName(String name);

}
