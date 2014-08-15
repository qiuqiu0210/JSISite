<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-8-14
  Time: 上午11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<s:form action="Login">
  <s:textfield name="username" label="用户名"/>
  <s:textfield name="password" label="密码"/>
  <s:submit value="登录" align="left"/>
</s:form>
</body>
</html>
