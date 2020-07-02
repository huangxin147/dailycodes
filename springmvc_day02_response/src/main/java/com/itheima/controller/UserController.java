package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 返回字符串
     * @return
     */
    @RequestMapping(path = "/testReturnString")
    public String testReturnString(){
        System.out.println("执行了testReturnString方法");
        return "success";
    }

    /**
     * 请求参数的绑定(表单回显,传递User)
     */
    @RequestMapping(path = "/userUpdate")
    public String userUpdate(Model model){
        User user=new User();
        user.setUsername("张三");
        user.setPassword("123");
        user.setAge(16);
        model.addAttribute("user",user);
        return "update";
    }

    @RequestMapping(path = "/update")
    public String userUpdate(User user){
        System.out.println("执行UserController的update方法! user "+user);
        return "success";
    }

    // 无返回值
    @RequestMapping(path="/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("执行了testVoid方法！");
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //response.sendRedirect(request.getContextPath()+"/user/testReturnString");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        response.getWriter().print("你好");
        return;
    }
    @RequestMapping(path="/testModelAndView")
    public ModelAndView testModelAndView() throws ServletException, IOException {
        System.out.println("访问testModelAndView方法");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");

        //模型
        List<User> list=new ArrayList<>();
        User user=new User();
        user.setUsername("张三");
        user.setAge(22);
        User u2=new User();
        u2.setUsername("李四");
        u2.setAge(20);
        list.add(user);
        list.add(u2);
        modelAndView.addObject("list",list);
        return modelAndView;
    }
    /**
     * 使用forward关键进行请求转发
     * "forward:转发的jsp路径",不走视图解析器了,所以需要编写完整的路径
     * @return
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){
        System.out.println("testForwardOrRedirect方法执行了");
        //return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:/user/testReturnString";

    }

    @RequestMapping("/testJson")
    @ResponseBody
    public User  testJson(@RequestBody User user){
        System.out.println(user);
        User u=new User();
        u.setAge(20);
        u.setUsername("张三");
        u.setPassword("123");
        return u;

    }

}
