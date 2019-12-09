<%--
  Created by IntelliJ IDEA.
  User: JT.L
  Date: 2019/12/2
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>入门成功</h3>
<%--EL表达式11个域对象，这个是request域的map集合--%>
${requestScope.msg}<%--也可以直接简写：${msg}--%>
<br>
${sessionScope}
<br>
<%=request.getAttribute("msg")%>

</body>
</html>
