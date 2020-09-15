package com.aibaiyang.idemo.config;

import com.aibaiyang.idemo.filter.MyFilter;
import com.aibaiyang.idemo.filter.SecurityFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Jone Guo
 * @Date 2020/9/15 15:28
 * @Description 过滤器配置类
 **/
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setName("myFilter");
        // 设置过滤器的顺序，数值越小越先执行
        filterRegistrationBean.setOrder(2);
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean registrationBean1() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SecurityFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setName("securityFilter");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }


}
