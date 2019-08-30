<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/26
  Time: 18:25
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
<div>
    <div class="div_table">
        <table style="width:500px;height:30px">
            <tr>
                <td>
                    <c:if test="${sessionScope.users != null}">
                        <span>欢迎您：${sessionScope.users.uAccount}</span>
                    </c:if>
                </td>
                <td><a href="UsersController/recruitLoginShow.do">登录/注册</a></td>
                <td><a href="ResumeController/resumeShow.do">我的简历</a></td>
                <td><a href="/">通知<span style="color:red">0</span></a></td>
            </tr>
        </table>
    </div>
    <div>
        <table class="join_zp" cellpadding="0" cellspacing="0">
            <tr class="join_zp_t">
                <td>职位名称</td>
                <td>薪资</td>
                <td>人数</td>
                <td>工作地区</td>
                <td>发布时间</td>
            </tr>
            <c:if test="${requestScope.list == null}">
                <tr>
                    <td colspan="5"><h5>没有招聘信息！！！</h5></td>
                </tr>
            </c:if>
            <c:forEach items="${requestScope.list}" var="i" end="${requestScope.list.size()}" begin="0">
                <tbody class="join_con">
                <tr class="join_zp_c">
                    <td>${i.rmPostName}</td>
                    <td>${i.rmSalary}</td>
                    <td>5</td>
                    <td>${i.rmWorkplace}</td>
                    <td>${i.rmReleaseDate}</td>
                </tr>
                <tr class="join_zp_n">
                    <td colspan="5">
                        <div class="join_ms"><i></i>任职要求</div>
                        <div class="join_cn">
                            <p>工作经验${i.rmExperience}</p>
                            <p>学历${i.rmEducation}</p>
                        </div>
                        <div class="join_ms"><i></i>操作</div>
                        <div class="join_cn">
                            <p><input type="button" value="简历投递"></p>
                        </div>
                    </td>
                </tr>
                </tbody>
            </c:forEach>
        </table>
    </div>
</div>

<script src="js/recruit/index.js"></script>
</body>
</html>

