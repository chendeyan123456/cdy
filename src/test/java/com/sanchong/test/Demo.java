package com.sanchong.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sanchong.dao.TestDao;
import com.sanchong.util.SpringContextUtil;

public class Demo {
	@Test
	public void find(){
		ApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
		TestDao test=SpringContextUtil.getBean(TestDao.class);
		List<Map> students=test.findData();
		System.out.println(students.get(0).get("name"));
	}
}
