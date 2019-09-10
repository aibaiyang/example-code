package com.aibaiyang.idemo.thread.lockdmeo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author zhong guo
 * @Date 2019/9/10 23:46
 * @description 同步锁Lock代码示例
 **/
@Data
@AllArgsConstructor
public class Account {

    //定义锁对象
    private  final ReentrantLock lock = new ReentrantLock();

    //账户编号
    private String accountNo;

    //账户余额
    private double balance;

    public Account(){};

    //提供一个线程安全的draw()方法来完成取钱操作
    public void draw(double drawAmount){

        //加锁
        lock.lock();
        try{

            if(balance >= drawAmount){
                System.out.println(Thread.currentThread().getName() + "取钱成功：吐出钞票：" + drawAmount);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= drawAmount;
                System.out.println("\t余额为：" + balance);
            }else {
                System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足!");
            }

        }
        finally {
            //修改完成，释放锁
            lock.unlock();
        }

    }




}
