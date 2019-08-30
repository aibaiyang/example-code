package com.aibaiyang.idemo.service.Decorator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author zhong guo
 * @Date 2019/8/30 17:18
 * @description 人类
 **/
@Data
@AllArgsConstructor
public class Person {

    private String name;

    public Person(){

    }

    public void show(){

        System.out.println("装扮的" + name);

    }

}
