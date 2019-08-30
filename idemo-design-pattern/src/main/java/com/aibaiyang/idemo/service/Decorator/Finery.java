package com.aibaiyang.idemo.service.Decorator;

/**
 * @Author zhong guo
 * @Date 2019/8/30 17:25
 * @description 服饰类
 **/
public class Finery extends Person{

    protected Person component;

    //打扮
    public void decorate(Person component){
        this.component = component;
        System.out.println("打扮："+this.component);
    }

    @Override
    public void show(){

        if(component != null){
            component.show();
            System.out.println("show:"+component);
        }

    }

}
