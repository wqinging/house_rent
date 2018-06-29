$(function() {
	showAllHouse();
	
	$(".showallhouse").click(function() {
		showAllHouse();
	})
	$(".already-sole").click(function() {
		already_sole();
	})
	$(".un-sole").click(function() {
		un_sole();
	})
	$(".renter-info").click(function() {
		renter_info();
	})

	function showAllHouse() {
		$.ajax({
			type : "get",
			url : "getAllHouse",
			success : function(html) {
				$(".show-part").html(html);
			}
		})
		$(".showallhouse").css("background-color", "white");
		$(".showallhouse").siblings().css("background-color", "#EAEFF8");
	}


	function already_sole() {
		$.get("getAllHouse",
			{
				renter : 'isexist',
				rentStartTime : 'isexist',
			},
			function(html) {
				$(".show-part").html(html);
			})
		$(".already-sole").css("background-color", "white");
		$(".already-sole").siblings().css("background-color", "#EAEFF8");
	}


	function un_sole() {
		$.get("getAllHouse",
			{
				renter : 'isexist',
			},
			function(html) {
				$(".show-part").html(html);
			})


		$(".un-sole").css("background-color", "white");
		$(".un-sole").siblings().css("background-color", "#EAEFF8");
	}


	function renter_info() {
		$.get("showAllRenter",
			function(html) {
				$(".show-part").html(html);
			})
		$(".renter-info").css("background-color", "white");
		$(".renter-info").siblings().css("background-color", "#EAEFF8");
	}






})