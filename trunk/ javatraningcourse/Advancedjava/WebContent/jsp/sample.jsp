<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Sample jsp, I am in jsp folder
<br>
This is expression tag 
<%= request.getParameter("first_name")%>
<br>
this is Scriptlet tag
<% out.println(request.getParameter("last_name"));%>
<br>
<%!
public int add(int x, int y){
	return x+y;
}
%>
I am going to print the addition details
<%= add(1,2)%>

</body>
</html>