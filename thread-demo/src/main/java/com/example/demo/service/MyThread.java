package com.example.demo.service;

/**
 * 第一个线程
 *
 */
public class MyThread extends Thread{

    @Override
    public void run(){
//        super.run();
        System.out.println("MyThread");
    }


    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("线程运行结束！");

    }

}
