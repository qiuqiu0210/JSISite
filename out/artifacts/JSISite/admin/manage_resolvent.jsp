<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<link href="../css/admin.css" rel="stylesheet" type="text/css">
<title>manage_resolvent</title>
</head>
<body bgcolor="#ffffff">
<s:action name="news2" namespace="/"/>
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" class="tableNew"> 
  <tr align="center"> 
    <td colspan="3" class="TableTitle1" >解决方案管理</td> 
  </tr> 
  <tr align="center"> 
    <td colspan="2" bgcolor="#FFFFFF">&nbsp;</td> 
    <td width="30%" bgcolor="#FFFFFF"><a href="addNews.action" target="_self" >添加解决方案</a></td>
  </tr> 
  <tr align="center"> 
    <td height="27" bgcolor="#FFFFFF">解决方案名称</td> 
    <td bgcolor="#FFFFFF">添加时间</td> 
    <td width="30%" bgcolor="#FFFFFF">修改删除</td> 
  </tr>
    <s:set name="list" value="#session.newsList"/>
    <s:if test="#list==null">
        <tr align="center">
            <td height="27" colspan="5" bgcolor="#FFFFFF">当前解决方案为空</td>
        </tr>
    </s:if>
    <s:else>
        <s:iterator id="newses" value="#list" status="st">
          <tr align="center">
            <td height="27" bgcolor="#FFFFFF"><a href="modifyNews.action?id=${newses.newsId}">${newses.newsTitle}</a></td>
            <td height="27" bgcolor="#FFFFFF">${newses.newsTime} </td>
            <td height="27" bgcolor="#FFFFFF"><a href="modifyNews.action?id=${newses.newsId}"><img src="../images/modify.gif" border="0"></a>
                &nbsp;&nbsp;
                <a href="delNews.action?id=${newses.newsId}" onClick="javascript:return confirm('你确定删除解决方案吗？')"><img src="../images/del.gif" border="0"></a></td>
          </tr>
        </s:iterator>
    </s:else>
    <%--<s:actionmessage/>--%>
    <%--<script type="text/javascript">--%>
        <%--alert("<s:actionmessage/>");--%>
    <%--</script>--%>
    <%--<s:if test="hasActionMessages()">--%>
        <%--<s:iterator value="actionMessages">--%>
            <%--<script type="text/javascript">--%>
                <%--alert("<s:property escape="false"/>");--%>
            <%--</script>--%>
        <%--</s:iterator>--%>
    <%--</s:if>--%>
    <tr align="right">
    <td height="27" colspan="3" bgcolor="#E9F2F6"></td>
  </tr>
</table> 
</body>
<script type="text/javascript">
    var msg="${requestScope.message}";
    if(msg!=""){
        alert(msg);
    }
</script>
</html>
