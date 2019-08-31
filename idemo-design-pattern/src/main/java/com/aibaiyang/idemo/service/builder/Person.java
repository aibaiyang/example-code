package com.aibaiyang.idemo.service.builder;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author zhong guo
 * @Date 2019/8/31 16:21
 * @description 小人（产品类）
 **/
public class Person {

    List<String> parts = Lists.newArrayList();

    /**
     * 添加产品部件
     * @param part
     */
    public void add(String part){
        parts.add(part);
    }

    public void showPerson(){

        System.out.println("小人创建：--------");
        for (String part : parts) {
            System.out.println(part);
        }

    }

}
