package com.aibaiyang.idemo.service.observer;

/**
 * @Author zhong guo
 * @Date 2019/8/31 10:50
 * @description
 **/
public class StockObeserver extends Observer {

    public StockObeserver(String name, Subject sub){
        super(name,sub);
    }

    @Override
    public void update() {
        System.out.println(sub.subjectState + super.name + "，关闭股票行情，继续工作！");
    }

}
