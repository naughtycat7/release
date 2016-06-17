<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<form action="login" method="post">
	    <p>
	    	<lebal>用户名：</label>
	    	<input name="username" id="username" type="text"></input>
	    </p>
	    <p>
	    	<lebal>密&nbsp;&nbsp;码：</label>
	    	<input name="password" id="password" type="text"/>
	    </p>
	    <p>
	    	<input type="button" value="清除"/>
	    	<input type="submit" value="登录">
	    </p>
	 </form>
  </body>
</html>
