package com.aibaiyang.idemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author zhong guo
 * @Date 2019/10/20 12:24
 * @description
 **/
@Service
public class SourceDemo {

    @Autowired
    private MySource mySource;


    public void sendTest(){

        ReentrantLock reentrantLock =  new ReentrantLock();

        String msg = "hello";
        mySource.output1().send(MessageBuilder.withPayload(msg).build());

    }


}
