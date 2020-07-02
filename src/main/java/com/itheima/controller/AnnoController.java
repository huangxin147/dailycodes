package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/anno")
public class AnnoController {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("name") String username,Integer age){
        System.out.println("hello SpringMVC!!,测试@RequestParam");
        System.out.println(username);
        System.out.println(age);
        return "success";
    }

    @RequestMapping("/testPathVariable/{id}/{name}")
    public String testPathVariable(@PathVariable(value = "id")Integer id,@PathVariable(value = "name")String username){
        System.out.println("执行方法 id:"+id+", name:"+username);
        return "success";
    }

    //ModelAttribute的用法
    @ModelAttribute //该注解定义的方法在执行的方法之前运行(Ps:是该类的所有方法都是提前调用该方法)
    public void showModel(User user){
        System.out.println("执行了showModel方法"+user);
        user.setBirthday(new Date());
        user.setUsername("小黄");
        user.setAge(28);
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println("执行方法 User:"+user);
        return "success";
    }
}
