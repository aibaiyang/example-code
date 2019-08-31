package com.aibaiyang.idemo.service.singleton;

/**
 * @Author zhong guo
 * @Date 2019/8/31 11:43
 * @description 单例模式
 **/
public class Singleton {

    private volatile static Singleton instance;

    /**
     * 构造方法让其private，这就堵死了外面利用new关键字
     * 创建此类示例的可能
     */
    private Singleton(){

    }

    /**
     * 此方法为获得此类示例的唯一访问点
     * @return
     */
    public static Singleton getInstance(){

        if(instance == null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
            instance = new Singleton();
        }
        return instance;

    }

}
