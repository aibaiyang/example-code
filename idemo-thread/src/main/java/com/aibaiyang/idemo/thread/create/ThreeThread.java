package com.aibaiyang.idemo.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Author zhong guo
 * @Date 2019/10/27 20:22
 * @description  通过实现Callable接口创建有返回值的线程
 **/
public class ThreeThread implements Callable<String> {

    @Override
    public String call() throws Exception {

        System.out.println("当前线程：" + Thread.currentThread().getName());
        return "线程返回的结果!";

    }

    public static void main(String[] args) throws Exception{

        //1、创建Callable接口实现类，并实现call方法
        ThreeThread threeThread = new ThreeThread();
        //2、使用FutureTask来包装Callable对象
        FutureTask<String> result = new FutureTask<>(threeThread);
        //3、使用FutureTask作为Thread对象的target来创建线程
        new Thread(result).start();
        //4、调用FutureTask对象的get方法来获得子线程执行结束后的返回值
        // 获取运算结果是同步过程，即 call 方法执行完成，才能获取结果
        System.out.println(result.get());

    }

}
