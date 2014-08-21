<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title>modify_new</title>
</head>
<link href="../css/admin.css" rel="stylesheet" type="text/css">
<%--<script src="../js/validate.js"></script>--%>
<body>
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" class="tableNew">
    <tr align="center">
        <td colspan="2" class="TableTitle1" >修改新闻</td>
    </tr>
    <form action="modifyNews" method="post">
        <input type="hidden" name="news.newsId" value="${news.newsId}"/>
        <input type="hidden" name="news.newsPhoto" value="${news.newsPhoto}"/>
        <tr align="center">
            <td width="40%" bgcolor="#FFFFFF">新闻标题</td>
            <td width="60%" align="left" bgcolor="#FFFFFF"> <input type="text" name="news.newsTitle" value="${news.newsTitle}"> </td>
        </tr>
        <tr align="center">
            <td height="14" bgcolor="#FFFFFF">作者</td>
            <td height="14" align="left" bgcolor="#FFFFFF"><input type="text" name="news.newsAuthor" value="${news.newsAuthor}"></td>
        </tr>
        <tr align="center">
            <td height="27" bgcolor="#FFFFFF">发布时间</td>
            <td align="left" bgcolor="#FFFFFF"><input type="text" name="news.newsTime" value="${news.newsTime}" readonly></td>
        </tr>
        <tr align="center">
            <td height="27" colspan="2" bgcolor="#FFFFFF"><span class="TableTitle1">新闻内容</span></td>
        </tr>
        <tr align="center">
            <td height="27" colspan="2" bgcolor="#FFFFFF"><textarea name="news.newsContent" cols="90" rows="20" class="textarea">${news.newsContent}</textarea></td>
        </tr>
        <tr align="center">
            <td height="2" colspan="2" bgcolor="#FFFFFF">
                <img src="../upload/${news.newsPhoto}" width=460 height=300 >
                <%--<a href="download.action?fileName=${news.newsPhoto}" >下载</a>--%>
                <%--<%String path=bf.SearchHead("WHERE iid='"+r.getIid()+"'").getPath();if(path==null){out.print("无图片");}else{out.print("<img src=../"+path+" width=460 height=300 >");}%></td>--%>
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
        <td height="50" colspan="5" align="right"><a href="manage_new.jsp">返回</a></td>
    </tr>
</table>
<script type="javascript">

</script>
<script type="text/javascript">
    var msg="${requestScope.message}";
    if(msg!=""){
        alert(msg);
    }
</script>
</body>
</html>
