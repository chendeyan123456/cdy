package com.sanchong.core.shiro.token;

import java.util.Date;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.sanchong.bean.UUser;
import com.sanchong.service.UserService;

public class SampleRealm extends AuthorizingRealm {
	@Autowired
	public UserService userService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		// TODO Auto-generated method stub
		ShiroToken token=(ShiroToken)authenticationToken;
		UUser uuser=userService.login(token.getUsername(), token.getPswd());
		if(uuser==null){
			throw new AccountException("账号密码不正确!");
		}else if(UUser._0.equals(uuser.getStatus())){
			throw new DisabledAccountException("禁止登录!");
		}else{
			uuser.setLastLoginTime(new Date());
			
		}
		return null;
	}

}
