<%--
  Created by IntelliJ IDEA.
  User: Eather
  Date: 2019/3/10
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sigh in</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sigh.css">
</head>
<body>
<div class="main">
    <div class="box col-md-3 col-md-offset-4">
        <h4>欢迎注册</h4>
        <div class="content row col-md-10 col-md-offset-1">
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <div class="col-md-12"><input class="form-control" id="phone" placeholder="请输入手机号"></div>
                </div>
                <div class="form-group">
                    <div class="col-md-12"><input class="form-control" id="email" placeholder="请输入电子邮箱"></div>
                </div>
                <div class="form-group">
                    <div class="col-md-12"><input class="form-control" id="nickname" placeholder="请输入昵称"></div>
                </div>
                <div class="form-group">
                    <div class="col-md-12"><input class="form-control" id="psd1" placeholder="请输入密码"></div>
                </div>
                <div class="form-group">
                    <div class="col-md-12"><input class="form-control" id="psd2" placeholder="请确认密码"></div>
                </div>
                <div class="form-group">
                    <div class="col-md-12"><input class="form-control" id="checkcode" placeholder="请输入手机号"></div>
                </div>
                <button type="submit" class="col-md-12 btn btn-default">提交</button>
                <div class="another-login col-md-5 col-md-offset-8"><a href="#">其它登录方式......</a></div>
            </form>
        </div>
    </div>

</div>
</body>
</html>
