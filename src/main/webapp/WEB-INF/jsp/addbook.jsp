<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022/9/30
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加书籍数据</h1>
<form action="http://localhost:8080/MyBookStore_war/addbookcommit" method="post">
  <div>书籍名字：<input name="name"></div>
  <div>书籍价格：<input name="price"></div>
   <input type="submit" value="提交">
</form>
</body>
</html>
