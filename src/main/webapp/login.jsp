<%--
  Created by IntelliJ IDEA.
  User: mr.wang
  Date: 2017/12/29
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String serverPort = "";
    if (request.getServerPort() != 80) {
        serverPort = ":" + request.getServerPort();
    }
    String serverPath = request.getScheme() + "://" + request.getServerName() + serverPort + path + "/";
    String basePath = serverPath;
    if (application.getAttribute("basePath") != null && application.getAttribute("basePath") != "") {
        basePath = application.getAttribute("basePath").toString();
    }
    pageContext.setAttribute("basePath", basePath);
    pageContext.setAttribute("serverPath", serverPath);
%>
<html>
<head>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <title>登录</title>
</head>
<body>
<div>
    <label>账号：</label>
    <input id="mobilePhone" title="账号" type="text">
</div>
<div>
    <label>密码：</label>
    <input id="password" title="密码" type="password">
</div>
<button id="login">登录</button>
</body>
</html>
