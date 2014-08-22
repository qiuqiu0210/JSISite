<%--
  Created by IntelliJ IDEA.
  User: songliu
  Date: 2014/8/21
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>news_add</title>
</head>
<link href="../css/admin.css" rel="stylesheet" type="text/css">
<%--<script src="../js/validate.js"></script>--%>
<body>
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" class="tableNew">
    <tr align="center">
        <td colspan="2" class="TableTitle1" >添加新闻</td>
    </tr>
    <form action="addNews" method="post" enctype="multipart/form-data">
        <tr align="center">
            <td width="40%" bgcolor="#FFFFFF">新闻标题</td>
            <td width="60%" align="left" bgcolor="#FFFFFF"> <input type="text" name="news.newsTitle"> </td>
        </tr>
        <tr align="center">
            <td height="14" bgcolor="#FFFFFF">作者</td>
            <td height="14" align="left" bgcolor="#FFFFFF"><input type="text" name="news.newsAuthor" value="无"></td>
        </tr>
        <tr align="center">
            <td height="27" colspan="2" bgcolor="#FFFFFF"><span class="TableTitle1">新闻内容</span></td>
        </tr>
        <tr align="center">
            <td height="27" colspan="2" bgcolor="#FFFFFF"><textarea name="news.newsContent" cols="90" rows="20" class="textarea"></textarea></td>
        </tr>
        <tr align="center">
            <td height="27" colspan="2" bgcolor="#FFFFFF">上传新闻配图&nbsp;
                <input name="upload" type="file" size="50">
            </td>
        </tr>
        <tr align="center">
            <td height="13" colspan="2" bgcolor="#FFFFFF">
                <%--<input type="hidden" name="action" value="add"> --%>
                <%--<input type="hidden" name="uid" value="<%=(((User)session.getAttribute("user")).getUid())%>"> --%>
                <input name="Submit" type="submit" class="btn_grey" value="提交">
                &nbsp;&nbsp;
                <input name="Submit2" type="reset" class="btn_grey" value="重置"></td>
        </tr>
    </form>
</table>
<table width="80%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td height="50" colspan="5" align="right"><a href="showNews.action" >返回</a></td>
    </tr>
</table>
</body>
</html>
