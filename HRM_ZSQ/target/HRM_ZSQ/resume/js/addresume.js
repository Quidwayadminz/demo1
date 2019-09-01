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
    var provinceselect = $("#bookprovinceselect option:selected");
    var cityselect = $("#bookcityselect option:selected");
    var countyselect = $("#bookcountyselect option:selected");
    var XbjPmpEEbraunZHHint = $("#XbjPmpEEbraunZHHint");
    if(provinceselect.val()=='请选择'|| cityselect.val()=='请选择' || countyselect.val() == '请选择'){
        XbjPmpEEbraunZHHint.html("请选择户籍所在地！");
        return false;
    }else{
        XbjPmpEEbraunZHHint.html("");
        return true;
    }

}
function nowlivesVerify() {
    var nowlivesHint = $("#nowlivesHint");
    var provinceselect = $("#nowprovinceselect option:selected");
    var cityselect = $("#nowcityselect option:selected");
    var countyselect = $("#nowcountyselect option:selected");
    if(provinceselect.val()=='请选择'|| cityselect.val()=='请选择' || countyselect.val() == '请选择'){
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
    var sSex = $("input[name='rSex12']:checked").val();
    var rBirthdate = $("input[name='rBirthdate']").val();
    var provinceselect1 = $("#bookprovinceselect option:selected").val();
    var cityselect1 = $("#bookcityselect option:selected").val();
    var countyselect1 = $("#bookcountyselect option:selected").val();
    var provinceselect2 = $("#nowprovinceselect option:selected").val();
    var cityselect2 = $("#nowcityselect option:selected").val();
    var countyselect2 = $("#nowcountyselect option:selected").val();
    var rPhoneNumber = $("input[name='rPhoneNumber']").val();
    var rMaritalStatus = $("input[name='rMaritalStatus']:checked").val();
    var rEmail = $("input[name='rEmail']").val();
    var rEducationName = $("select[name='rEducationName']").val();
    var rWorkexperience = $("textarea[name='rWorkexperience']").val();
    var rProfessionalskill = $("textarea[name='rProfessionalskill']").val();
    if(rNameVerify(rName)&&rBirthdateVerify(rBirthdate)&&XbjPmpEEbraunZHVerify()
    &&nowlivesVerify()&&rPhoneNumberVerify(rPhoneNumber)&&rEmailVerify(rEmail)
    &&rWorkexperienceVerify(rWorkexperience)&&rProfessionalskillVerify(rProfessionalskill)){
        var rDomicilePlace = provinceselect1+"-"+cityselect1+"-"+countyselect1;
        var rCurrentAddress = provinceselect2+"-"+cityselect2+"-"+countyselect2;
        var dataResume ="rName="+rName+"&rSex="+sSex+"&rBirthdate="+rBirthdate+
            "&rDomicilePlace="+rDomicilePlace+"&rCurrentAddress="+rCurrentAddress+
            "&rPhoneNumber="+rPhoneNumber+"&rMaritalStatus="+rMaritalStatus+"&rEmail="+rEmail+
            "&rEducationName="+rEducationName+"&rWorkexperience="+rWorkexperience+"&rProfessionalskill="+rProfessionalskill;
        $.ajax({
            type:"post",
            data:dataResume,
            url:"ResumeController/addByUidResume.do",
            success:function (obj) {
                if(obj=='ok'){
                    if(confirm("简历添加成功！是否继续添加?")!=true){
                        location.href="ResumeController/resumeShow.do";
                    }
                }else{
                    alert("简历添加失败！请检查信息是否填写完整！")
                }
            }
        });
    }
}
function returnShow() {
    location.href="ResumeController/resumeShow.do";
}