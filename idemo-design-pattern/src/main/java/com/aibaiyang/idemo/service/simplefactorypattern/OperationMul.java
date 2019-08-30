package com.aibaiyang.idemo.service.simplefactorypattern;

/**
 * 乘法类
 */
public class OperationMul extends Operation{

    public double calculate(){
        return super.getNumberA() * super.getNumberB();
    }

}
