<%--
  Created by IntelliJ IDEA.
  User: super.M
  Date: 2020/6/28
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body>
<h3>RequestParam入门案例</h3>

<a href="anno/testRequestParam?name=哈哈&age=22">RequestParam</a>

<h3>@PathVariable注解</h3>
<!-- PathVariable注解 -->
<<a href="anno/testPathVariable/3/zhangsan">PathVariable注解</a>


<h3>测试@ModelAttrbute注解</h3>
需求:修改用户信息,要求用户的日期不能修改 jsp代码:
<form action="anno/testModelAttribute" method="post">
    用户名称:<input type="text" name="username"><br>
    用户年龄:<input type="text" name="age"><br>
    <input type="submit" value="保存">
</form>

</body>
</body>
</html>
