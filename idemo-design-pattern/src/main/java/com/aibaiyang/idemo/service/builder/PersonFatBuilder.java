package com.aibaiyang.idemo.service.builder;

/**
 * @Author zhong guo
 * @Date 2019/8/31 16:45
 * @description 胖小人建造者
 **/
public class PersonFatBuilder extends PersonBuilder{

    private Person person = new Person();

    @Override
    public void builderHead() {
        String head = "胖小人头部";
        person.add(head);
    }

    @Override
    public void builderBody() {
        String body = "胖小人身体";
        person.add(body);
    }

    @Override
    public void builderArmLeft() {
        String armLeft = "胖小人左手";
        person.add(armLeft);
    }

    @Override
    public void builderArmRight() {
        String armRight = "胖小人右手";
        person.add(armRight);
    }

    @Override
    public void builderLegLeft() {
        String legLeft = "胖小人左腿";
        person.add(legLeft);
    }

    @Override
    public void builderLegRight() {
        String legRight = "胖小人右腿";
        person.add(legRight);
    }

    @Override
    public Person getPerson() {
        return person;
    }

}
