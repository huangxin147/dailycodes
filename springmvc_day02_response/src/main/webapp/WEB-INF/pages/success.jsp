<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: super.M
  Date: 2020/6/27
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>访问成功</h1>

<h3>遍历集合</h3>
<c:if test="${list!=null&&list.size()>0}">
    <c:forEach items="${list}"  var="user">
        ${user.username}---${user.age}
    </c:forEach>
</c:if>
</body>
</html>
