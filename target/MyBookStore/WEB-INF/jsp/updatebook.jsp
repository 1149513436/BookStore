<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022/10/1
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新操作</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updatebookcommit">
  <div><input name="id" value="${book.id}"></div>
  <div>书名<input type="text" name="name" value="${book.name}"></div>
  <div>价格<input type="text" name="price" value="${book.price}"></div>
  <div><input type="submit" value="提交"></div>
</form>
${book}
</body>
</html>
