<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 2014/8/20
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<s:set name="username" value="#session.SESSION_KEY_USER_NAME"/>
<table width="776" height="310"  border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td valign="top" background="../images/admin_top1.gif">
            <table width="100%" height="100%" border="0" align="center" cellpadding="0" cellspacing="0" >
                <tr>
                    <td height="28" colspan="4" align="center"></td>
                </tr>
                <tr>
                    <td width="426" height="25" align="center">&nbsp;</td>
                    <td width="142" align="center" >当前管理员<s:property value="#username"/> </td>
                    <td width="102" align="center"><a href="../index.jsp" target="_parent">返回首页</a></td>
                    <td width="97" align="center"><a href="exit.jsp" target="_parent">安全退出</a></td>
                    <td width="9"></td>
                </tr>
                <tr>
                    <td colspan="4" align="center">&nbsp;</td>
                </tr>
            </table>	</td>
    </tr>
</table>
