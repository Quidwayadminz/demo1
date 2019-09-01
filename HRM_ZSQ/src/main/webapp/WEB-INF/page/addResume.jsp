<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/27
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>$</title>
    <script src="js/jquery.min.js"></script>
    <script src="resume/js/addresume.js"></script>
</head>
<body>
    <div>
        <div>
            <h5>个人信息<span style="color: red">必填</span></h5>
            <div>
                <span>姓名</span><input type="text" name="rName" onblur="rNameVerify(this.value)"></div>
                <span style="color: red" id="rNameHint"></span>
            <div  id="sexdiv">
                <span>性别</span>
                <input type="radio" value="男" name="rSex12" checked>
                男<input type="radio" value="女" name="rSex12"  >
                女
            </div>
            <div>
                <span>出生日期</span>
                <input type="date" name="rBirthdate" onblur="rBirthdateVerify(this.value)">
                <span style="color: red" id="rBirthdateHint"></span>
            </div>
            <div id="XbjPmpEEbraunZH">
                <span>户口所在地</span>
                 <select id="bookcityselect" name="cityselect" onchange="citychange(this)">
                    <option selected="selected" value="请选择">请选择</option>
                </select>
                <select id="bookcountyselect" name="countyselect">
                    <option selected="selected" value="请选择">请选择</option>
                </select>
                <span style="color: red" id="XbjPmpEEbraunZHHint"></span>
            </div>
            <div id="nowlives">
                <span>现居住城市</span>
                <select id="nowprovinceselect" name="provinceselect" onchange="provincechange(this)">
                    <option selected="selected" value="请选择">请选择</option>
                </select>
                <select id="nowcityselect" name="cityselect" onchange="citychange(this)">
                    <option selected="selected" value="请选择">请选择</option>
                </select>
                <select id="nowcountyselect">
                    <option selected="selected" value="请选择">请选择</option>
                </select>
                <span style="color: red" id="nowlivesHint"></span>
            </div>
            <div>
                <span>手机号码</span>
                <input type="text" name="rPhoneNumber" onblur="rPhoneNumberVerify(this.value)"/>
                <span style="color:red" id="rPhoneNumberHint"></span>
            </div>
            <div>
                <span>婚姻状况</span>
                <input type="radio" value="1" name="rMaritalStatus" checked>
                已婚<input type="radio" value="2" name="rMaritalStatus" >
                未婚
                <span style="color: red" id="rMaritalStatusHint"></span>
            </div>
            <div>
                <span>电子邮箱</span>
                <input type="text" name="rEmail" onblur="rEmailVerify(this.value)">
                <span style="color: red" id="rEmailHint"></span>
            </div>
            <div>
                <span>学历</span>
                <select name="rEducationName">
                    <option  value="初中">初中</option>
                    <option  value="高中">高中</option>
                    <option  value="大专">大专</option>
                    <option  value="本科">本科</option>
                    <option  value="硕士">硕士</option>
                    <option  value="博士">博士</option>
                </select>
                <span style="color: red" id="rEducationNameHint"></span>
            </div>
            <div>
                <span>工作经验</span>
                <textarea rows="3" cols="30" name="rWorkexperience" onblur="rWorkexperienceVerify(this.value)"></textarea>
                <span style="color: red" id="rWorkexperienceHint"></span>
            </div>
            <div>
                <span>专业技能</span>
                <textarea rows="3" cols="30" name="rProfessionalskill" onblur="rProfessionalskillVerify(this.value)"></textarea>
                <span style="color: red" id="rProfessionalskillHint"></span>
            </div>
            <div>
                <input type="button" value="提交" onclick="addResume()">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="button" value="返回" onclick="returnShow()">
            </div>
        </div>
    </div>
    <script src="resume/js/area.js"></script>
    <script src="resume/js/select.js">
    </script>
</body>
</html>

