package com.aibaiyang.idemo.thread.lockdmeo;

/**
 * @Author zhong guo
 * @Date 2019/9/11 0:21
 * @description 示例
 **/
public class DrawDemo {

    public static void main(String[] args) {

        Account account = new Account("123456" ,1000);
        new DrawThread("甲" ,account ,600).start();
        new DrawThread("乙" ,account ,800).start();

    }


}
