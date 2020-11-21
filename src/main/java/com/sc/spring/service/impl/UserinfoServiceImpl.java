package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.Userinfo;
import com.sc.spring.entity.UserinfoExample;
import com.sc.spring.mapper.UserinfoMapper;
import com.sc.spring.service.UserinfoService;
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
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    UserinfoMapper userinfoMapper;

    @Override
    public Userinfo login(String userName, String userPassword) {
        UserinfoExample example=new UserinfoExample();
        UserinfoExample.Criteria criteria = example.createCriteria();

        if(userName!=null){
            criteria.andUserNameEqualTo(userName);
        }
        if (userPassword!=null){
            criteria.andUserPasswordEqualTo(userPassword);
        }

        List<Userinfo> list = userinfoMapper.selectByExample(example);

        if(list!=null&&list.size()>0){
            return list.get(0);
        }

        return null;
    }

    @Override
    public PageInfo<Userinfo> selectpage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Userinfo> list = userinfoMapper.selectByExample(null);
        PageInfo<Userinfo> pageInfo=new PageInfo<>(list);


        return pageInfo;
    }
}
