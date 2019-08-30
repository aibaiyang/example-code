package com.aibaiyang.idemo.service.simplefactorypattern;

/**
 * 除法类
 */
public class OperationDiv extends Operation{

    public double calculate() throws Exception{
        if(super.getNumberB() == 0){
            throw new Exception("除数不能为零!");
        }
        return super.getNumberA() / super.getNumberB();
    }

}
