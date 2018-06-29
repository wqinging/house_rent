
$(function() {
	$(".addHouse").click(function() {
		$.get("showAddHousePage",
			function(html) {
				$(".show-part").html(html);
			})
	})

	$(".search-button").click(function() {
		$.get("findHouseByName", {
			name : $("#name").val(),
		},
			function(html) {
				$(".show-part").html(html);
			})


	})

})

function preOrnext(pageNum, totalPage, renter, rentStartTime) {
	$.get("preOrnext",
		{
			pageNum : pageNum,
			totalPage : totalPage,
			renter : renter,
			rentStartTime : rentStartTime
		},
		function(html) {
			$(".show-part").html(html);
		})
}

function checkhouseinfo(name) {
	$.get("checkHouseInfo",
		{
			name : name,
		},
		function(html) {
			$(".show-part").html(html);
		})
}

function deletehouseinfo(name) {
	$.get("deletehouseinfo",
		{
			name : name,
		},
		function(html) {
			$(".show-part").html(html);
		})
}


