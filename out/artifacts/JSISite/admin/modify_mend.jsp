<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>modify_mend</title>
</head>
<link href="../css/admin.css" rel="stylesheet" type="text/css">
<%--<script src="../js/validate.js"></script>--%>
<body>
<s:action name="modifyfile" namespace="/"/>
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" class="tableNew">
    <tr align="center">
        <td colspan="2" class="TableTitle1" >修改工具软件</td>
    </tr>
    <form name="fileform" action="modifyfile" method="post">
        <input type="hidden" name="upFile.fileId" value="${upFile.fileId}">
        <input type="hidden" name="upFile.filePath" value="${upFile.filePath}">
        <input type="hidden" name="upFile.fileSuffix" value="${upFile.fileSuffix}">
        <input type="hidden" name="upFile.fileCount" value="${upFile.fileCount}">
        <input type="hidden" name="upFile.fileTime" value="${upFile.fileTime}">
        <tr align="center">
            <td width="23%" bgcolor="#FFFFFF">软件名称</td>
            <td align="left" bgcolor="#FFFFFF"><input name="upFile.fileTitle" type="text" value="${upFile.fileTitle}" size="40"></td>
        </tr>
        <%--<tr align="center">--%>
            <%--<td bgcolor="#FFFFFF">软件类别</td>--%>
            <%--<td align="left" bgcolor="#FFFFFF"><select name="sid">--%>
                <%--<option>—请选择—</option>--%>
            <%--</select></td>--%>
        <%--</tr>--%>
        <%--<tr align="center">--%>
            <%--<td bgcolor="#FFFFFF">软件类型</td>--%>
            <%--<td align="left" bgcolor="#FFFFFF"><input name="upFile.fileKind" type="radio" class="noborder" value="0" >--%>
                <%--工具--%>
                <%--<input name="state" type="radio" class="noborder" value="1" checked>--%>
                <%--补丁</td>--%>
        <%--</tr>--%>
        <%--<tr align="center">--%>
            <%--<td bgcolor="#FFFFFF">推荐指数</td>--%>
            <%--<td align="left" bgcolor="#FFFFFF"><select name="commend">--%>
                <%--<option value="1">1</option>--%>
                <%--<option value="2">2</option>--%>
                <%--<option value="3" selected>3</option>--%>
                <%--<option value="4">4</option>--%>
                <%--<option value="5">5</option>--%>
            <%--</select></td>--%>
        <%--</tr>--%>
        <%--<tr align="center">--%>
        <%--<td bgcolor="#FFFFFF">程序大小</td>--%>
        <%--<td align="left" bgcolor="#FFFFFF"><input name="filesize" type="text" onBlur="return filesizes()">--%>
        <%--(MB)</td>--%>
        <%--</tr>--%>
        <tr align="center">
            <td bgcolor="#FFFFFF">软件类型</td>
            <td align="left" bgcolor="#FFFFFF">
                <input name="upFile.fileKind" type="radio" class="noborder" value="0" >
                工具
                <input name="upFile.fileKind" type="radio" class="noborder" value="1">
                补丁</td>
            <script type="text/javascript">
//                window.onload=function{
                    document.getElementsByName("upFile.fileKind")[${upFile.fileKind}].checked=true;
//                }
            </script>
        </tr>
        <tr align="center">
            <td bgcolor="#FFFFFF">文件名称</td>
            <td align="left" bgcolor="#FFFFFF"><input type="text" name="upFile.fileName" value="${upFile.fileName}" readOnly></td>
        </tr>
        <tr align="center">
            <td bgcolor="#FFFFFF">其他说明</td>
            <td align="left" bgcolor="#FFFFFF"><textarea name="upFile.fileInfo" cols="50" rows="5" class="textarea">${upFile.fileInfo}</textarea></td>
        </tr>
        <tr align="center">
            <td height="27" colspan="2" bgcolor="#FFFFFF">
                <input name="Submit" type="submit" class="btn_grey" value="提交">
                &nbsp;&nbsp;
                <input name="Submit2" type="reset" class="btn_grey" value="重置"> </td>
        </tr>
    </form>
</table>
<table width="80%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td height="50" colspan="5" align="right"><a href="manage_mend.jsp">返回</a></td>
    </tr>
</table>
<script type="text/javascript">
    var msg="${requestScope.message}";
    if(msg!=""){
        alert(msg);
    }
</script>
</body>
</html>
