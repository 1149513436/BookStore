<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022/9/30
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>编号</th>
            <th>名字</th>
            <th>价格</th>
            <th>更新操作</th>
        </tr>
        <c:forEach var="book" items="${bookList}">
            <tr>
                <td>${book.id}</td>
                <td>${book.name}</td>
                <td>${book.price}</td>
                <td><a href="${pageContext.request.contextPath}/updatebook?id=${book.id}&name=${book.name}&price=${book.price}">更新信息</a> </td>
                <td><a href="${pageContext.request.contextPath}/delete?id=${book.id}">删除信息</a> </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
