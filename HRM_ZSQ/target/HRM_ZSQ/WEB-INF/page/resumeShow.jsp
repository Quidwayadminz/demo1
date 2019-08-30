<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/27
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>$</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<table class="join_zp" cellpadding="0" cellspacing="0">
    <tr>
        <td colspan="4"><a href="ResumeController/addResume.do">添加</a></td>
        <td colspan="5"></td>
    </tr>
    <tr class="join_zp_t">
        <td>姓名</td>
        <td>性别</td>
        <td>出生日期</td>
        <td>户口所在地</td>
        <td>现住地址</td>
        <td>手机号码</td>
        <td>邮箱</td>
        <td>婚姻状况</td>
        <td>学历</td>
    </tr>
    <tbody class="join_con">
    <c:forEach items="#{requestScope.list}" var="i" end="${requestScope.list.size()}" begin="0">
        <tr class="join_zp_c">
            <td>${i.rName}</td>
            <td>${i.rSex}</td>
            <td>${i.rBirthdate}</td>
            <td>${i.rDomicilePlace}</td>
            <td>${i.rCurrentAddress}</td>
            <td>${i.rPhoneNumber}</td>
            <td>${i.rEmail}</td>
            <td>${i.rMaritalStatus}</td>
            <td>${i.rEducationName}</td>
        </tr>
        <tr class="join_zp_n">
            <td colspan="9">
                <div class="join_ms"><i></i>工作经验</div>
                <div class="join_cn">
                    <p>${i.rWorkexperience}</p>
                </div>
                <div class="join_ms"><i></i>专业技能</div>
                <div class="join_cn">
                    <p>${i.rProfessionalskill}</p>
                </div>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
    <script src="js/recruit/index.js"></script>
</body>
</html>

