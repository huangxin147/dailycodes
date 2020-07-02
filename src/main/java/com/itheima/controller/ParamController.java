package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path= "/param") //一级路径
public class ParamController {

    //请求参数
    @RequestMapping(path= "/testParam") //二级路径
    public String testParam(User user){
        System.out.println("请求参数测试: User"+user);
        return "success";
    }

    @RequestMapping(path= "/saveAccount") //二级路径
    public String account(Account account){
        System.out.println("请求参数测试: "+account);
        return "success";
    }

    @RequestMapping(path= "/saveUser") //二级路径
    public String user(User user){
        System.out.println("请求参数测试: "+user);
        return "success";
    }
}
