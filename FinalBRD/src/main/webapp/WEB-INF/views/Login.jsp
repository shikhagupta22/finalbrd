<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<style type="text/css">
    .bs-example{
    	margin: 20px;
	width:300px;
    }
</style>
</head>
<body>
<c:if test="${not empty isError}">
Invalid User
</c:if>
    <center>
<div class="bs-example" style="margin-top:100px">


    <form action="j_spring_security_check" method="post" >
     
         <h2>User Login</h2>
            <table>
            <tr class="form_group"><td>
            <label for="j_username">Username:&nbsp;</label></td><td>
            <input type="text" class="form-control" id="j_username" name="j_username"  required></td></tr>
           <tr class="form_group"><td>
            <label for="j_password">Password:&nbsp;</label></td><td>
            <input type="password" class="form-control" id="j_password"  name="j_password"  required></td></tr>     
         <tr><td>&nbsp;</tr>
        <tr style="margin-top:10px;"><td colspan="2" align="center" >
        <button type="submit" class="btn btn-primary">Login</button></td></tr>
        </table>
    </form>
</div>
</center>
</body>
</html>