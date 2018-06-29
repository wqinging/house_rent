$(function() {
	$(".addRenterButton").click(function() {
		$.get("addRenterPage",
			function(html) {
				$(".show-part").html(html);
			})
	})

	$("#searchButton").click(function() {
		$.get("selectRenterByName",
			{
				name : $("#searchRenter").val(),
			},
			function(html) {
				$(".show-part").html(html);
			})

	})
})

function deleteRenter(name) {
	$.post("deleterenter",
		{
			name : name,
		},
		function(html) {
			$(".show-part").html(html);
		})
}

function cgRenterInfo(name) {
	$.post("cheRenterInfo", {
		renterName : name,
	},
		function(html) {
			$(".show-part").html(html);
		})
}