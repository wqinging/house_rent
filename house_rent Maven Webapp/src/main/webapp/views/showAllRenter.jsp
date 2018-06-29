<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>租客信息</title>
<link rel="stylesheet" type="text/css" href="../css/showAllRenter.css">
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="../js/showAllRenter.js"></script>
<style>
h3{
   display: inline-block;
}
</style>

</head>

<body>
	<div>
	   <h3>租客搜索:</h3><input type="text" id="searchRenter" value="请输入租客姓名" ><input type="button" id="searchButton" value="查找租客">
	   <input type="button" class="addRenterButton" value="添加租客"/>
	</div>
	<c:if test="${!empty renterList}">
	<div>
		<form>
			<table border="1px">
			    <tr>
			    <th colspan="7">租客信息</th>
			    </tr>
				<tr>
					<td>租客编号</td>
					<td>租客姓名</td>
					<td>电话号码</td>
					<td>证件号码</td>
					<td>租房编号</td>
					<td colspan="2">其他操作</td>
				</tr>
				<c:forEach items="${renterList}" var="list">
					<tr>
						<td>${list.rentId}</td>
						<td>${list.renterName}</td>
						<td>${list.rentPnumber}</td>
						<td>${list.idCard}</td>
						<td>${list.houseId}</td>
						<td><a href="javascript:cgRenterInfo('${list.renterName}')">更改租客信息</a></td>
						<td><a href="javascript:deleteRenter('${list.renterName}')">删除此租客</a></td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</div>
	</c:if>
</body>
</html>
