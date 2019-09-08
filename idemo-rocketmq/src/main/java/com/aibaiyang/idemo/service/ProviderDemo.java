package com.aibaiyang.idemo.service;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

/**
 * @Author zhong guo
 * @Date 2019/9/5 23:45
 * @description
 **/
public class ProviderDemo {

    private static final String NAMESRV_ADDR = "47.107.139.169:9876";

    public static void main(String[] args) throws Exception{

        DefaultMQProducer producer = new DefaultMQProducer("test_quick_producer_name");

        producer.setNamesrvAddr(NAMESRV_ADDR);

        producer.start();

        for (int i = 0; i < 5; i++) {

            //1、创建消息
            Message message = new Message("demo_quick_topic", //主题
                    "TagA", // 标签
                     "key" + i, // 唯一标识
                    ("Hello Rocketmq" + i+"ss").getBytes());

            //2、发送消息
            SendResult sr = producer.send(message);
            System.out.println("消息发出："+sr);

        }

        producer.shutdown();

    }

}
