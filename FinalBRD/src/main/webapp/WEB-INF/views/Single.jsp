<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="Menu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table id="example" cellspacing="0"  class="display" width="60%">
        <thead>
            <tr>
                <tr>
                <th>Customer Code</th>
                <th>Customer Name</th>
                 <th>Customer Address</th>
                   <th>Customer Pin Code</th>
                    <th>Customer Email</th>
                     <th>Customer Contact Number</th>
                         <th>Customer Registration Date</th>
                          <th>Customer Created by </th>
                           <th>Customer Modify date</th>
                             
            </tr>
            
        </thead>
        <tfoot>
            <tr>
                <th>Customer Code</th>
                <th>Customer Name</th>
                 <th>Customer Address</th>
                   <th>Customer Pin Code</th>
                    <th>Customer Email</th>
                     <th>Customer Contact Number</th>
                         <th>Customer Registration Date</th>
                          <th>Customer Created by </th>
                           <th>Customer Modify date</th>
            </tr>
        </tfoot>
        <tbody>
       
			   <tr>
                       
                           <td>${customers.getCode()}</td>
                            <td>${customers.getName()}</td>
                             <td>${customers.getAddress()}</td>
                               <td>${customers.getPinCode()}</td>
                                <td>${customers.getEmail()}</td>
                                 <td>${customers.getContact()}</td>
                                     <td>${customers.getRegistrationDate()}</td>
                                      <td>${customers.getCreatedBy()}</td>
                                       <td>${customers.getModifiedDate()}</td>
                    </tr>
        </tbody>
        </table>
<script src="https://code.jquery.com/jquery-1.12.4.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js" type="text/javascript"></script>
<script>
$(document).ready(function()
{
    $('#example').DataTable();
} );
</script>
</body>
</html>