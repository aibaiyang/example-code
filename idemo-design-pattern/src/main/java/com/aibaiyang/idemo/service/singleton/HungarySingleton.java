package com.aibaiyang.idemo.service.singleton;

/**
 * @Author zhong guo
 * @Date 2019/8/31 15:01
 * @description 饿汉单例模式(多线程环境依然是单例)
 **/
public class HungarySingleton {

    private static HungarySingleton instance = new HungarySingleton();

    private HungarySingleton(){

    }

    public static HungarySingleton getInstance(){
        return instance;
    }

}
