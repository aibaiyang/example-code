package com.aibaiyang.idemo.service.simplefactorypattern;

/**
 * 简单工厂模式客户端
 */
public class SimpleFactoryClient {

    public static void main(String[] args) throws Exception{

        Operation operation = OperationFactory.creteOperate("*");
        operation.setNumberA(3f);
        operation.setNumberB(4f);
        double result = operation.calculate();
        System.out.println(result);

    }

}
