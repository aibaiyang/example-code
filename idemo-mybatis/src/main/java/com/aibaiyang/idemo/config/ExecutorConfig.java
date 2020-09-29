package com.aibaiyang.idemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @Author Jone Guo
 * @Date 2020/9/29 17:19
 * @Description 线程池配置
 **/
@Configuration
public class ExecutorConfig {

    @Bean
    public ThreadPoolTaskExecutor getAsyncExecutor() {

        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        // 设置核心线程数
        taskExecutor.setCorePoolSize(5);// 线程池大小
        taskExecutor.setKeepAliveSeconds(1000);// 空闲时间
        taskExecutor.setMaxPoolSize(10);// 线程池最大线程数
        taskExecutor.setQueueCapacity(25);// 最大等待任务数
        taskExecutor.initialize();
        return taskExecutor;

    }

}
