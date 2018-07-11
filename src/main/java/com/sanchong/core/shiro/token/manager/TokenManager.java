package com.sanchong.core.shiro.token.manager;

import org.apache.shiro.SecurityUtils;

import com.sanchong.bean.UUser;
import com.sanchong.core.shiro.token.ShiroToken;



public class TokenManager {
	
	/**
	 * 获取当前登录的用户User对象
	 * @return
	 */
	public static UUser getToken(){
		UUser token = (UUser)SecurityUtils.getSubject().getPrincipal();
		return token ;
	}
	/**
	 * 登录
	 * @param user
	 * @param rememberMe
	 * @return
	 */
	public static UUser login(UUser user,Boolean rememberMe){
		ShiroToken token = new ShiroToken(user.getEmail(), user.getPswd());
		token.setRememberMe(rememberMe);
		SecurityUtils.getSubject().login(token);
		return getToken();
	}
}
