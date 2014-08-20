<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 2014/8/20
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>json 返回对象处理</title>
    <script language="javascript">
        var xmlHttp = false;
        try{
            xmlHttp = new ActiveXObject("msxml2.XMLHTTP");
        }catch(e1){
            try{
                xmlHttp = new ActiveXObject("microsoft.XMLHTTP");
            }catch(e2){
                try{
                    xmlHttp = new XMLHttpRequest();
                }catch(e3){
                    xmlHttp = false;
                }
            }
        }
        if(!xmlHttp){
            alert("create xmlHttpRequest fail");
        }
        function jsonResult(){
            xmlHttp.onreadystatechange = function(){
                if(xmlHttp.readyState == 4) {
                    // 将 JSON 对象转换为JSON字符串,需要注意调用eval函数时必须使用"("和")"将JSON字符串括起来,否则会出错
                    var newsObj = eval('(' + xmlHttp.responseText + ')');
                    var newsStr = "<table border=0>";
                    newsStr += '<tr><td><b>newsId</b></td><td>' + newsObj.JsonList.newsId + '</td></tr>';
                    newsStr += ('<tr><td><b>newsAuthor</b></td><td>' + newsObj.JsonList.newsAuthor + '</td></tr>');
                    newsStr += ('<tr><td><b>newsTitle</b></td><td>' + newsObj.JsonList.newsTitle + '</td></tr>');
                    newsStr += ('<tr><td><b>newsContent</b></td><td>' + newsObj.JsonList.newsContent + '</td></tr>');
                    newsStr += "</table>";
                    document.getElementById('jsonDiv').innerHTML = newsStr;
                }
            }
            xmlHttp.open("POST","news.action",true);
            xmlHttp.send(null);
        }
        function jsonListResult(){
            xmlHttp.onreadystatechange = function(){
                if(xmlHttp.readyState == 4) {
                    // 将 JSON 对象转换为JSON字符串,需要注意调用eval函数时必须使用"("和")"将JSON字符串括起来,否则会出错
                    var newsList = eval('(' + xmlHttp.responseText + ')');
                    var news = eval(newsList.JsonList);
                    var newsStr = "<table border=0>";
                    for (var i = 0; i < news.length; i++) {
                        newsStr += '<tr><td><b>newsId</b></td><td>' + news[i].newsId + '</td></tr>';
                        newsStr += ('<tr><td><b>newsAuthor</b></td><td>' + news[i].newsAuthor + '</td></tr>');
                        newsStr += ('<tr><td><b>newsTitle</b></td><td>' + news[i].newsTitle + '</td></tr>');
                        newsStr += ('<tr><td><b>newsContent</b></td><td>' + news[i].newsContent + '</td></tr>');
                    }
                    newsStr += "</table>";
                    document.getElementById('jsonDiv').innerHTML = newsStr;
                }
            }
            xmlHttp.open("POST","newsList.action",true);
            xmlHttp.send(null);
        }
    </script>
</head>
<body onload="jsonListResult();">
<div id="jsonDiv"></div>
<%--<input type="button" value="show" onclick="jsonResult();">--%>
</body>
</html>