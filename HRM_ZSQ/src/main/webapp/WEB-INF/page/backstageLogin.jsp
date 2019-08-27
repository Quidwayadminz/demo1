<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/25
  Time: 19:10
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
    <title>网站后台管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--可无视-->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!--主要样式-->
    <link type="text/css" href="css/style.css" rel="stylesheet" />
    <script>
        if(self!=top)
        {
            parent.location.href='index.html';
        }
        function CheckLogin(obj){
            if(obj.username.value=='')
            {
                alert('请输入用户名');
                obj.username.focus();
                return false;
            }
            if(obj.password.value=='')
            {
                alert('请输入登录密码');
                obj.password.focus();
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<div class="container" align="center">
    <div class="col-md-6" style="margin-top: 20%;">
        <div class="inset">
            <form name="login" id="login" method="post" action="ecmsadmin.php" onSubmit="return CheckLogin(document.login);">
                <input type="hidden" name="enews" value="login">
                <div>
                    <h2>后台管理系统</h2>
                    <span style="text-align: left;text-indent: 0.4em;"><label>用户名</label></span>
                    <span><input type="text" name="username" class="textbox" ></span>
                </div>
                <div>
                    <span style="text-align: left;text-indent: 0.4em;"><label>密码</label></span>
                    <span><input  name="password" type="password" class="password"></span>
                </div>
                <div>
                    <input type="checkbox">记住密码
                    <input type="checkbox">自动登录
                </div>
                <div class="sign">
                    <input type="reset"  class="submit" value="重置"/>
                    <input type="submit" value="登录" class="submit" />
                </div>
            </form>
        </div>
    </div>
</div>

<script>
    if(document.login.equestion.value==0)
    {
        showanswer.style.display='none';
    }
</script>
</body>
</html>

