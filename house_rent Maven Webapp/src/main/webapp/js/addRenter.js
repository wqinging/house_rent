$(function() {
	$(".addRenter").click(function() {
		$.post("showAllRenter",
			function(html) {
				$(".show-part").html(html);
			})
	})
})