function rNameVerify(val) {
   var rNameHint = $("#rNameHint");
    if(val==null || val == ''){
        rNameHint.html('姓名不能为空！');
        return false;
    }else{
        rNameHint.html('');
        return true;
    }
}
function  rBirthdateVerify(val){
    var rBirthdateHint = $("#rBirthdateHint");
    if(val == null || val == ''){
        rBirthdateHint.html('出生日期不能空！');
        return false;
    }else{
        rBirthdateHint.html('');
        return true;
    }
}
function XbjPmpEEbraunZHVerify() {
    var provinceselect = $("#XbjPmpEEbraunZH select[name='provinceselect']");
    var cityselect = $("#XbjPmpEEbraunZH select[name='cityselect']");
    var countyselect = $("#XbjPmpEEbraunZH select[name='countyselect']");
    var index1 = provinceselect.selectedIndex;
    var val1 =  provinceselect.options[index1].value;
    var index2 = cityselect.selectedIndex;
    var val2 =  cityselect.options[index2].value;
    var index3 = countyselect.selectedIndex;
    var val3 =  countyselect.options[index3].value;
    var XbjPmpEEbraunZHHint = $("#XbjPmpEEbraunZHHint");
    if(val1=='请选择'|| val2=='请选择' || val3 == '请选择'){
        XbjPmpEEbraunZHHint.html("请选择户籍所在地！");
        return false;
    }else{
        XbjPmpEEbraunZHHint.html("");
        return true;
    }

}
function nowlivesVerify() {
    var nowlivesHint = $("#nowlivesHint");
    var provinceselect = $("#nowlives select[name='provinceselect']");
    var cityselect = $("#nowlives select[name='cityselect']");
    var countyselect = $("#nowlives select[name='countyselect']");
    var index1 = provinceselect.selectedIndex;
    var val1 =  provinceselect.options[index1].value;
    var index2 = cityselect.selectedIndex;
    var val2 =  cityselect.options[index2].value;
    var index3 = countyselect.selectedIndex;
    var val3 =  countyselect.options[index3].value;
    if(val1=='请选择'|| val2=='请选择' || val3 == '请选择'){
        nowlivesHint.html("请选择现在住城市！");
        return false;
    }else{
        nowlivesHint.html("");
        return true;
    }
}
function rPhoneNumberVerify(val){
    var rPhoneNumberHint = $("#rPhoneNumberHint");
    if(!(/^1[3456789]\d{9}$/.test(val))){
        rPhoneNumberHint.html("您输入手机号码有误！");
        return false;
    }else{
        rPhoneNumberHint.html("");
        return true;
    }
}
function rEmailVerify(val) {
    var rEmailHint = $("#rEmailHint");
    var reg = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
    if(!reg.test(val)){
        rEmailHint.html("您输入邮箱有误！");
        return false;
    }else{
        rEmailHint.html("");
        return true;
    }
}
function rWorkexperienceVerify(val) {
    var rWorkexperienceHint = $("#rWorkexperienceHint");
    if(val==null || val == ''){
        rWorkexperienceHint.html("工作经验不能为空！");
        return false;
    }else{
        rWorkexperienceHint.html("");
        return true;
    }
}
function  rProfessionalskillVerify(val) {
    var rProfessionalskillHint = $("#rProfessionalskillHint");
    if(val == null || val == ''){
        rProfessionalskillHint.html("专业技能不能为空！");
        return false;
    }else{
        rProfessionalskillHint.html("");
        return true;
    }
}
function  addResume() {
    var rName = $("input[name='rName']").val();
    var sSex = $("input[name='sSex']:checked").val();
    var rBirthdate = $("input[name='rBirthdate']").val();
    var provinceselect1 = $("#XbjPmpEEbraunZH input[name='provinceselect']:selected").val();
    var cityselect1 = $("#XbjPmpEEbraunZH select[name='cityselect']:selected").val();
    var countyselect1 = $("#XbjPmpEEbraunZH select[name='countyselect']:selected").val();
    var provinceselect2 = $("#nowlives select[name='provinceselect']:selected").val();
    var cityselect2 = $("#nowlives select[name='cityselect']:selected").val();
    var countyselect2 = $("#nowlives select[name='countyselect']:selected").val();
    var rPhoneNumber = $("input[name='rPhoneNumber']").val();
    var rMaritalStatus = $("input[name='rMaritalStatus']:checked").val();
    var rEmail = $("input[name='rEmail']").val();
    var rEducationName = $("select[name='rEducationName']").val();
    var rWorkexperience = $("textarea[name='rWorkexperience']").val();
    var rProfessionalskill = $("textarea[name='rProfessionalskill']").val();
    if(rNameVerify(rName)&&rBirthdateVerify(rBirthdate)&&XbjPmpEEbraunZHVerify()
    &&nowlivesVerify()&&rPhoneNumberVerify(rPhoneNumber)&&rEmailVerify(rEmail)
    &&rWorkexperienceVerify(rWorkexperience)&&rProfessionalskillVerify(rProfessionalskill)){
        //json
        var rDomicilePlace = provinceselect1+"-"+cityselect1+"-"+countyselect1;
        var rCurrentAddress = provinceselect2+"-"+cityselect2+"-"+countyselect2;
        var data = {"rName":rName,"sSex":sSex,"rBirthdate":rBirthdate,
        "rDomicilePlace":rDomicilePlace,"rCurrentAddress":rCurrentAddress,
        "rPhoneNumber":rPhoneNumber,"rMaritalStatus":rMaritalStatus,"rEmail":rEmail,
        "rEducationName":rEducationName,"rWorkexperience":rWorkexperience,"rProfessionalskill":rProfessionalskill};
        $.ajax({
            type:"post",
            data:data,
            url:"",
            success:function (obj) {
                alert("添加成功！");
            }
        });
    }
}