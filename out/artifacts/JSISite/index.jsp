<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-8-14
  Time: 上午10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <title>输入操作数</title>
  </head>
  <body>
    求代数和
    <br/>
    <s:form action="sum">
        <s:textfield name="operand1" label="操作数1"/>
        <s:textfield name="operand2" label="操作数2"/>
        <s:submit value="代数和"/>
    </s:form>
  </body>
</html>
