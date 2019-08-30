package com.aibaiyang.idemo.service.strategy;

/**
 * @Author zhong guo
 * @Date 2019/8/30 11:50
 * @description 正常收费
 **/
public class CashNormal extends CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }

}
