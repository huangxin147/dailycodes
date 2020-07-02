<%--
  Created by IntelliJ IDEA.
  User: super.M
  Date: 2020/6/29
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>访问成功</h1>
<c:forEach var="account" items="${list}">
    ${account.id}---
    ${account.name}---
    ${account.money}<br>
</c:forEach>
</body>
</html>
