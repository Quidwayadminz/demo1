<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/27
  Time: 15:43
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
    <meta charset="UTF-8">
    <title>注册成功</title>
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport"/>
    <meta content="yes" name="apple-mobile-web-app-capable"/>
    <meta content="black" name="apple-mobile-web-app-status-bar-style"/>
    <meta content="telephone=no" name="format-detection"/>
    <link href="succeed/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript">
        function f() {
            window.location.href="UsersController/recruitLoginShow.do";
        }
    </script>
</head>
<body>


<section class="aui-flexView">
    <header class="aui-navBar aui-navBar-fixed b-line">
        <a href="UsersController/recruitRegisterShow.do" class="aui-navBar-item">
            <i class="icon icon-return"></i>
        </a>
        <div class="aui-center">
            <span class="aui-center-title">注册成功</span>
        </div>
        <a href="javascript:;" class="aui-navBar-item">
            <i class="icon icon-sys"></i>
        </a>
    </header>
    <section class="aui-scrollView">
        <div class="aui-back-box">
            <div class="aui-back-pitch">
                <img src="succeed/images/icon-pitch.png" alt="">
            </div>
            <div class="aui-back-title">
                <h2>注册成功</h2>
                <p>您的账号为：${requestScope.account},请牢记您的账号</p>
            </div>
            <div class="aui-back-button">
                <button onclick="f()">返回登录</button>
            </div>
        </div>
    </section>
</section>
</body>
</html>


