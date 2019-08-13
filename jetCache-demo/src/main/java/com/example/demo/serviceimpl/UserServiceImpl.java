package com.example.demo.serviceimpl;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.alicp.jetcache.anno.CreateCache;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {

    private static final String CACHE_NAME = "UserService:getAll";

    @Autowired
    private UserMapper userMapper;

    @CreateCache(name = CACHE_NAME, expire = 1, localLimit = 10,
            timeUnit = TimeUnit.MINUTES, cacheType = CacheType.BOTH)
    private Cache<String, List<User>> userListCache;

    @Override
    @Cached(name = CACHE_NAME ,key = "#name")
    public List<User> getAll(String name) {

//        List<User> userList = userListCache.get(name);
//        if (userList != null && userList.size() > 0) {
//            return userList;
//        } else {
//            userList = userMapper.getAll(name);
//            userListCache.put(name,userList,1L,TimeUnit.MINUTES);
//            return userList;
//        }

        return userMapper.getAll(name);

    }

}
