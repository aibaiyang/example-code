package com.aibaiyang.idemo.controller;

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

}
