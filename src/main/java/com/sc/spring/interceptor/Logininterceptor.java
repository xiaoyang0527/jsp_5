package com.sc.spring.interceptor;

import com.sc.spring.entity.Userinfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 类名：Logininterceptor
 * 描述：一段话描述类的信息
 * 作者：xy
 * 日期：2020/10/19 18:45
 * 版本：V1.0
 */
public class Logininterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("1.进入业务方法之前");
        HttpSession session = request.getSession();
        Userinfo nowuser = (Userinfo)session.getAttribute("nowuser");

        if(nowuser!=null){
            System.out.println("当前登录用户是:"+nowuser);
            return true;
        }

        response.sendRedirect("../login.jsp?islogin=no");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("2.进入业务方法之后");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("3.完全结束");
    }
}
