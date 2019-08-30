package com.aibaiyang.idemo.service.strategy;

import com.aibaiyang.idemo.enums.StrategyEnum;

/**
 * @Author zhong guo
 * @Date 2019/8/30 12:46
 * @description 策略模式客户端
 **/
public class StrategyClient {

    public static void main(String[] args) {

        CashContext cashContext = new CashContext(StrategyEnum.ONE.getType());
        double totalMoney = cashContext.getResult(253f  * 3);
        System.out.println(totalMoney);

    }

}
