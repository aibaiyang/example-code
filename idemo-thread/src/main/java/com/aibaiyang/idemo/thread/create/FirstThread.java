package com.aibaiyang.idemo.thread.create;

/**
 * @Author zhong guo
 * @Date 2019/10/27 20:14
 * @description 通过继承Thread的方式创建线程
 **/
public class FirstThread extends Thread{

    public void run(){

        //获取当前线程名称
        System.out.println("当前线程：" + getName());

    }


    public static void main(String[] args) {

        new FirstThread().start();

    }

}
