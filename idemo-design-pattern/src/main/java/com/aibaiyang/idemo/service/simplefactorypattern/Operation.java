package com.aibaiyang.idemo.service.simplefactorypattern;

import lombok.Data;

/**
 * 操作类
 */
@Data
public class Operation {

    private double numberA;

    private double numberB;

    public double calculate() throws Exception{

        double result = 0f;
        return result;

    }

}
