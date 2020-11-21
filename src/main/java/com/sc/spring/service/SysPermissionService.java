package com.sc.spring.service;

import com.sc.spring.entity.SysPermission;


import java.util.List;

/**
 * 类名：UserinfoService
 * 描述：一段话描述类的信息
 * 作者：xy
 * 日期：2020/10/20 19:21
 * 版本：V1.0
 */
public interface SysPermissionService {

    List<SysPermission> selectPerms(String userName);


}
