<%--
  Created by IntelliJ IDEA.
  User: super.M
  Date: 2020/6/28
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>修改用户</h3>

<form action="${pageContext.request.contextPath}/user/update" method="post">
    姓名:<input type="text" name="username" value="${requestScope.user.username}"><br>
    密码:<input type="text" name="password" value="${requestScope.user.password}"><br>
    年龄:<input type="text" name="age" value="${requestScope.user.age}"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
