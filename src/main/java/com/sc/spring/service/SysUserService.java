package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysUser;
import com.sc.spring.entity.Userinfo;

/**
 * 类名：UserinfoService
 * 描述：一段话描述类的信息
 * 作者：xy
 * 日期：2020/10/20 19:21
 * 版本：V1.0
 */
public interface SysUserService {
    public SysUser login(String userName);


}
