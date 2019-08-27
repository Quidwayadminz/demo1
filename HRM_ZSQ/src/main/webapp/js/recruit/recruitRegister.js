var phoneverifybool = false;
var verificationcodebool = false;
var passwordhint1bool = false;
var passwordhint2bool = false;
var codema;
var codemahintbool = false;
function submitUser(){
    if(phoneverifybool&&verificationcodebool&&passwordhint1bool&&passwordhint2bool&&codemahintbool){
            return true;
    }else{
        alert("请检查您的填写的信息是否正确！");
        return false;
    }
}

function phoneverify(phone) {
    var phonehint = document.getElementById("phonehint");
    if(!(/^1[3456789]\d{9}$/.test(phone))){
        phonehint.innerText="手机号码有误，请重填!";
        phoneverifybool = false;
    }else{
        phonehint.innerText="";
        phoneverifybool = true;
    }
}
function verificationcode(code) {
    var verification_codehint = document.getElementById("verification_codehint");
    if(code!="4je3"){
        verification_codehint.innerText="验证码有误！";
        verificationcodebool = false;
    }else{
        verification_codehint.innerText="";
        verificationcodebool = true;
    }
}
function codehint(code) {
    var codehint = document.getElementById("codehint");
    if(code==''||code==null){
        codehint.innerText="验证码不能为空！"
        codemahintbool = false;
    }else if(code!=codema){
        codehint.innerText="验证码错误！"
        codemahintbool = false;
    } else{
        codehint.innerText="";
        codemahintbool = true;
    }
}
function passwordhint1(pass) {
    var passwordhint1 = document.getElementById("passwordhint1");
    if(pass.length >= 6){
        passwordhint1.innerText="";
        passwordhint1bool = true;
    }else{
        passwordhint1.innerText="密码长度必须大于6";
        passwordhint1bool= false;
    }
}
function passwordhint12(pass2) {
    var pass1 = $("input[name='uPass']").val();
    var passwordhint12 = document.getElementById("passwordhint2");
    if(pass1==pass2){
        passwordhint12.innerText="";
        passwordhint2bool = true;
    }else{
        passwordhint12.innerText="两次密码不一致！";
        passwordhint2bool = false;
    }
}
function getcode() {
    $.ajax({
        type:"post",
        url:"UsersController/getCode.do",
        date:"",
        success:function(obj) {
            codema = obj;
            alert("验证码为："+obj);
            var but = $(".aui-form-list .aui-child");
            but.attr("disabled",true);
            var i = 60;
            var a = window.setInterval(function () {
                but.val("还剩"+i+"秒");
                if(i==0){
                    but.removeAttr("disabled");
                    but.val("获取验证码");
                    codemahintbool=false;
                    codema='';
                    $(".aui-form-list .aui-hint").val(-1);
                    clearInterval(a);
                }
                i--;
            },1000);
        }
    });
}

