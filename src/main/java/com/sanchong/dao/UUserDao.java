package com.sanchong.dao;

import java.util.Map;

import com.sanchong.bean.UUser;

public interface UUserDao {
	public UUser login(Map<String,Object> map);
	public int updateByPrimaryKeySelective(UUser uuser);
}
