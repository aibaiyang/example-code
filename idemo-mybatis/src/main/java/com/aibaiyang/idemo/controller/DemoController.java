package com.aibaiyang.idemo.controller;

import com.aibaiyang.idemo.annotation.LoginRequired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jone Guo
 * @Date 2020/9/15 16:40
 * @Description 测试类controller
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/filterTest")
    public void filterTest(@RequestParam("name") String name){
        System.out.println("filterTest");
    }


    @RequestMapping("/loginTest")
    @LoginRequired
    public void loginTest(){
        System.out.println("loginTest");
    }


}
