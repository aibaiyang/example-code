package com.aibaiyang.idemo.service.strategy;

import lombok.Data;

/**
 * @Author zhong guo
 * @Date 2019/8/30 11:51
 * @description 打折收费子类
 **/
@Data
public class CashRebate extends CashSuper{

    //折扣率
    private double moneyRebate;

    //构造方法
    public CashRebate(double moneyRebate){
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

}
