package com.aibaiyang.idemo.service.Decorator;

/**
 * @Author zhong guo
 * @Date 2019/8/30 17:38
 * @description 装饰者示例
 **/
public class DecoratorClient {

    public static void main(String[] args) {

        Person person = new Person("艾白羊");

        System.out.println("第一种装饰");

        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        bigTrouser.show();

    }

}
