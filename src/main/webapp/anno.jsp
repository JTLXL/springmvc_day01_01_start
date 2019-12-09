<%--
  Created by IntelliJ IDEA.
  User: JT.L
  Date: 2019/12/4
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--常用的注解--%>
<a href="anno/testRequestParam?name=陆星林">RequestParam</a><br>

<br>
<form action="anno/testRequestBody" method="post">
    用户姓名：<input type="text" name="uname"><br>
    用户年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交"><br>
</form>

<a href="anno/testPathVariable/7">testPathVariable</a><br>
<a href="anno/testRequestHeader">RequestHeader</a><br>
<a href="anno/testCookieValue">CookieValue</a><br>

<form action="anno/testModelAttribute" method="post">
    用户姓名：<input type="text" name="uname"><br>
    用户年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交"><br>
</form>
<a href="anno/testSessionAttributes">testSessionAttributes</a>
<a href="anno/getSessionAttributes">getSessionAttributes</a>
<a href="anno/delSessionAttributes">delSessionAttributes</a><br>


</body>
</html>
