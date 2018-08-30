<%--
  Created by IntelliJ IDEA.
  User: Achilles
  Date: 2018/8/30
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/admin_login.action" method="post">
    <br />
    <br />
    用户名：<input type="text" id="name" name="name" /> <br />
    密码：<input type="password" id="password" name="password" /> <br />
    <button type="submit">提交</button>
</form>
</body>
</html>
