<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>更改租客信息</title>
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="../js/updateRenter.js"></script>
<style type="text/css">
#top {
	margin: 0;
	width: 1080px;
	height: 35px;
	border: 1px solid #EBEBEB;
	background-color: #FCFCFC;
}

#top h1 {
	matgin: 5px 30px;
	font-size: 20px;
	display: inline-block;
}

tr {
	display: block;
	display: block;
	padding-bottom: 20px;
}

.updaterenter{
   width:200px;
}

</style>

</head>
<body>
	<div id="top">
		<h1>更改租客信息</h1>
	</div>
	<form action="updateRenterInfo" method="post">
		<table>
			<tr>
				<td>姓名:</td>
				<td id="renterName">${renter.renterName}</td>
			</tr>
			<tr>
				<td>电话号码:</td>
				<td><input type="text" name="rentPnumber" id="rentPnumber"
					value="${renter.rentPnumber}" /></td>
			</tr>
			<tr>
				<td>房子编号:</td>
				<td><input type="text" name="houseId" id="houseId"
					value="${renter.houseId}" /></td>
			</tr>
			<tr>
				<td  colspan="2"><input type="button" id="submitBotton"
					value="确认修改" class="updaterenter" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
