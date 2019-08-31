package com.aibaiyang.idemo.service.simplefactory;

/**
 * 乘法类
 */
public class OperationMul extends Operation{

    public double calculate(){
        return super.getNumberA() * super.getNumberB();
    }

}
