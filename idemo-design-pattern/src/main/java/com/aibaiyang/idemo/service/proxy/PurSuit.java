package com.aibaiyang.idemo.service.proxy;

import lombok.Data;

/**
 * @Author zhong guo
 * @Date 2019/8/30 18:22
 * @description 最求者类
 **/
@Data
public class PurSuit implements IGiveGift{

    public SchoolGril mm;

    public PurSuit(SchoolGril mm){
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "，送你洋娃娃！");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "，送你鲜花！");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "，送你巧克力！");
    }
}
