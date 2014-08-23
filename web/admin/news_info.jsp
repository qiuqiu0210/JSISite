<%--
  Created by IntelliJ IDEA.
  User: songliu
  Date: 2014/8/21
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>news_info</title>
</head>
<link href="../css/admin.css" rel="stylesheet" type="text/css">
<body>
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" bordercolorlight="#EFEFEF" bordercolordark="#000000" class="tableNew">
    <tr align="center">
        <td colspan="2" class="TableTitle1" >查看新闻详情</td>
    </tr>
    <tr align="center">
        <td width="40%" bgcolor="#FFFFFF">新闻标题</td>
        <td width="60%" align="left" bgcolor="#FFFFFF"> <input type="text" name="news.newsTitle" value="${news.newsTitle}" readonly> </td>
    </tr>
    <tr align="center">
        <td height="14" bgcolor="#FFFFFF">作者</td>
        <td height="14" align="left" bgcolor="#FFFFFF"><input type="text" name="news.newsAuthor" value="${news.newsAuthor}" readonly></td>
    </tr>
    <tr align="center">
        <td height="27" bgcolor="#FFFFFF">发布时间</td>
        <td align="left" bgcolor="#FFFFFF"><input type="text" name="news.newsTime" value="${news.newsTime}" readonly></td>
    </tr>
    <tr align="center">
        <td height="27" colspan="2" bgcolor="#FFFFFF">新闻内容</td>
    </tr>
    <tr align="left">
        <td colspan="2" bgcolor="#FFFFFF">${news.newsContent}</td>
    </tr>
    <tr align="center">
        <td height="2" colspan="2" bgcolor="#FFFFFF">
            <img src="../${news.newsPhoto}" width=460 height=300 >
            <a href="../download.action?fileName=${news.newsPhoto}" >下载</a>
            <%--<%String path=bf.SearchHead("WHERE iid='"+r.getIid()+"'").getPath();if(path==null){out.print("无图片");}else{out.print("<img src=../"+path+" width=460 height=300 >");}%></td>--%>
    </tr>
    <tr align="center">
        <td height="6" colspan="2" bgcolor="#FFFFFF">&nbsp;</td>
    </tr>
</table>
<table width="80%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td height="50" colspan="5" align="right"><a href="showNews.action">返回</a></td>
    </tr>
</table>
</body>
</html>
