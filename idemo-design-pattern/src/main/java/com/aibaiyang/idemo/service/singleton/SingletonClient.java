package com.aibaiyang.idemo.service.singleton;

/**
 * @Author zhong guo
 * @Date 2019/8/31 11:50
 * @description 单例模式客户端
 **/
public class SingletonClient {

    public static void main(String[] args){

        //实例1
        Singleton singleton1 = Singleton.getInstance();

        //实例2
        Singleton singleton2 = Singleton.getInstance();

        if(singleton1 == singleton2){
            System.out.println("相同的实例！");
        }else {
            System.out.println("不同的实例");
        }

    }

}
