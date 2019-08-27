
function phoneverify(phone) {
    var phonehint = document.getElementById("phonehint");
    if(!(/^1[3456789]\d{9}$/.test(phone))){
        phonehint.innerText="手机号码有误，请重填!";
    }else{
        phonehint.innerText="";
    }
}
function verificationcode(code) {
    var verification_codehint = document.getElementById("verification_codehint");
    if(code!="4je3"){
        verification_codehint.innerText="验证码有误！";
    }else{
        verification_codehint.innerText="";
    }
}
function passwordhint1(pass) {
    var passwordhint1 = document.getElementById("passwordhint1");
    if(pass.length >= 6){
        passwordhint1.innerText="";
    }else{
        passwordhint1.innerText="密码长度必须大于6";
    }
}
function passwordhint12(pass2) {
    var pass1 = $("input[name='password1']").val();
    var passwordhint12 = document.getElementById("passwordhint2");
    if(pass1==pass2){
        passwordhint12.innerText="";
    }else{
        passwordhint12.innerText="两次密码不一致！";
    }
}
function getcode() {
    $.ajax({
        type:"post",
        url:"UsersController/getCode.do",
        date:"",
        success:function(obj) {
            alert("验证码为："+obj);
            var but = $(".aui-form-list .aui-child");
            but.attr("disabled",true);
            var i = 60;
            var a = window.setInterval(function () {
                but.val("还剩"+i+"秒");
                if(i==0){
                    but.removeAttr("disabled");
                    but.val("获取验证码");
                    $(".aui-form-list .aui-hint").val(-1);
                    clearInterval(a);
                }
                i--;
            },1000);
        }
    });
}


