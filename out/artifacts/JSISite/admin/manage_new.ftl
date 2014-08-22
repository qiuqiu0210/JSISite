<html>
<head>
    <title>manage_new</title>
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
    <#if action.newsList.empty>
        <tr align="center">
            <td height="27" colspan="5" bgcolor="#FFFFFF">当前新闻记录为空</td>
        </tr>
    <#else>
        <#list action.newsList as list>
            <tr align="center">
                <td height="27" bgcolor="#FFFFFF"><a target="_self" href="infoNews.action?id=${list.newsId}">${list.newsTitle}</a></td>
                <td bgcolor="#FFFFFF">${list.newsTime}</td>
                <td bgcolor="#FFFFFF">${list.newsAuthor}</td>
                <td bgcolor="#FFFFFF"></td>
                <td bgcolor="#FFFFFF">
                    <a href="modifyNews.action?id=${list.newsId}"><img src="../images/modify.gif" border="0"></a>
                    <a href="delNews.action?id=${list.newsId}" onClick="javascript:return confirm('你确定删除该新闻吗？')"><img src="../images/del.gif" border="0"></a>
                </td>
            </tr>
        </#list>
    </#if>
</table>
<script type="text/javascript">

    <#if Request["message"]?exists>
        alert("${Request["message"]}");
//        window.location.reload();
    </#if>
<#--alert("${(session["message"])?default("")}");-->
    <#--var msg="${requestScope.message}";-->
    <#---->
    <#--if(msg!=""){-->
        <#--alert(msg);-->
    <#--}-->
</script>
</body>
</html>