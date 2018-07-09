<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();

String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	  <script  src="<%=basePath%>/js/jquery/jquery1.8.3.min.js"></script>
	  <script type="text/javascript">
	  	$(function(){
	  		//登录
	  		$("#submit").click(function(){
		  			$.ajax({
			  			url:"<%=basePath%>/submitLogin.shtml",
			  			data:$("form").serialize(),
			  			dataType:"json",
			  			type:"post",
			  			success:function(data){
			  				if(data.code==200){
			  					alert(data.msg);
			  				}
	  					}
	  		
	  				});
	  		});
	  		//跳转注册页面
	  		$("#register").click(function(){
	  			window.location.href="register.shtml";
	  		});
	  	});
	  
	  </script>
  </head>
  
  <body>
	<form action=""  >
		用户名:<input type="text" name="account" class="username" />
		<br/>
		密码:<input type="password"  name="password" class="password" />
		<br/>
		<input type="checkbox" name="remenberMe" />记住我
		<br>
		<input type="button" value="登录" id="submit"/>
		<input type="button" id="register" value="注册"/>
	</form>
  </body>
</html>
