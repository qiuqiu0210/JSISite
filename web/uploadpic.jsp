<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-8-19
  Time: 下午2:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>上传图片</title>
</head>
<body>
<s:form action="picture" method="POST" theme="simple" enctype="multipart/form-data">
    Image<s:file name="image"></s:file>
    <s:property value="fieldError['image'][0]"/>
    <s:submit value="Submit"/>
</s:form>
</body>
</html>
