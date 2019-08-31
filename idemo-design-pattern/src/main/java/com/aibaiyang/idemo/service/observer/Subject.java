package com.aibaiyang.idemo.service.observer;

import lombok.Data;

/**
 * @Author zhong guo
 * @Date 2019/8/31 10:18
 * @description 抽象通知者
 **/
@Data
public abstract class Subject {

    /**
     * 增加通知者
     * @param obeserver
     */
    void attach(Observer obeserver){

    }

    /**
     * 减少通知者
     * @param obeserver
     */
    void detach(Observer obeserver){

    }

    /**
     * 通知
     */
    void inform(){

    }

    String subjectState ;

}
