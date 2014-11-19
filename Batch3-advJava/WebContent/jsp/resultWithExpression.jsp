<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<%= "Usre name is ::"+request.getParameter("name")+"; pass word is ::"+request.getParameter("password")%>
	<br/>
	<%! Date date = Calendar.getInstance().getTime(); %>
	<br/>
	<%! String gender = new String("Male");%>
	<br/>
	<%= "current Date with time s ::"+date%>
	<br/>
	<% out.println("Gender is"+gender); %>
</body>
</html>