package com.aibaiyang.idemo.service.simplefactorypattern;

/**
 * 加法类
 */
public class OperationAdd extends Operation{

    @Override
    public double calculate() {
        return super.getNumberA() + super.getNumberB();
    }

}
