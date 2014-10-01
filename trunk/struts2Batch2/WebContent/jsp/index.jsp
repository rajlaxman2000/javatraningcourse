<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Hello World</title>
</head>
<body>
	<h1>Hello World From Struts2</h1>
	
	<s:form action="formRead" method="post">	
		
		<s:textfield name="number" label="Number" />
		<br/>
		Enter Student Name :: <input type="text" name="student.name" />
		<br/>
		Enter Student Sno :: <input type="text" name="student.sno" />
		<br/>
		Enter Student age :: <input type="text" name="student.age" />
		<br/>
		<s:submit name="submit" label="Submit" align="center" />
		
	</s:form>
	
</body>
</html>