<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js"></script>
<script language="javascript" type="text/javascript">
var timeout = setInterval(reloadChat, 10000);    
function reloadChat () {

     document.getElementById('links').contentwindow.location.reload();
}
</script>
</head>
<body>
<table>
<tr>
  <td><iframe width="400" height="800" src="/FinalBRD/welcomeuser/new" scrolling="yes"></iframe></td>
  <td><iframe id="links" width="1200" height="800" src="/FinalBRD/welcomeuser/viewAll" scrolling="yes"></iframe></td>
  </tr>
</table>
</body>
</html>