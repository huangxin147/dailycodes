package com.itheima.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 编写异常处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    /**
     * 跳转到具体错误页面的方法
     * @param request
     * @param response
     * @param handler
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
        e.printStackTrace();
        SysException se=null;
        //获取异常对象
        if (e instanceof SysException){
            se= (SysException) e;
        }else{
            se=new SysException("请联系管理员");
        }
        ModelAndView mv = new ModelAndView();
        //存入错误的提示信息
        mv.addObject("message",se.getMessage());
        //跳转到jsp页面
        mv.setViewName("error"); //跳转到WEB-INF/pages/error.jsp
        return mv;
    }
}
