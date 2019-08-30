package com.aibaiyang.idemo.service.factorymethod;

/**
 * @Author zhong guo
 * @Date 2019/8/30 19:20
 * @description 学雷锋大学生工厂
 **/
public class UndergraduateFactory implements IFactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }

}
