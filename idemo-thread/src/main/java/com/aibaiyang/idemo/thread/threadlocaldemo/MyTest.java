package com.aibaiyang.idemo.thread.threadlocaldemo;

/**
 * @Author zhong guo
 * @Date 2019/9/11 23:32
 * @description
 **/
public class MyTest extends Thread{

    private Account account;

    public MyTest(Account account ,String name){

        super(name);
        this.account = account;

    }

    public void run(){

        for (int i = 0; i < 10; i++) {
            //当i = 6 时，输出将账户名替换成当前线程名
            if(i == 6){
                account.setName(getName());
            }
            //输出同一个账户的账户名和循环变量
            System.out.println(account.getName() + " 账户的i值：" + i);
        }

    }

}
