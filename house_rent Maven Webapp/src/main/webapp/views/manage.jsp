<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>首页</title>
<link rel="stylesheet" type="text/css" href="../css/manage.css">
<link rel="stylesheet" type="text/css" href="../css/sah.css">
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="../js/manage.js"></script>
</head>
<body>
	<div class="header">
		<div>
			<p>
				<img src="../imgs/login.jpg" />
			</p>
			<p>HouseMaster</p>
		</div>
		<div>
			<p>
				<span>${mgr.managerName}</span><span><a href="loginvalid">退出登录</a></span>
			</p>
		</div>
	</div>
	<div class="middle">
		<div class="middle-left">
			<ul>
				<li class="showallhouse">所有房源</li>
				<li class="already-sole">已租房源</li>
				<li class="un-sole">空置房源</li>
				<li class="renter-info">租客信息</li>
			</ul>
		</div>
		<div class="middle-right">
			<div class="show-part">
			    
			</div>
		</div>
	</div>
</body>
</html>
