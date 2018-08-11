<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@include file="admin.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER REGISTRATION</title>
<style type="text/css">
.error
{
color:red;
}
</style>
</head>
<body>
<center>
<form:form name="myForm" action="/FinalBRD/welcomeadmin/new" method="post" modelAttribute="user">
User name:<br>
<form:input path="username"/><br>
<form:errors path="username" Class="error"/><br>
Password:<br>
<form:input path="password"/><br>
<form:errors path="password" Class="error"/><br>
Enabled:<br>
<form:select path="enabled"><br>
<form:option value="1">ACTIVE</form:option>
<form:option value="0">INACTIVE</form:option>
<form:errors path="enabled" Class="error"/><br>
</form:select><br>
<input type="submit" name="Create" value="Create"/><br>
</form:form>
</center>
</body>
</html>