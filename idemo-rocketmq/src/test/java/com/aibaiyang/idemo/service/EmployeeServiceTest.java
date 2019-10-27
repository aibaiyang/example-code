package com.aibaiyang.idemo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
    private SourceDemo sourceDemo;


    @Test
    public void sendMessage(){

        sourceDemo.sendTest();

    }

//    @Test
//    public void findByNameTest(){
//
//        System.out.println(employeeService.findByName("gz"));
//
//    }

}
