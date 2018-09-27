<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: piotrek
  Date: 27.09.18
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3 >Witaj a panelu user/admin</h3>
<span au>
    <form:form action="/logout" method="post" >
    <input type="submit" value="Wyloguj"/>

    </form:form>
</span>

</body>
</html>
