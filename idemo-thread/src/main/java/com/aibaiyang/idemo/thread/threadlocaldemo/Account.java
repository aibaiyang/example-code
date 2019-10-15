package com.aibaiyang.idemo.thread.threadlocaldemo;

/**
 * @Author zhong guo
 * @Date 2019/9/11 22:58
 * @description 账户类
 **/
public class Account {

    private ThreadLocal<String> name = new ThreadLocal<>();

    public Account(String str){

        this.name.set(str);

    }

    public String getName(){

       // 访问当前线程的name副本值
       return this.name.get();

    }


    public void setName(String str){

        this.name.set(str);

    }



}
