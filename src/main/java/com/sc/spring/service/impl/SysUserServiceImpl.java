package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysUser;
import com.sc.spring.entity.SysUserExample;
import com.sc.spring.entity.Userinfo;
import com.sc.spring.entity.UserinfoExample;
import com.sc.spring.mapper.SysUserMapper;
import com.sc.spring.mapper.UserinfoMapper;
import com.sc.spring.service.SysUserService;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.apache.shiro.authc.UsernamePasswordToken;
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
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser login(String userName) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();

        if (userName != null) {
            criteria.andUsercodeEqualTo(userName);

            List<SysUser> list = sysUserMapper.selectByExample(example);
            if (list != null && list.size() > 0) {
                return list.get(0);
            }
        }

        return null;
    }
}
