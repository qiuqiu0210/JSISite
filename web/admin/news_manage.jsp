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
    <title>news_manage</title>
</head>
<link href="../css/admin.css" rel="stylesheet" type="text/css">
<body>
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" class="tableNew">
    <tr align="center">
        <td colspan="5" class="TableTitle1" >新闻管理</td>
    </tr>
    <tr align="center">
        <td colspan="4" bgcolor="#FFFFFF">&nbsp;</td>
        <td bgcolor="#FFFFFF"><a href="addNews.action" target="_self" >添加新闻</a></td>
    </tr>
    <tr align="center">
        <td height="27" bgcolor="#FFFFFF">新闻标题</td>
        <td bgcolor="#FFFFFF">发布时间</td>
        <td bgcolor="#FFFFFF">发布人</td>
        <td bgcolor="#FFFFFF">摘自</td>
        <td width="30%" bgcolor="#FFFFFF">修改/删除</td>
    </tr>
    <s:set name="list" value="#session.newsList"/>
    <s:if test="#list==null">
        <tr align="center">
            <td height="27" colspan="5" bgcolor="#FFFFFF">当前新闻记录为空</td>
        </tr>
    </s:if>
    <s:else>
        <s:iterator id="news1" value="#list" status="st">
            <%--<s:set name="count" value="<s:property value=\"#st.count\">-1"/>--%>
            <tr align="center">
                <td height="27" bgcolor="#FFFFFF"><a target="_self" href="infoNews.action?id=${news1.newsId}">${news1.newsTitle}</a></td>
                <td bgcolor="#FFFFFF">${news1.newsTime}</td>
                <td bgcolor="#FFFFFF">${news1.newsAuthor}</td>
                <td bgcolor="#FFFFFF"></td>
                <td bgcolor="#FFFFFF">
                    <a href="modifyNews.action?id=${news1.newsId}"><img src="../images/modify.gif" border="0"></a>
                    <a href="delNews.action?id=${news1.newsId}" onClick="javascript:return confirm('你确定删除该新闻吗？')"><img src="../images/del.gif" border="0"></a>
                </td>
            </tr>
        </s:iterator>
    </s:else>
    <%--<tr align="right"> --%>
    <%--<td height="27" colspan="5" bgcolor="#E9F2F6"><%=HtmlUtils.table(bf.getRow("new"),submit_page,"news_manage.jsp")%></td> --%>
    <%--</tr>   <%}%> --%>
</table>
<script type="text/javascript">
    var msg="${requestScope.message}";
    if(msg!=""){
        alert(msg);
    }
</script>
</body>
</html>
