<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<link href="../css/admin.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<title>manage_mend</title>
</head>
<body bgcolor="#ffffff">
<s:action name="file" namespace="/"/>
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" class="tableNew"> 
  <tr align="center"> 
    <td colspan="6" class="TableTitle1" >工具/补丁下载管理</td> 
  </tr> 
  <tr align="center"> 
    <td colspan="5" bgcolor="#FFFFFF">&nbsp;</td> 
    <td bgcolor="#FFFFFF"><a href="add_mend.jsp" target="_self" >添加工具/补丁软件</a></td> 
  </tr> 
  <tr align="center"> 
    <td height="27" bgcolor="#FFFFFF">软件名称</td>
    <td bgcolor="#FFFFFF">文件名称</td>
    <td bgcolor="#FFFFFF">上传时间</td> 
    <td bgcolor="#FFFFFF">下载数量</td> 
    <td bgcolor="#FFFFFF">软件类型</td> 
    <td width="20%" bgcolor="#FFFFFF">下载/修改/删除</td>
      <s:set name="list" value="#session.fileList"/>
      <s:if test="#list==null">
          <tr align="center">
              <td height="27" colspan="5" bgcolor="#FFFFFF">当前解决方案为空</td>
          </tr>
      </s:if>
      <s:else>
          <s:iterator id="file" value="#list" status="st">
              <tr align="center">
                <td height="27" bgcolor="#FFFFFF">${file.fileTitle}</td>
                <td bgcolor="#FFFFFF"><a href="infofile.action?id=${file.fileId}">${file.fileName}</a></td>
                <td bgcolor="#FFFFFF">${file.fileTime}</td>
                <td bgcolor="#FFFFFF">${file.fileCount}</td>
                <td bgcolor="#FFFFFF">${file.fileKind}</td>
                <%--<td bgcolor="#FFFFFF"><%=a.getState()==FinalConstants.STATE_MEND?"补丁":"工具"%></td>--%>
                <td bgcolor="#FFFFFF">
                    <a href="download.action?&fileName=${file.fileName}">
                        <img src="../images/download.gif" border="0"></a>
                    &nbsp;&nbsp;
                    <a href="modifyfile.action?&id=${file.fileId}">
                    <img src="../images/modify.gif" border="0"></a>
                    &nbsp;&nbsp;
                    <a href="delfile.action?id=${file.fileId}" onClick="javascript:return confirm('你确定删除该工具软件吗？')">
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
