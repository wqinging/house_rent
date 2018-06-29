<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>房源信息</title>
<link rel="stylesheet" href="../css/sah.css" />
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="../js/paging.js"></script>
</head>
<body>

    <div class="search-house">
			  <h3>房源搜索:</h3><input type="text" name="name" id="name" value="请输入房源名称"/><input type="button" class="search-button" value="搜索"/>
			  <input type="button" class="addHouse" value="添加房源">
			</div> 
	<c:if test="${!empty houseList}">
		<div>
			<ul class="house-list">
				<c:forEach items="${houseList}" var="list">
					<li>
						<div>
							<img src="../imgs/${list.image}" />
						</div>
						<div>
							<h1>
								<a href="#">${list.name}</a>
							</h1>
							<p>地址:${list.address}</p>
							<p>楼层:${list.floor}</p>
							<p>地铁:${list.subway}</p>
						</div>
						<div class="house-list-price">
							<p>
								价格:<span class="house_price">${list.price}</span>元/月
							</p>
							<p>
								<a href="javascript:checkhouseinfo('${list.name}')">修改房源信息</a>
							</p>
							<p>
								<a href="javascript:deletehouseinfo('${list.name}')">删除此房源</a>
							</p>
						</div>
					</li>
				</c:forEach>
			</ul>
		</div>


		<c:if test="${pageNum != null}">
			<div class="page-item">
				<p>
					<c:if test="${pageNum > 1}">
						<span><a
							href="javascript:preOrnext('${pageNum-1}','${totalpage}','${renter}','${rentStartTime}')">上一页</a></span>
					</c:if>
					<c:if test="${pageNum <= 1}">
						<span>上一页</span>
					</c:if>
					<c:if test="${pageNum < totalpage}">
						<span><a
							href="javascript:preOrnext('${pageNum+1}','${totalpage}','${renter}','${rentStartTime}')">下一页</a></span>
					</c:if>
					<c:if test="${pageNum >= totalpage}">
						<span>下一页</span>
					</c:if>
					<span>当前${pageNum}/${totalpage}页</span>
				</p>
			</div>
		</c:if>

	</c:if>



	<c:if test="${empty houseList}">
		<div>没有合适的房源</div>

	</c:if>
</body>

</html>
