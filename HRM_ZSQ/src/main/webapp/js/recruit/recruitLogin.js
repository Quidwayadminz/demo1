function loginUser(){
    var uAccount = $(".aui-form-list input[name='uAccount']").val();
    var uPass = $(".aui-form-list input[name='uPass']").val();
    $.ajax(
        {
            type:"post",
            data:"uAccount="+uAccount+"&uPass="+uPass,
            url:"UsersController/loginUsers.do",
            success:function(obj) {
                if(obj=='ok'){
                    window.location.href = "RecruitmentController/recruitmentShow.do";
                }else{
                    alert(obj);
                }
            }
        }
    );
}

