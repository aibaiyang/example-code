package com.aibaiyang.idemo.service.proxy;

/**
 * @Author GZ
 * @Date 2019/8/30 18:34
 * @description 代理模式客户端
 **/
public class ProxyClient {

    public static void main(String[] args) {

        //小学妹
        SchoolGril mm = new SchoolGril();
        mm.setName("白鹿");

        //戴励
        Proxy proxy = new Proxy(mm);

        //撩妹
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();

    }

}
