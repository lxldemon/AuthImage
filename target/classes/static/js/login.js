$(document).ready(function() {

    $(".button-login button").bind("click",function () {
        $.post("/loginsubmit",{
            username:$("#username").val(),
            password:$("#password").val()
        },function(result){
            if(result.code==0){
               location.href="index.html";
            }else{
                alert("登录失败");
            }
        });
    })
});