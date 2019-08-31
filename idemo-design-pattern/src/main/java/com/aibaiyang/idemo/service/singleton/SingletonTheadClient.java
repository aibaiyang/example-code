package com.aibaiyang.idemo.service.singleton;

/**
 * @Author zhong guo
 * @Date 2019/8/31 12:04
 * @description 单例模式多线程客户端
 **/
public class SingletonTheadClient {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        //线程1
        Thread thread1 = new Thread(myThread);

        //线程2
        Thread thread2 = new Thread(myThread);

        thread1.start();
        thread2.start();

    }

}
