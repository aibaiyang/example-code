package com.aibaiyang.idemo.service.simplefactory;

/**
 * 操作工厂类
 */
public class OperationFactory {

    public static Operation creteOperate(String operate){

        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
            break;

            case "-":
                operation = new OperationSub();
            break;

            case "*":
                operation = new OperationMul();
            break;

            case "/":
                operation = new OperationDiv();
            break;
        }

        return operation;

    }

}
