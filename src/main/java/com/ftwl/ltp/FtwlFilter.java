package com.ftwl.ltp;

import com.ftwl.frame.context.ThreadInitCenter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by inaeh on 2017/11/16.
 */
public class FtwlFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        //分页信息至线程缓存,如果以HEADER中的参数为优先
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String start = request.getHeader("start");
        String limit = request.getHeader("limit");
        //线程开始前初始化
        ThreadInitCenter.init(request.getRequestURI(), start, limit, "", "test");
        //处理业务
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            ThreadInitCenter.end();
        }
    }

    @Override
    public void destroy() {

    }
}