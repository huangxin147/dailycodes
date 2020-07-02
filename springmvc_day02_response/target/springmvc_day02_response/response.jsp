<%--
  Created by IntelliJ IDEA.
  User: super.M
  Date: 2020/6/28
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery.min.js"></script>
<script>
    $(function () {
        $("#btn").click(function () {
            alert("ok");
            $.ajax({
                url:"user/testJson",
                contentType:"application/json;charset=utf-8",
                data:'{"username":"tom","password":"123","age":30}',
                dataType:"json",
                type:"post",
                success:function (data) {
                    alert(data);
                    alert(data.username);
                    alert(data.password);
                    alert(data.age);
                }
            })
        });
    });

</script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>ResponseBody响应json数据</h3>
<input type="button" value="提交" id="btn"/>
<h3>返回字符串</h3>
<a href="user/testReturnString">返回字符串</a><br>
<a href="user/userUpdate">修改用户（表单回显）</a>

<h3>无返回值void</h3>
<a href="user/testVoid">无返回值</a>

<h3>返回ModelAndView对象</h3>
<a href="user/testModelAndView">ModelAndView</a>

<h3>转发和重定向</h3>
<a href="user/testForwardOrRedirect">ForwardOrRedirect</a>

</body>
</html>
