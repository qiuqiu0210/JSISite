/**
 * Created by songliu on 14-8-25.
 * 测试Ajax登录功能
 */
function toLogin() {
    var username = $("#username").val().replace(/^\s+|\s+$/g, "");
    var password = $("#password").val();
    if (username == "" && password == "") {
        $("#message label").html("请输入用户名和密码");
        $("#username").focus();
        return;
    }
    if (username =="") {
        $("#message label").html("请输入用户名");
        $("#username").focus();
        return;
    }
    if (password =="") {
        $("#message label").html("请输入密码");
        $("#password").focus();
        return;
    }
//    $("#message label").html("正在验证，请稍后...")
    $.ajax({
        url: "Login.action",
        type: "post",
        data: {
            username: username,
            password: password
        },
        dataType: "test",
        success: function (test) {
            if (test == "error") {
                $("#message label").html("用户名或密码错误");
            }
            else if (test == "correct") {
                window.location.href = "Login.action"
            }
            else {
                $("#message label").html("登录错误");
            }
        }
    });
}

$(document).ready(function () {
    $("button").button();
    $("#btn_login").click(function () {
        toLogin();
    });
    document.onkeydown = function (evt) {
        var e = evt || event;
        if (e.keyCode == 13) {
            toLogin();
        }
    };
});