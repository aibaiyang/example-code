package com.aibaiyang.idemo.service.builder;

/**
 * @Author zhong guo
 * @Date 2019/8/31 16:15
 * @description 建造者模式客户端
 **/
public class BuilderClient {

    public static void main(String[] args) {

        //建瘦小人
        PersonDirector director = new PersonDirector();
        PersonBuilder thinBuilder = new PersonThinBulider();
        director.createPerson(thinBuilder);

        Person thinPerson = thinBuilder.getPerson();
        thinPerson.showPerson();

        //建胖小人
        PersonBuilder fatBuilder = new PersonFatBuilder();
        director.createPerson(fatBuilder);

        Person fatPerson = fatBuilder.getPerson();
        fatPerson.showPerson();

    }

}
