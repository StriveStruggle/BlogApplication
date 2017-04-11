<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/4/11
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath %>"/>
    <title>Title</title>
</head>
<body>
<h1>hello,l love you</h1>
</body>
</html>
