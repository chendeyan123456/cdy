package com.sanchong.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanchong.bean.UUser;
import com.sanchong.dao.UUserDao;
import com.sanchong.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	public UUserDao uuserdao;
	@Override
	public UUser login(String username, String pswd) {
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("username", username);
		map.put("pswd",pswd);
		return uuserdao.login(map);
	}
	@Override
	public void updateByPrimaryKeySelective(UUser uuser) {
		// TODO Auto-generated method stub
		uuserdao.
	}
	
}
