package com.aibaiyang.idemo.service.builder;

/**
 * @Author zhong guo
 * @Date 2019/8/31 15:59
 * @description 抽像人物建造者
 **/
public abstract class PersonBuilder {

    /**
     * 建造头
     */
    public abstract void builderHead();

    /**
     * 建造身子
     */
    public abstract void builderBody();

    /**
     * 建造左手
     */
    public abstract void builderArmLeft();

    /**
     * 建造右手
     */
    public abstract void builderArmRight();

    /**
     * 建造左手
     */
    public abstract void builderLegLeft();

    /**
     * 建造右手
     */
    public abstract void builderLegRight();

    /**
     * 得到人
     * @return
     */
    public abstract Person getPerson();



}
