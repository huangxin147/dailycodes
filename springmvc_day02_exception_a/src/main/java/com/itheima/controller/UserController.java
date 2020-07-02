package com.itheima.controller;


import com.itheima.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testExcption")
    public String testExcption() throws SysException{
        System.out.println("执行了testExcption方法");
        try {
            int a=10/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("服务器繁忙,请稍后再试...");

        }
        return "success";
    }

}
