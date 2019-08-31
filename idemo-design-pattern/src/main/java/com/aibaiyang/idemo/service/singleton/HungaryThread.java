package com.aibaiyang.idemo.service.singleton;

/**
 * @Author zhong guo
 * @Date 2019/8/31 15:13
 * @description 饿汉线程
 **/
public class HungaryThread extends Thread{

    public void run(){
        //打印当前对象的hash值，相同则代表同一个对象，不同代表不同对象。
        System.out.println("当前对象hashCode:" + HungarySingleton.getInstance().hashCode());

    }

}
