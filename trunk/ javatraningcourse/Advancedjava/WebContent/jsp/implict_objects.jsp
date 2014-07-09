<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% out.println("Hi How ru");%> 
		<br>
		<%out.println(request.getParameter("first_name"));
		
		String name=request.getParameter("first_name");  
		out.print("Welcome "+name);  
		  
		pageContext.setAttribute("first_name",name,PageContext.SESSION_SCOPE);  
		%> 
		<a href="connecting.jsp">connecting jsp page</a>  
		  

		
</body>
</html>