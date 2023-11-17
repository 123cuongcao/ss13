<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/16/2023
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>home</h1>
<%--    <form action="/add" method="post">--%>
<%--        <input type="text" name="name">--%>
<%--        <select name="gender" >--%>
<%--            <option value="true">Nam</option>--%>
<%--            <option value="false">Nữ</option>--%>
<%--        </select>--%>
<%--        <input type="number" name="age">--%>
<%--        <input type="date" name="birthday">--%>
<%--        <button type="submit"> GỬI </button>--%>
<%--    </form>--%>
    <form action="/dictionary">
        <form action="/">
            <input name="TA" type="text" value="table">
            <button type="submit"></button>
        </form>
        <p>Tiếng việt : ${output}  </p>
    </form>
    <form action="/change">
        <input type="number" name="money">
        <button type="submit">chuyển đổi</button>
    </form>
</body>
</html>
