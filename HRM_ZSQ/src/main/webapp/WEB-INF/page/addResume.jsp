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
</head>
<body>
    <div>
        <div>
            <h5>个人信息<span>必填</span></h5>
            <div>
                <span>姓名</span><input type="text" name="name"></div>
            <div>
                <span>性别</span><input type="radio" value="男" name="sex" checked>
                男<input type="radio" value="女" name="sex" >
                女
            </div>
            <div>
                <span>出生日期</span>
                <input type="date" name="date">
            </div>
            <div>
                <span>户口所在地</span>
                <select name="provinceselect" onchange="provincechange(this)">
                    <option>请选择</option>
                </select>
                <select name="cityselect" onchange="citychange(this)">
                    <option>请选择</option>
                </select>
                <select name="countyselect">
                    <option>请选择</option>
                </select>
            </div>
            <div>
                <span>现居住城市</span>
                <select name="provinceselect" onchange="provincechange(this)">
                    <option>请选择</option>
                </select>
                <select name="cityselect" onchange="citychange(this)">
                    <option>请选择</option>
                </select>
                <select name="countyselect">
                    <option>请选择</option>
                </select>
            </div>
            <div>
                <span>手机号码</span>
                <input type="text" name="phone_number"/>
            </div>
            <div>
                <span>婚姻状况</span>
                <input type="radio" value="已婚" name="marital_status" checked>
                已婚<input type="radio" value="未婚" name="marital_status" >
                未婚
            </div>
            <div>
                <span>电子邮箱</span>
                <input type="text" name="email">
            </div>
            <div>
                <span>学历</span>
                <select name="education">
                    <option  value="初中">初中</option>
                    <option  value="高中">高中</option>
                    <option  value="大专">大专</option>
                    <option  value="本科">本科</option>
                    <option  value="硕士">硕士</option>
                    <option  value="博士">博士</option>
                </select>
            </div>
            <div>
                <span>工作经验</span>
                <textarea rows="3" cols="30">
                </textarea>
            </div>
            <div>
                <input type="button" value="提交">
            </div>
        </div>
    </div>
    <script src="resume/js/area.js"></script>
    <script src="resume/js/select.js">
    </script>
</body>
</html>

