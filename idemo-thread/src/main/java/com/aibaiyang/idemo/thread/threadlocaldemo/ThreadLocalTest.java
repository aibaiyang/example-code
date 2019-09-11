package com.aibaiyang.idemo.thread.threadlocaldemo;

/**
 * @Author zhong guo
 * @Date 2019/9/11 23:38
 * @description
 **/
public class ThreadLocalTest {


    public static void main(String[] args) {

        //启动两个线程，共享同一个Account
        Account account = new Account("初始名");

        /* 虽然两个线程共享一个账户，即只有一个账户名
         * 但由于账户名是ThreadLocal类型，所以每个线程都
         * 拥有各自账户的副本，因此在i == 6 之后将看到两个
         * 线程访问同一个账户时出现不同的账户名
         * */

        new MyTest(account ,"线程甲").start();

        new MyTest(account ,"线程乙").start();

    }

}
