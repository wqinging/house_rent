$(function(){
	$("#submitBotton").click(function(){
		var name= $("#renterName").text();
		var pnumber = $("#rentPnumber").val();
		var houseid = $("#houseId").val();
		$.post("updateRenterInfo",
				{
			      renterName : name,
			      rentPnumber : pnumber,
			      houseId : houseid,
		       },
		function(html){
			$(".show-part").html(html);
		})
	})
	
	
	
	
})
