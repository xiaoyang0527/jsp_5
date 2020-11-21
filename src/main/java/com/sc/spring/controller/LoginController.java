package com.sc.spring.controller;

import com.sc.spring.entity.SysUser;
import com.sc.spring.entity.Userinfo;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 类名：LoginController
 * 描述：一段话描述类的信息
 * 作者：xy
 * 日期：2020/10/17 16:09
 * 版本：V1.0
 */

@Controller
@RequestMapping("/loginctrl")
public class LoginController {

    @RequestMapping("/login.do")
    public ModelAndView login(ModelAndView mav, HttpServletRequest request){
        System.out.println("用户登录失败");

        String msg=
        (String)request.getAttribute
                (FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);

        System.out.println("失败消息:"+msg);

        String isfail="";

        if(msg!=null){
            if(msg.equals(UnknownAccountException.class.getName())){
                //账号不存在
                isfail="unknown";
            }else if(msg.equals(IncorrectCredentialsException.class.getName())){
                //账号密码错误
                isfail="error";
            }else if(msg.equals("randomCodeError")){
                //验证码错误
                isfail="codeerror";
            }else {
                //未知错误
                isfail="other";
            }
        }

        mav.setViewName("redirect:../login.jsp?isfail="+isfail);



        return mav;
    }

    //登陆成功的方法
    @RequestMapping("/main.do")
    public ModelAndView main(ModelAndView mav,HttpSession seesion){
        System.out.println("用户登录成功");

        Subject subject = SecurityUtils.getSubject();
        SysUser nowuser = (SysUser)subject.getPrincipal();
        seesion.setAttribute("nowuser",nowuser);

        mav.setViewName("redirect:../main.jsp");
        return mav;

    }
}
