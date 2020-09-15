package com.aibaiyang.idemo.filter;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.aibaiyang.idemo.entity.Account;
import com.aibaiyang.idemo.service.AccountService;
import com.aibaiyang.idemo.util.SpringContextUtil;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author Jone Guo
 * @Date 2020/9/15 15:26
 * @Description
 **/
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // 从上下文中拿到Bean
        AccountService accountService = (AccountService) SpringContextUtil.getBean(AccountService.class);
//        Account account = accountService.findByName("by");
//        System.out.println(JSONUtil.toJsonStr(account));
        // do something 处理request 或response
        System.out.println("filter1");
        // 调用filter链中的下一个filter
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }


}
