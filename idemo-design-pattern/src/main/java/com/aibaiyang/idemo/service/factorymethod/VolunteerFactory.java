package com.aibaiyang.idemo.service.factorymethod;

/**
 * @Author zhong guo
 * @Date 2019/8/30 19:21
 * @description 志愿者工厂
 **/
public class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }

}
