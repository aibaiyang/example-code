package com.aibaiyang.idemo.service.builder;

/**
 * @Author zhong guo
 * @Date 2019/8/31 16:11
 * @description 建小人指挥者
 **/
public class PersonDirector {

    public void createPerson(PersonBuilder builder){

        builder.builderHead();
        builder.builderBody();
        builder.builderArmLeft();
        builder.builderLegRight();
        builder.builderLegLeft();
        builder.builderLegRight();

    }

}
