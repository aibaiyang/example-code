package com.aibaiyang.idemo.service.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author zhong guo
 * @Date 2019/8/31 10:20
 * @description 抽象观察者
 **/
@Data
@AllArgsConstructor
public abstract class Observer {

    protected String name;

    protected Subject sub;

    public Observer(){

    }

    /**
     * 更新自己状态
     */
    public abstract void update();

}
