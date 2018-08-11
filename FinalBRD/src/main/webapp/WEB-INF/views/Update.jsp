<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="Menu.jsp"%>
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
<body><center>
<form:form name="Form" action="/FinalBRD/welcomeuser/updatedo" method="post" modelattribute="customer" commandName="customer">
Customer code:<br>
<form:input type="text" name="Code" path="Code" value="${customer.getCode()}" readonly="true"/><br>
<form:errors path="Code" Class="error"/><br>
Customer name:<br>
<form:input type="text" name="Name" path="Name" value="${customer.getName()}"/><br>
<form:errors path="Name" Class="error"/><br>
Customer Primary Address:<br>
<form:input type="text" name="address" path="address" value="${customer.getAddress()}"/><br>
<form:errors path="address" Class="error"/><br>
Customer Pin Code:<br>
<form:input type="text" name="pinCode" path="pinCode" value="${customer.getPinCode()}"/><br>
<form:errors path="pinCode" Class="error"/><br>
Customer Email-Id:<br>
<form:input type="text" name="email" path="email" value="${customer.getEmail()}"/><br> 
<form:errors path="email" Class="error"/><br>
Customer Contact Number:<br>
<form:input type="text" name="Contact" path="Contact" value="${customer.getContact()}"/><br>
<form:errors path="Contact" Class="error"/><br>
Customer Registration Date:<br>
<form:input type="text" name="registrationDate" path="registrationDate" value="${customer.getRegistrationDate()}" readonly="true"/><br>
<form:errors path="registrationDate" Class="error"/><br>
Created by:<br>
<form:input type="text" name="createdBy" path="createdBy" value="${customer.getCreatedBy()}" readonly="true"/><br>
<input type="submit" name="Update" value="Update"><br>
</form:form>
</center>
</body>
</html>