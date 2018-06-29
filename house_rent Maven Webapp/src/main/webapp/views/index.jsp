<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>房屋租赁管理系统</title>
<link rel="stylesheet" type="text/css" href="../css/link.css">
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="../js/index.js"></script>
</head>
<body>
	<div>
		<div class="header" id="header">
			<h2>房屋租赁管理系统</h2>
			<div>
				<button id="signin">注册go</button>
				<button id="signup">登录go</button>
			</div>
		</div>

		<div class="group1">
			<div class="loginform" id="login">
				<div class="header-item">
					<h3>登录</h3>
				</div>
				<form id="loginForm" action="login" method="post">
						<c:if test="${error != null}">
							<div class="p-item">
								<p>${error}</p>
							</div>
						</c:if>
						<div class="input-item">
							<span>用户:</span> <input type="text" name="managerName" required />
						</div>
						<div class="input-item">
							<span>密码:</span> <input type="password" name="managerPassword" required />
						</div>
						<div class="button-item">
							<input type="submit" value="登录" />
						</div>
				</form>
			</div>
           </div>
           <div class="group2">
			<div class="registerform" id="register">
				<div class="header-item">
					<h3>注册</h3>
				</div>
				<form id="registerForm" action="register" method="post" onsubmit="return check(this)">
					<div class="input-item">
						<span>用户:</span> <input type="text" name="managerName" id="managerName"/><label class="nametip"></label>
					</div>
					<div class="input-item">
						<span>密码:</span> <input type="password" name="managerPassword" id="managerPassword"/><label class="passwordtip"></label>
					</div>
					<div class="input-item">
						<span>手机:</span> <input type="text" name="phoneNumber" id="phoneNumber"/><label class="pNumbertip"></label>
					</div>
					<div class="button-item">
						<input type="submit" value="注册" />
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- <div id="footer">
		<p>版权所有</p>
	</div> -->
</body>
</html>
