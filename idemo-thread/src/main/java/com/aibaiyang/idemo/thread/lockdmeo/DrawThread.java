package com.aibaiyang.idemo.thread.lockdmeo;

/**
 * @Author zhong guo
 * @Date 2019/9/11 0:06
 * @description
 **/
public class DrawThread extends Thread{

    private Account account;

    private double drawAmount;

    public DrawThread(String name ,Account account ,double drawAmount){

        super(name);
        this.account = account;
        this.drawAmount = drawAmount;

    }

    @Override
    public void run(){
        account.draw(drawAmount);
    }

}
