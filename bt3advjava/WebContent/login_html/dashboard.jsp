<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="servlets.login.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href='index.html'>Index</a> | 
	<a href='profileSettings'>Profile Settings</a> | 
	<a href='logout'>Logout</a>|	
	<br/>
	<%-- afsfafa --%>
	
	<%! 
		int x = 10;
		User user;
	%>
	<% user = (User)getServletConfig().getServletContext().getAttribute("profileDetails");  %>
	
	
	
	<%= "Logged in User name is ::"+user.getUserName()+x%>
	
</body>
</html>