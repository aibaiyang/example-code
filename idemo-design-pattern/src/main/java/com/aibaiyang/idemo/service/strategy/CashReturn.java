package com.aibaiyang.idemo.service.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author zhong guo
 * @Date 2019/8/30 11:56
 * @description 返利类子类
 **/
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class CashReturn extends CashSuper{

    //返利条件
    private double moneyCondition;

    //返利值
    private double moneyReturn;

    @Override
    public double acceptCash(double money) {

        //若钱大于返利条件，则减去返利值
        if(money >= moneyCondition){
            money = money - moneyReturn;
        }
        return money;
    }


}
