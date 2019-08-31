package com.aibaiyang.idemo.service.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author zhong guo
 * @Date 2019/8/31 10:27
 * @description 老板类
 **/
public class Boss extends Subject {

    private List<Observer> obeservers;

    public Boss(){
        this.obeservers = Lists.newArrayList();
    }

    @Override
    public void attach(Observer observer) {
        obeservers.add(observer);
    }

    @Override
    public void detach(Observer oeserver) {
        obeservers.remove(oeserver);
    }

    @Override
    public void inform() {
        obeservers.forEach(o ->{
            o.update();
        });
    }


}
