package com.aibaiyang.idemo.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @Author zhong guo
 * @Date 2019/10/20 12:23
 * @description
 **/
public interface MySource {

    @Output("output1")
    MessageChannel output1();

}
