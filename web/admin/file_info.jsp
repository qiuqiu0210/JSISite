<%--
  Created by IntelliJ IDEA.
  User: songliu
  Date: 2014/8/21
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>file_info</title>
</head>
<link href="../css/admin.css" rel="stylesheet" type="text/css">
<%--<script src="../js/validate.js"></script>--%>
<body>
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" class="tableNew">
    <tr align="center">
        <td colspan="2" class="TableTitle1" >工具软件信息</td>
    </tr>
    <tr align="center">
        <td width="23%" bgcolor="#FFFFFF">软件名称</td>
        <td align="left" bgcolor="#FFFFFF"><input name="upFile.fileTitle" type="text" value="${upFile.fileTitle}" size="40" readonly></td>
    </tr>
    <tr align="center">
        <td width="23%" bgcolor="#FFFFFF">上传时间</td>
        <td align="left" bgcolor="#FFFFFF"><input name="upFile.fileTime" type="text" value="${upFile.fileTime}" size="40" readonly></td>
    </tr>
    <tr align="center">
        <td bgcolor="#FFFFFF">软件类型</td>
        <td align="left" bgcolor="#FFFFFF">
            <input name="upFile.fileKind" type="radio" class="noborder" value="0" readonly>
            工具
            <input name="upFile.fileKind" type="radio" class="noborder" value="1" readonly>
            补丁</td>
        <script type="text/javascript">
            document.getElementsByName("upFile.fileKind")[${upFile.fileKind}].checked=true;
        </script>
    </tr>
    <tr align="center">
        <td bgcolor="#FFFFFF">文件名称</td>
        <td align="left" bgcolor="#FFFFFF"><input type="text" name="upFile.fileName" value="${upFile.fileName}" readonly></td>
    </tr>
    <tr align="center">
        <td height="27" colspan="2" bgcolor="#FFFFFF">其他说明</td>
    </tr>
    <tr align="left">
        <td colspan="2" bgcolor="#FFFFFF">${upFile.fileInfo}</td>
    </tr>
</table>
<table width="80%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td height="50" colspan="5" align="right"><a href="showfile.action">返回</a></td>
    </tr>
</table>
</body>
</html>
