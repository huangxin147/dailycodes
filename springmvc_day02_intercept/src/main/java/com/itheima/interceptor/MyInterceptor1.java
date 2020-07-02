package com.itheima.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor1 implements HandlerInterceptor {
    /**
     * controller执行之前进行拦截的方法
     * return true 放行
     * return false 拦截
     * 可以使用转发或者重定向跳转到指定页面
     */

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        System.out.println("访问controller之前进行执行");
        return true;
    }
}
