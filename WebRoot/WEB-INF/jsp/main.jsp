<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Document</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/main.css">
  </head>
  
	<body>
	<header>
		<div class="nav">
			<span>在线任务系统</span>
			<c:if test="${userName==null}">
				<span id="login">
					<label onclick="window.location.href='login'">登录</label>
				</span>
			</c:if>
			<c:if test="${userName!=null}">
				<span id="login">
					<label onclick="">${userName}</label>
				</span>
			</c:if>			
		</div>
	</header>
	<div class="container">
		<div class="content">
			<img src="img/1.jpg">
		</div>
		<div class="content">
			<ul>
				<li class="borderClass right">
					<span class="title">
						最新操作
						
					</span>
				</li>
				<li class="borderClass leftTop">
					<span class="title">最新任务</span>
					<ol>
						<c:forEach var="taskInfo" items="${module1}">
							<li>
								<label>${taskInfo.info}</label>
								<label class="date">${taskInfo.time}</label>
							</li>
						</c:forEach>
					</ol>
					<a href="#" class="more">更多>></a>
				</li>
				<li class="borderClass leftBottom">
					<span class="title">
						已完成任务
					</span>
					<ol>
						<c:forEach var="finishInfo" items="${module2}">
							<li>
								<label>${finishInfo.info}</label>
								<label class="date">${finishInfo.time}</label>
							</li>
						</c:forEach>
					</ol>
					<a href="#" class="more">更多>></a>
				</li>
				
			</ul>
		</div>
	</div>
	<footer>
		Copyright
	</footer>	
	</body>
</html>
