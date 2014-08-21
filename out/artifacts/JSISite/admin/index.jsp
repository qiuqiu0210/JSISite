<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title>管理员控制台</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<frameset rows="*" cols="*,776,*" framespacing="1" frameborder="no" border="1" >
    <frame src="blank.jsp" name="blankFrame" scrolling="NO" noresize>
    <frameset rows="145,*,100" cols="*" framespacing="1" frameborder="no" border="1" >
        <frame src="top.jsp" name="topFrame" scrolling="NO" noresize>
        <frameset rows="*" cols="179,*" frameborder="yes"  bordercolordark="#ffffff">
            <frame src="left.jsp" name="leftFrame" scrolling="NO" noresize>
            <frame src="main.jsp" name="mainFrame">
        </frameset>
        <frame src="bottom.jsp" name="bottomFrame" scrolling="NO" noresize>
    </frameset>
    <frame src="blank.jsp" name="blankFrame">
</frameset>
<noframes>
    <body> </body>
</noframes>
</html>
