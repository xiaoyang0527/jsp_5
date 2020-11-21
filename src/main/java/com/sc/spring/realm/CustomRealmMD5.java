package com.sc.spring.realm;

import com.sc.spring.entity.SysPermission;
import com.sc.spring.entity.SysUser;
import com.sc.spring.service.SysPermissionService;
import com.sc.spring.service.SysUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名：CustomRealm
 * 描述：一段话描述类的信息
 * 作者：xy
 * 日期：2020/10/22 19:42
 * 版本：V1.0
 */
public class CustomRealmMD5 extends AuthorizingRealm {
    @Autowired
    SysUserService sysUserService;

    @Autowired
    SysPermissionService sysPermissionService;

    //用户授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("进入自定义realm+md5进行授权");
        SysUser sysUser=(SysUser)principalCollection.getPrimaryPrincipal();

        String userName =sysUser.getUsercode();
        System.out.println("需要查询拥有权限的用户名是："+userName);



        //模拟用户拥有权限资源名称
        List<String> list=new ArrayList<String>();
//        list.add("user:add");//用户添加功能
//        list.add("user:update");//用户修改功能
//        list.add("user:delete");//用户删除功能
//        List<SysPermission> sysPermissionlist= SysPermissionService.selectPerms(userName);
        List<SysPermission> sysPermissions=sysPermissionService.selectPerms(userName);
        if(sysPermissions!=null&&sysPermissions.size()>0){
            for (SysPermission sysPermission : sysPermissions) {
                String percode=sysPermission.getPercode();
                if(percode!=null&&!percode.equals("")){
                    System.out.println("该用户拥有的权限是:"+percode);
                    list.add(percode);
                }
            }
        }


        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addStringPermissions(list);

        return info;
    }




    //用户认证

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("进入MD5验证");
        String userName=(String)authenticationToken.getPrincipal();
        System.out.println("需要认证的用户名是:"+userName);

        //通过账号查询数据库，获取用户对象
        SysUser sysUser =sysUserService.login(userName);

        if(sysUser==null){
            System.out.println("该账户不存在");
            return null;//该账户不存在

        }

        System.out.println("该账户存在");
        String userPassword=sysUser.getPassword();
        String salt =sysUser.getSalt();



        SimpleAuthenticationInfo info=new
                SimpleAuthenticationInfo
                (sysUser,userPassword,ByteSource.Util.bytes(salt),
                        this.getName());

        return info;
    }
}
