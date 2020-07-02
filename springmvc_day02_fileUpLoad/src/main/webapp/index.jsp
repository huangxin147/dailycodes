
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<a href="user/testFileUpload">文件上传</a>
<hr>
<form action="user/testFileUpload" method="post" enctype="multipart/form-data">
    <input type="file" name="upload">
    <input type="submit" value="提交">
</form>
</body>
</html>
