package com.aibaiyang.idemo.service.singleton;

/**
 * @Author zhong guo
 * @Date 2019/8/31 12:04
 * @description 单例模式多线程客户端
 **/
public class SingletonTheadClient {

    public static void main(String[] args) {

        //1、懒汉多线程单例测试
        lazySingletonTest();

        //2、饿汉多线程单例测试
        hungarySingletonTest();

    }

    static void lazySingletonTest(){

        LazyThread myThread = new LazyThread();

        //线程1
        Thread thread1 = new Thread(myThread);

        //线程2
        Thread thread2 = new Thread(myThread);

        thread1.start();
        thread2.start();

    }

    static void hungarySingletonTest(){

        //线程1
        HungaryThread hungaryThread1 = new HungaryThread();

        //线程2
        HungaryThread hungaryThread2 = new HungaryThread();

        hungaryThread1.start();
        hungaryThread2.start();

    }

}
