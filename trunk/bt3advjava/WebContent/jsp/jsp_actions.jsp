<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	This is JSP Actions display jsp file,
	I am going to include the dateDisplay.jsp file to see whether it is working or not.
	<br/>
	<jsp:include page="dateDisplay.jsp"></jsp:include>
	<%-- <jsp:forward page="../login_html/login.html"></jsp:forward>--%>
	
	<br/>
	<jsp:useBean id="user" class="servlets.login.User"></jsp:useBean>
	
	<jsp:setProperty name="user" property="userName" value="Rajesh Reddy"/>
	<jsp:setProperty name="user" property="screenName" value="rajlaxman200"/>
	
	<jsp:getProperty name="user" property="screenName"/>
</body>
</html>