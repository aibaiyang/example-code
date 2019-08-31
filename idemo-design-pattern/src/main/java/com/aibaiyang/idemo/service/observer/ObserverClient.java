package com.aibaiyang.idemo.service.observer;

/**
 * @Author zhong guo
 * @Date 2019/8/31 11:03
 * @description 观察者模式客户端
 **/
public class ObserverClient {

    public static void main(String[] args) {

        //老板胡汉三
        Boss huhansan = new Boss();

        //看股票的同事
        StockObeserver stockObeserver = new StockObeserver("魏关停", huhansan);

        //看NBA的同事
        NBAObserver nbaObserver = new NBAObserver("易管查", huhansan);

        huhansan.attach(stockObeserver);
        huhansan.attach(nbaObserver);

        //魏观察没被老板通知，减去
//        huhansan.detach(stockObeserver);

        //老板状态
        huhansan.subjectState = "我胡汉三又回来了，";

        //发出通知
        huhansan.inform();

    }

}
