package com.sc.spring.service.impl;

import com.sc.spring.entity.SysPermission;
import com.sc.spring.entity.SysUser;
import com.sc.spring.entity.SysUserExample;
import com.sc.spring.mapper.SysPermissionMapper;
import com.sc.spring.mapper.SysUserMapper;
import com.sc.spring.service.SysPermissionService;
import com.sc.spring.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类名：UserinfoServiceImpl
 * 描述：一段话描述类的信息
 * 作者：xy
 * 日期：2020/10/20 19:24
 * 版本：V1.0
 */
@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    SysPermissionMapper sysPermissionMapper;


    @Override
    public List<SysPermission> selectPerms(String userName) {
        if(userName!=null&&!userName.equals("")){
            return sysPermissionMapper.selectPerms(userName);
        }

        return null;
    }
}
