<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:fuchsia;">WELCOME TO JSP</h1>
<% 
	String uname = (String) session.getAttribute("uname");
	out.print("Welcome "+uname);
%>
<!-- JSP pages -->
<!-- EL expression isELIgnored="false" ${uname}-->
WELCOME Again: ${uname}
</body>
</html>