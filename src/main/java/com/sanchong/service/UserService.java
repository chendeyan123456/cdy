package com.sanchong.service;

import com.sanchong.bean.UUser;

public interface UserService {
	public UUser login(String username,String pswd);
	public void updateByPrimaryKeySelective(UUser uuser);
}
