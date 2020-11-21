package com.sc.spring.controller;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.Userinfo;
import com.sc.spring.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/**
 * 类名：LoginController
 * 描述：一段话描述类的信息
 * 作者：xy
 * 日期：2020/10/17 16:09
 * 版本：V1.0
 */

@Controller
@RequestMapping("/userinfoctrl")
public class UserinfoController {
    @Autowired
    UserinfoService userinfoService;

    @RequestMapping("/selectpage.do")
    public ModelAndView selectpage(ModelAndView mav,
                      @RequestParam(defaultValue ="1" )int pagenumber,
                      @RequestParam(defaultValue ="2")int pagesize){
        System.out.println("进入分页方法");
        PageInfo<Userinfo> pageinfo = userinfoService.selectpage(pagenumber, pagesize);

        mav.addObject("pageinfo",pageinfo);
        mav.setViewName("userinfolist");
        return mav;
    }

    @RequestMapping("/test.do")
    public ModelAndView login(ModelAndView mav){
        System.out.println("进入业务方法");
        mav.setViewName("test");
        return mav;
    }

    @RequestMapping("/upload.do")
    public ModelAndView upload(ModelAndView mav,
                            MultipartFile upload,
                               HttpSession session) throws IOException {
        System.out.println("进入了上传方法");

        if(upload!=null){
            String filename = upload.getOriginalFilename();
            if(!StringUtils.isEmpty(filename))
            {
                String path = session.getServletContext().getRealPath("upload");
                System.out.println("路径是：" + path);
                File file = new File(path + "/" + filename);
                upload.transferTo(file);

                mav.addObject("filename",filename);
            }
        }

        mav.setViewName("success");
        return mav;
    }



}
