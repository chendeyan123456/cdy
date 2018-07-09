package com.sanchong.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanchong.dao.TestDao;
import com.sanchong.service.TestService;
@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao dao;
	public List<Map> findStudent() {
		// TODO Auto-generated method stub
		List<Map> students=dao.findData();
		return students;
	}

}
