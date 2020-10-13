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

        // 设置核心线程数
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        // 线程池大小
        taskExecutor.setCorePoolSize(5);
        // 空闲时间
        taskExecutor.setKeepAliveSeconds(1000);
        // 线程池最大线程数
        taskExecutor.setMaxPoolSize(10);
        // 最大等待任务数
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;

    }

}
