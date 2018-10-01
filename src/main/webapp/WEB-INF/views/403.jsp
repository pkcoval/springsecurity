<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: piotrek
  Date: 01.10.18
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Jako <%=request.getUserPrincipal().getName().toString()%> nie masz dostępu do tej strony  </h3>

<form:form action="/login" method="post" >


    <h3>Strona logowania</h3>
    <div><label> User Name : <input type="text" name="username"/> </label></div>
    <div><label> Password: <input type="password" name="password"/> </label></div>
    <div><input type="submit" value="Zaloguj"/></div>


</form:form>


</body>
</html>
