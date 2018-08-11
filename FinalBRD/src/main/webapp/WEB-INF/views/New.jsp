<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error
{
color:red;
}
</style>
</head>
<body>
<h2>ADD NEW CUSTOMER DATAILS !!</h2>
<center>
<form:form name="myForm" action="/FinalBRD/welcomeuser/new" method="post" commandName="customer">
Customer name:<br>
<form:input type="text" name="name" path="name"/><br>
<form:errors path="name" Class="error"/><br>
Customer Address:<br>
<form:input type="text" name="address" path="address"/><br>
<form:errors path="address" Class="error"/><br>
Customer Pin Code:<br>
<form:input type="text" name="pinCode" path="pinCode"/><br>
<form:errors path="pinCode" Class="error"/><br>
Customer Email-Id:<br>
<form:input type="text" name="email" path="email"/><br>
<form:errors path="email" Class="error"/><br>
Customer Contact Number:<br>
<form:input type="text" name="Contact" path="Contact"/><br>
<form:errors path="Contact" Class="error"/><br>
<input type="submit" name="Create" value="Create"/><br>
</form:form>
</center>
</body>
</html>