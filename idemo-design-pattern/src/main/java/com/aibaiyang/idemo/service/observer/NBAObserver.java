package com.aibaiyang.idemo.service.observer;

/**
 * @Author zhong guo
 * @Date 2019/8/31 11:06
 * @description NBA观察者类
 **/
public class NBAObserver extends Observer{

    public NBAObserver(String name, Subject sub){
        super(name,sub);
    }

    @Override
    public void update() {
        System.out.println(sub.subjectState + super.name + "，关闭NBA，继续工作！");
    }

}
