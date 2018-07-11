package com.sanchong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sanchong.util.RadomUtil;
import com.sanchong.util.ShiroResult;

@Controller
public class UserLoginController {
	  
	    /**  
	    * @Title: login  
	    * @Description: 跳转到登录界面 
	    * @param @return    参数  
	    * @return ModelAndView    返回类型  
	    * @throws  
	    */  
	    
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(){
		//跳转到登录页面
		return new ModelAndView("/user/login");
	}
	
	@RequestMapping(value="/loginSubmit",method=RequestMethod.GET)
	public ModelAndView loginSubmit(){
		
		//跳转到登录页面
		return new ModelAndView("/user/login");
	}
	    /**  
	    * @Title: register  
	    * @Description: 跳转到注册页面
	    * @param @return    参数  
	    * @return ModelAndView    返回类型  
	    * @throws  
	    */  
	    
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView register(){
		//跳转到登录页面
		return new ModelAndView("/user/register");
	}
	
	 /**  
	    * @Title: register  
	    * @Description: 获取验证码
	    * @param @return    参数  
	    * @return ModelAndView    返回类型  
	    * @throws  
	    */  
	    
	@RequestMapping(value="/getGifCode",method=RequestMethod.GET)
	@ResponseBody
	public ShiroResult getGifCode(HttpServletRequest req){
		String vcode=RadomUtil.generateString(5);
		req.getSession().setAttribute("svcode", vcode);
		
		return ShiroResult.build(200,"生成验证码成功",vcode);
	}
}
