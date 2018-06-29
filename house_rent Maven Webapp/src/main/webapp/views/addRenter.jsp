<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>添加租客</title>
<style>
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="../js/addRenter.js"></script>
form{
   margin-top:30px;
}
td{
   padding:20px 0px;
}  
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

input[type='submit']{
   width: 148px;
}
.rentadd{
    padding-left: 63px;
}
</style>
</head>

<body>
	<div id="top">
			<h1>添加租客</h1>
		</div>

	<form action="addRenterAction" method="post">
		<table>
			<tr>
				<td>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:<input type="text" name="renterName" /></td>
			</tr>
			<tr>
				<td>电话号码:<input type="text" name="rentPnumber" /></td>
			</tr>
			<tr>
				<td>证件号码:<input type="text" name="idCard" /></td>
			</tr>
			<tr>
				<td class="rentadd"><input type="submit" value="添加" class="addRenter"></td>
			</tr>
		</table>
	</form>
</body>
</html>
