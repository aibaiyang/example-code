package com.aibaiyang.idemo.service.factorymethod;

/**
 * @Author zhong guo
 * @Date 2019/8/30 19:22
 * @description 工厂方法客户端
 **/
public class FactoryMethodClient {

    public static void main(String[] args) {

        //工厂方法模式

        //此处为学雷锋学生工厂，若要替换成志愿者，只需替换工厂类即可
//        IFactory factory = new UndergraduateFactory();
        IFactory factory = new VolunteerFactory();

        LeiFeng student = factory.createLeiFeng();
        student.wash();
        student.sweep();
        student.buyRice();

    }

}
