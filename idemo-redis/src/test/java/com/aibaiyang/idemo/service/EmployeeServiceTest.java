package com.aibaiyang.idemo.service;

import com.aibaiyang.idemo.entity.Employee;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author gz
 * @Date 2019/8/14
 * @Description
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void stringRedisTemplateTest(){

        stringRedisTemplate.opsForValue().set("aaa", "111");
        System.out.println(stringRedisTemplate.opsForValue().get("aaa"));

    }

    @Test
    public void redisTemplateTest(){

        Employee employee = new Employee();
        employee.setId(8)
                .setCode("by")
                .setName("by");
        List<Employee> employeeList = Lists.newArrayList(employee);
        ValueOperations<String, Employee> employeeCache = redisTemplate.opsForValue();
        employeeCache.set(employee.getCode(),employee ,10 ,TimeUnit.SECONDS);
        System.out.println(employeeCache.get(employee.getCode()));

        ListOperations<String, List<Employee>> emoloyeeListCache = redisTemplate.opsForList();
        emoloyeeListCache.set("ss",2L, employeeList);

    }





}
