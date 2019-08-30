package com.aibaiyang.idemo.service.proxy;

/**
 * @Author zhong guo
 * @Date 2019/8/30 18:30
 * @description 代理类
 **/
public class Proxy implements IGiveGift{

    private PurSuit purSuit;

    public Proxy(SchoolGril mm){
        purSuit = new PurSuit(mm);
    }

    @Override
    public void giveDolls() {
        purSuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        purSuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        purSuit.giveChocolate();
    }
}
