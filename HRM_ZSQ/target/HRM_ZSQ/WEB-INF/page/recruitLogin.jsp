<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/25
  Time: 13:36
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
    <meta name='TTUNION_verify' content='b846c3c2b85efabc496d2a2b8399cd62'>
    <meta name="sogou_site_verification" content="gI1bINaJcL"/>
    <meta name="360-site-verification" content="37ae9186443cc6e270d8a52943cd3c5a" />
    <meta name="baidu_union_verify" content="99203948fbfbb64534dbe0f030cbe817">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="apple-touch-fullscreen" content="yes">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <title>登录页面</title>
    <link rel="stylesheet" type="text/css" href="css/base.css">
    <link rel="stylesheet" type="text/css" href="css/home.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/recruit/recruitLogin.js"></script>
</head>
<body>

<header class="aui-header">
    <div class="aui-header-box">
        <h1>
            <a href="login.html" class="aui-header-box-logo"></a>
        </h1>
    </div>
</header>

<section class="aui-content">
    <div class="aui-content-box clearfix">
        <div class="aui-content-box-fl">
            <div class="aui-form-header">
                <div class="aui-form-header-item on">密码登录</div>
                <div class="aui-form-header-item">验证码登录</div>
                <span class="aui-form-header-san"></span>
            </div>
            <div class="aui-form-content">
                <div class="aui-form-content-item">
                        <div class="aui-form-list">
                            <input type="text" class="aui-input" name="uAccount" placeholder="请输入账号" data-required="required" autocomplete="off">
                        </div>
                        <div class="aui-form-list">
                            <input type="password" class="aui-input" name="uPass" placeholder="请输入密码" data-required="required" autocomplete="off">
                        </div>
                        <div class="aui-form-pwd clearfix">
                            <a href="#">忘记密码？</a>
                        </div>
                        <div class="aui-form-btn">
                            <input type="button" class="aui-btn" value="登&nbsp;录" onclick="loginUser()" >
                        </div>
                </div>
                <div class="aui-form-content-item">
                    <form action="">
                        <div class="aui-form-list">
                            <input type="text" class="aui-input" name="" placeholder="请输入手机号" data-required="required" autocomplete="off">
                        </div>
                        <div class="aui-form-list">
                            <input type="text" class="aui-input" name="" placeholder="请证明你不是机器人" data-required="required" autocomplete="off">
                            <a href="#" class="aui-child aui-child-img">
                                <img src="img/yzm.png" alt="">
                            </a>
                        </div>
                        <div class="aui-form-list">
                            <input type="text" class="aui-input" name="" placeholder="请输入验证码" data-required="required" autocomplete="off">
                            <input type="button" class="aui-child" value="获取验证码" >
                        </div>
                        <div class="aui-form-pwd clearfix">
                            <a href="#">忘记密码？</a>
                        </div>
                        <div class="aui-form-btn">
                            <input type="submit" class="aui-btn" value="登&nbsp;录">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="aui-content-box-fr">
            <div class="aui-content-box-text">
                <h3>还没有帐号:</h3>
                <a href="UsersController/recruitRegisterShow.do" class="aui-ll-link">立即注册</a>
                <h3>使用第三方帐号直接登录:</h3>
                <ul class="aui-content-box-text-link clearfix">
                    <li><a href="#" class="aui-icon-sina"   title="使用新浪微博帐号登录"></a></li>
                    <li><a href="#" class="aui-icon-wechat" title="使用微信帐号登录"></a></li>
                    <li><a href="#" class="aui-icon-qq"     title="使用腾讯QQ帐号登录"></a></li>
                    <li><a href="#" class="aui-icon-baidu"  title="使用百度帐号登录"></a></li>
                </ul>
            </div>
        </div>
    </div>
</section>

<script type="text/javascript">
    $(function(){
        /*tab标签切换*/
        function tabs(tabTit,on,tabCon){
            $(tabCon).each(function(){
                $(this).children().eq(0).show();

            });
            $(tabTit).each(function(){
                $(this).children().eq(0).addClass(on);
            });
            $(tabTit).children().click(function(){
                $(this).addClass(on).siblings().removeClass(on);
                var index = $(tabTit).children().index(this);
                $(tabCon).children().eq(index).show().siblings().hide();
            });
        }
        tabs(".aui-form-header","on",".aui-form-content");
    })
</script>

</body>
</html>

