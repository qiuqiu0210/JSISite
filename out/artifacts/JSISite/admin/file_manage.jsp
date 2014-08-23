<%--
  Created by IntelliJ IDEA.
  User: songliu
  Date: 2014/8/21
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <link href="../css/admin.css" rel="stylesheet" type="text/css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
    <title>file_manage</title>
</head>
<body bgcolor="#ffffff">
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" class="tableNew">
    <tr align="center">
        <td colspan="6" class="TableTitle1" >工具/补丁下载管理</td>
    </tr>
    <tr align="center">
        <td colspan="5" bgcolor="#FFFFFF">&nbsp;</td>
        <td bgcolor="#FFFFFF"><a href="addfile.action" target="_self" >添加工具/补丁软件</a></td>
    </tr>
    <tr align="center">
        <td height="27" bgcolor="#FFFFFF">软件名称</td>
        <td bgcolor="#FFFFFF">文件名称</td>
        <td bgcolor="#FFFFFF">上传时间</td>
        <td bgcolor="#FFFFFF">下载数量</td>
        <td bgcolor="#FFFFFF">软件类型</td>
        <td width="20%" bgcolor="#FFFFFF">下载/修改/删除</td>
    </tr>
    <s:set name="list" value="#session.fileList"/>
    <s:if test="#list==null">
    <tr align="center">
        <td height="27" colspan="5" bgcolor="#FFFFFF">当前解决方案为空</td>
    </tr>
    </s:if>
    <s:else>
        <s:iterator id="file1" value="#list" status="st">
            <!-- 若是用file作为id，会与modify页面提交的file表单重名，从而读取出错 -->
            <tr align="center">
                <td height="27" bgcolor="#FFFFFF">${file1.fileTitle}</td>
                <td bgcolor="#FFFFFF"><a href="infofile.action?id=${file1.fileId}">${file1.fileName}</a></td>
                <td bgcolor="#FFFFFF">${file1.fileTime}</td>
                <td bgcolor="#FFFFFF">${file1.fileCount}</td>
                <td bgcolor="#FFFFFF">${file1.fileKind}</td>
                    <%--<td bgcolor="#FFFFFF"><%=a.getState()==FinalConstants.STATE_MEND?"补丁":"工具"%></td>--%>
                <td bgcolor="#FFFFFF">
                    <a href="../download.action?type=file&fileName=${file1.fileName}">
                        <img src="../images/download.gif" border="0"></a>
                    &nbsp;&nbsp;
                    <a href="modifyfile.action?id=${file1.fileId}">
                        <img src="../images/modify.gif" border="0"></a>
                    &nbsp;&nbsp;
                    <a href="delfile.action?id=${file1.fileId}" onClick="javascript:return confirm('你确定删除该工具软件吗？')">
                        <img src="../images/del.gif" border="0"></a></td>
            </tr>
        </s:iterator>
    </s:else>
    <tr align="right">
        <td height="27" colspan="6" bgcolor="#E9F2F6"></td>
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
