$(function() {

	$("button").click(function() {
		$("#login").toggle();
		$("#register").toggle();
		$("#signin").toggle();
		$("#signup").toggle();
	})

	$("#managerName").blur(checkName);
	$("#managerPassword").blur(checkPassword);
	$("#phoneNumber").blur(checkpNumber);
})
	function check(form) {
		var flag = true;
		if(checkName() == false){
			flag = false
		}
		if(checkPassword()==false){
			flag = false
		}
		if(checkpNumber()==false){
			flag = false
		} 
		   return flag;
	}

function checkName() {
	if ($("#managerName").val() == "") {
		$(".nametip").text("请输入用户名");
		return false;
	} else {
		$(".nametip").text("");
		return true;
	}
}
function checkPassword() {
	if ($("#managerPassword").val() == "") {
		$(".passwordtip").text("请输入密码");
		return false;
	} else {
		if ($("#managerPassword").val().length < 6) {
			$(".passwordtip").text("密码长度不能小于6位");
			return false;
		} else {
			$(".passwordtip").text("");
			return true;
		}
	}
}
function checkpNumber() {
	if ($("#phoneNumber").val() == "") {
		$(".pNumbertip").text("请输入电话号码");
		return false;
	} else {
		if ($("#phoneNumber").val().length != 11) {
			$(".pNumbertip").text("手机号码的长度为11位");
			return false;
		} else {
			$(".pNumbertip").text("");
			return true;
		}
	}
}