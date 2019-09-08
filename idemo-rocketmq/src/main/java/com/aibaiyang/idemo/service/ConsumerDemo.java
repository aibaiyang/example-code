package com.aibaiyang.idemo.service;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.util.List;

/**
 * @Author zhong guo
 * @Date 2019/9/8 11:45
 * @description 消费者示例
 **/
public class ConsumerDemo {

    private static final String NAMESRV_ADDR = "47.107.139.169:9876";

    public static void main(String[] args) throws MQClientException {

        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("test_quick_consumer_name");

        consumer.setNamesrvAddr(NAMESRV_ADDR);

        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);

        consumer.subscribe("demo_quick_topic" , "TagA");

        consumer.registerMessageListener(new MessageListenerConcurrently() {

            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                MessageExt me = msgs.get(0);
                try{
                    String topic = me.getTopic();
                    String tags = me.getTags();
                    String keys = me.getKeys();
                    if(keys.equals("key1")){
                        System.err.println("消息消费失败！");
                        int a = 1/0;
                    }
                    String msgBody = new String (me.getBody() , RemotingHelper.DEFAULT_CHARSET);
                    System.out.println("topic:" + topic + ",tags：" + tags + "，keys：" + keys + "，msgBody：" + msgBody);
                }catch (Exception e){
                    e.printStackTrace();
                    int times = me.getReconsumeTimes();
                    System.out.println("times:" + times);
                    if(times == 3){
                        //"记录日志，做补偿操作"
                        System.out.println("记录日志，做补偿操作");
                        return ConsumeConcurrentlyStatus.RECONSUME_LATER;
                    }
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();
        System.err.println("consumer start......");


    }

}
