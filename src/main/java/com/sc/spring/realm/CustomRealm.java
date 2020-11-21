package com.sc.spring.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 类名：CustomRealm
 * 描述：一段话描述类的信息
 * 作者：xy
 * 日期：2020/10/22 19:42
 * 版本：V1.0
 */
public class CustomRealm extends AuthorizingRealm {


    //用户授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }


    //用户认证

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        String userName=(String)authenticationToken.getPrincipal();
        System.out.println("需要认证的用户名是:"+userName);

        if(!userName.equals("tom")){
            System.out.println("该账户不存在");
            return null;//该账户不存在

        }

        System.out.println("该账户存在，对比密码");
        String userPassword="666";

        SimpleAuthenticationInfo info=new
                SimpleAuthenticationInfo(userName,userPassword,this.getName());

        return info;
    }
}
