<%--
  Created by IntelliJ IDEA.
  User: super.M
  Date: 2020/6/28
  Time: 8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="param/testParam?name=张三&age=18">入门案例</a>
<form action="param/saveAccount" method="post">
    账号：<input type="text" name="name"/><br>
    密码：<input type="text" name="password"/><br>
    金额：<input type="text" name="money"/><br>
    用户姓名：<input type="text" name="user.username"/><br>
    用户年龄：<input type="text" name="user.age"/><br>
    用户姓名（list)：<input type="text" name="list[0].username"/><br>
    用户年龄（list)：<input type="text" name="list[0].age"/><br>
    用户姓名（list)：<input type="text" name="list[1].username"/><br>
    用户年龄（list)：<input type="text" name="list[1].age"/><br>

    用户姓名（map)：<input type="text" name="map['one'].username"/><br>
    用户年龄（map)：<input type="text" name="map['one'].age"/><br>
    用户姓名（map)：<input type="text" name="map['two'].username"/><br>
    用户年龄（map)：<input type="text" name="map['two'].age"/><br>
    <input type="submit" value="提交"/><br>
</form>


<form action="param/saveUser" method="post">
    姓名：<input type="text" name="username"/><br>
    年龄：<input type="text" name="age"/><br>
    生日：<input type="text" name="birthday"/><br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
