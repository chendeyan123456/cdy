package com.sanchong.controller.test;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanchong.service.TestService;
import com.sanchong.util.ShiroResult;


@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/interfaceTest",method=RequestMethod.GET)
	@ResponseBody
	public ShiroResult interfaceTest(){
		try {
			List<Map> students=testService.findStudent();
			return ShiroResult.build(200,"查询成功",students);
		} catch (Exception e) {
			// TODO: handle exception
			return ShiroResult.build(500,"查询失败", CollectionUtils.EMPTY_COLLECTION);
		}
		
		
	}
}
