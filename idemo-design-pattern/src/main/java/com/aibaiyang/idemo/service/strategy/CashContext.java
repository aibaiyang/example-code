package com.aibaiyang.idemo.service.strategy;

/**
 * @Author zhong guo
 * @Date 2019/8/30 12:34
 * @description
 **/
public class CashContext {

    private CashSuper cs;

    public CashContext(Integer type){
        switch (type){

            case 1:
                cs = new CashNormal();
                break;

            case 2:
                cs = new CashRebate(0.8);
                break;

            case 3:
                cs = new CashReturn(300f ,100f);
                break;
        }

    }

    /**
     * 得到结果
     * @param money
     * @return
     */
    public double getResult(double money){
        return cs.acceptCash(money);
    }

}
