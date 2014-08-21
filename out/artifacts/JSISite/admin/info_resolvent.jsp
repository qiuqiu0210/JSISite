<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>update_resolvent</title>
</head>
<link href="../css/admin.css" rel="stylesheet" type="text/css">
<body>
<s:action name="news2" namespace="/"/>
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" bordercolorlight="#EFEFEF" bordercolordark="#000000" class="tableNew">
  <tr align="center">
    <td colspan="2" class="TableTitle1" >查看解决方案</td>
  </tr>
  <tr align="center">
    <td width="21%" bgcolor="#FFFFFF">方案名称</td>
    <td width="79%" align="left" bgcolor="#FFFFFF">${news.newsId}</td>
  </tr>
  <tr align="center">
    <td height="27" bgcolor="#FFFFFF">所属软件类别</td>
    <td align="left" bgcolor="#FFFFFF"></td>
  </tr>
  <tr align="center">
    <td height="27" bgcolor="#FFFFFF">实例应用</td>
    <td align="left" bgcolor="#FFFFFF"></td>
  </tr>
  <tr align="center">
    <td height="27" colspan="2" bgcolor="#FFFFFF">解决方案</td>
  </tr>
  <tr align="left">
    <td colspan="2" bgcolor="#FFFFFF">${news.newsContent}</td>
  </tr>
  <tr align="center">
    <td height="2" colspan="2" bgcolor="#FFFFFF">
        <img src="../upload/${news.newsPhoto}" width=460 height=300 >
        <a href="download.action?fileName=${news.newsPhoto}" >下载</a>
        <%--<%String path=bf.SearchHead("WHERE iid='"+r.getIid()+"'").getPath();if(path==null){out.print("无图片");}else{out.print("<img src=../"+path+" width=460 height=300 >");}%></td>--%>
  </tr>
  <tr align="center">
    <td height="3" bgcolor="#FFFFFF">添加人</td>
    <td height="3" align="left" bgcolor="#FFFFFF"></td>
  </tr>
  <tr align="center">
    <td height="2" bgcolor="#FFFFFF">添加时间</td>
    <td height="2" align="left" bgcolor="#FFFFFF">${news.newsTime}</td>
  </tr>
  <tr align="center">
    <td height="6" colspan="2" bgcolor="#FFFFFF">&nbsp;</td>
  </tr>
</table>
<table width="80%"  border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="50" colspan="5" align="right"><a href="#" onClick="Jscript:history.back()">返回</a></td>
  </tr>
</table>
</body>
</html>
