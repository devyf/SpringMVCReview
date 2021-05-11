<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2021/5/11
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求乱码问题处理</title>
</head>
<body>
    <form method="post" action="/restful/insert">
        <input type="text" name="username">
        <input type="submit" value="提交">
    </form>
</body>
</html>
