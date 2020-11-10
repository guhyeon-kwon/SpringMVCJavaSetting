<%--
  Created by IntelliJ IDEA.
  User: bitcamp
  Date: 2020-11-10(010)
  Time: 오후 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="obj" items="${list}">
        ${obj.data1}, ${obj.data2}, ${obj.data3}
    </c:forEach>
</body>
</html>
