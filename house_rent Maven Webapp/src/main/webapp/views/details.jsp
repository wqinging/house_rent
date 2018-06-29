<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>房子详情</title>
<link rel="stylesheet" href="../css/details.css" />
</head>

<body>
	<div>
		<div id="top">
			<h1>房源信息修改</h1>
		</div>

		<div id="buttom">
			<div id="buttom_left">
				<div class="imgContaner">
					<img src="../imgs/${house.image}" id="s2" />
				</div>
			</div>
			<div id="buttom_middle">
				<div class="messages-middle">
					<form action="changeHouseInfo" method="post" enctype="multipart/form-data">
						
						<p>
							<span>I_D:</span>${house.id}<input type="text" name="id"
								value="${house.id}" />
						</p>
						<p>
							<span>名称:</span>${house.name}<input type="text" name="name"
								value="${house.name}" />
						</p>
						<p>
							<span>价格:</span>${house.price}<input type="text" name="price"
								value="${house.price}" />
						</p>
						<p>
							<span>地址:</span>${house.address} <input type="text"
								name="address" value="${house.address}" />
						</p>
						<p>
							<span>房屋户型:</span>${house.huxing}<input type="text" name="huxing"
								value="${house.huxing}" />
						</p>
						<p>
							<span>面积:</span>${house.area} <input type="text" name="area"
								value="${house.area}" />
						</p>
						<p>
							<span>楼层:</span>${house.floor}<input type="text" name="floor"
								value="${house.floor}" />
						</p>
						<p>
							<span>朝向:</span>${house.chaoxiang}<input type="text"
								name="chaoxiang" value="${house.chaoxiang}" />
						</p>
						<p>
							<span>地铁:</span>${house.subway}<input type="text" name="subway"
								value="${house.subway}" />
						</p>
						<p>
							<span>装修:</span>${house.descoration}<input type="text"
								name="descoration" value="${house.descoration}" />
						</p>
						<p>
							<span>图片:</span>${house.image}<input type="text" name="image" value="${house.image}"/><input type="file" name="photo"/>
						</p> 
						<p>
							<span>租住人:</span>${house.renter}<input type="text" name="renter"
								value="${house.renter}" />
						</p>
						<p>
							<span>租住开始时间:</span>${house.rentStartTime}<input type="text"
								name="rentStartTime" value="${house.rentStartTime}" />
						</p>
						<p>
							<span>租住结束时间:</span>${house.rentEndTime}<input type="text"
								name="rentEndTime" value="${house.rentEndTime}" />
						</p>
						<p>
							<span> <input type="submit" value="确认修改" /></span>
						</p>
					</form>
				</div>

			</div>
			
		</div>
	</div>

</body>
</html>
