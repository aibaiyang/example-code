package com.aibaiyang.idemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhong guo
 * @Date 2019/9/25 23:39
 * @description
 **/
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/hello")
    public String hello(){

        return "world!";

    }

}
