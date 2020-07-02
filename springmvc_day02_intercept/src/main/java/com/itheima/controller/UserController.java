package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    // 自定义拦截器
    @RequestMapping(path="/testInterceptor")
    public String testInterceptor(){
        System.out.println("执行了testInterceptor方法！");
        return "success";
    }
}
