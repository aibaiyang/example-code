package com.aibaiyang.idemo.filter;

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
public class SecurityFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("filter2");
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }


}
