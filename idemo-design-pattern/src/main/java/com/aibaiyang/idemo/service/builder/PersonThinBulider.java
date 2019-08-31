package com.aibaiyang.idemo.service.builder;

/**
 * @Author zhong guo
 * @Date 2019/8/31 16:07
 * @description 瘦小人建造者类
 **/
public class PersonThinBulider extends PersonBuilder{

    private Person person = new Person();

    @Override
    public void builderHead() {
        String head = "瘦小人头部";
        person.add(head);
    }

    @Override
    public void builderBody() {
        String body = "瘦小人身体";
        person.add(body);
    }

    @Override
    public void builderArmLeft() {
        String armLeft = "瘦小人左手";
        person.add(armLeft);
    }

    @Override
    public void builderArmRight() {
        String armRight = "瘦小人右手";
        person.add(armRight);
    }

    @Override
    public void builderLegLeft() {
        String legLeft = "瘦小人左腿";
        person.add(legLeft);
    }

    @Override
    public void builderLegRight() {
        String legRight = "瘦小人右腿";
        person.add(legRight);
    }

    @Override
    public Person getPerson() {
        return person;
    }

}
