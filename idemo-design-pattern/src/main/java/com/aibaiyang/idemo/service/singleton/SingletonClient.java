package com.aibaiyang.idemo.service.singleton;

/**
 * @Author zhong guo
 * @Date 2019/8/31 11:50
 * @description 单例模式客户端
 **/
public class SingletonClient {

    public static void main(String[] args){

        //1、懒汉单例实例
        lazySingletonDemo();

        //2、饿汉单例实例
        hungarySingletonDemo();


    }

    static void lazySingletonDemo(){

        //实例1
        Singleton singleton1 = Singleton.getInstance();

        //实例2
        Singleton singleton2 = Singleton.getInstance();

        if(singleton1 == singleton2){
            System.out.println("懒汉相同的实例！");
        }else {
            System.out.println("懒汉不同的实例");
        }

    }

    static void hungarySingletonDemo(){

        HungarySingleton hungarySingleton1 = HungarySingleton.getInstance();

        HungarySingleton hungarySingleton2 = HungarySingleton.getInstance();

        if(hungarySingleton1 == hungarySingleton2){
            System.out.println("饿汉相同的实例！");
        }else {
            System.out.println("饿汉不同的实例！");
        }

    }

}
