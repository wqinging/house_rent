<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>添加租客</title>
<link rel="stylesheet" style="text/css" href="${pageContext.request.contextPath}/css/addHouse.css" />
</head>
<body>
	<div id="top">
		<h1>添加房源</h1>
	</div>

	<form action="insertHouseInfo" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>名称:<input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>价格:<input type="text" name="price" /></td>
			</tr>
			<tr>
				<td>地址:<input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>户型:<input type="text" name="huxing" /></td>
			</tr>
			<tr>
				<td>面积:<input type="text" name="area" /></td>
			</tr>
			<tr>
				<td>楼层:<input type="text" name="floor" /></td>
			</tr>
			<tr>
				<td>朝向:<input type="text" name="chaoxiang" /></td>
			</tr>
			<tr>
				<td>地铁:<input type="text" name="subway" /></td>
			</tr>
			<tr>
				<td>装修:<input type="text" name="descoration" /></td>
			</tr>
			<tr>
				<td>图片:<input type="file" name="image" /></td>
			</tr>
			<tr>
				<td class="sum"><input class="button" type="submit" value="添加" /></td>
			</tr>
		</table>


	</form>
</body>
</html>
