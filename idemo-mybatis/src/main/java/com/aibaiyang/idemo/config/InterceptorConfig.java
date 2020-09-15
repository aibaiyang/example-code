package com.aibaiyang.idemo.config;

import com.aibaiyang.idemo.interceptor.LogInterceptor;
import com.aibaiyang.idemo.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Jone Guo
 * @Date 2020/9/15 15:42
 * @Description 拦截器配置类
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 拦截器顺序从上到下

        // 日志拦截器
        registry.addInterceptor(new LogInterceptor());
        // 全局拦截器
        registry.addInterceptor(new MyInterceptor());

    }

}
