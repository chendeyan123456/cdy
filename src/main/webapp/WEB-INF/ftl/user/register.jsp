<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
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
			//页面一刷新生成验证码
			generateCode();
			//点击生成验证码
			$("#svcode").click(function(){
				generateCode();
			
			});
			function generateCode(){
				$.get('<%=basePath%>/getGifCode.shtml',function(data,status){
					$("#svcode").text(data.data);
				})
			}
			//跳转注册页面
	  		$("#login").click(function(){
	  			window.location.href="login.shtml";
	  		});
	
	});
		
	
	
	</script>
  </head>
  
  <body>
  <form >
  	   用户名:<input type="text" name="username"/><br>
   	登录密码:<input type="password" name="password"/><br>
   	验证码:<input type="text" name="vcode" size="10"/><span id="svcode"></span><br>
   	<input type="button" value="注册"/>
   	<input type="button" value="已注册登录" id="login">
  </form>

  </body>
</html>
