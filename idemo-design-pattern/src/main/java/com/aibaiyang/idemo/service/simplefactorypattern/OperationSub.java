package com.aibaiyang.idemo.service.simplefactorypattern;

/**
 * 减法类
 */
public class OperationSub extends Operation{

    public double calculate() {
        return super.getNumberA() - super.getNumberB();
    }

}
