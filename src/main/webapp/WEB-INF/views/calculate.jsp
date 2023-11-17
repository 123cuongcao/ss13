<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/16/2023
  Time: 5:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculatting" method="get">
    <input type="text" name="num1" value="${num1}">
    <select name="op" >
        <option value="plus">+</option>
        <option value="minus">-</option>
        <option value="divison">*</option>
        <option value="multiply">/</option>
    </select>
    <input type="text" name="num2" value="${num2}">
    <p>${result}</p>
    <button type="submit">Tính toán</button>
</form>
</body>
</html>
