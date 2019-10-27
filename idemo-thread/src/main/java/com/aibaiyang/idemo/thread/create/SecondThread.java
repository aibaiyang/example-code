package com.aibaiyang.idemo.thread.create;

/**
 * @Author zhong guo
 * @Date 2019/10/27 20:19
 * @description 通过实现Runnable接口创建线程
 **/
public class SecondThread implements Runnable{


    @Override
    public void run() {

        //获取当前线程名称
        System.out.println("当前线程：" + Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        SecondThread secondThread = new SecondThread();
        new Thread(secondThread).start();

    }


}


