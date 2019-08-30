package com.aibaiyang.idemo.service.factorymethod;

import lombok.Data;

/**
 * @Author zhong guo
 * @Date 2019/8/30 19:14
 * @description 雷锋类
 **/
@Data
public class LeiFeng {

    public void sweep(){
        System.out.println("扫地");
    }

    public void wash(){
        System.out.println("洗衣服");
    }

    public void buyRice(){
        System.out.println("买米");
    }

}
