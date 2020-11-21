package com.sc.spring.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 类名：MyException
 * 描述：一段话描述类的信息
 * 作者：xy
 * 日期：2020/10/19 19:53
 * 版本：V1.0
 */

public class MyException implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        System.out.println("异常是:"+e.getMessage());
        ModelAndView mav=new ModelAndView();
        mav.setViewName("exception");
        return mav;
    }
}
