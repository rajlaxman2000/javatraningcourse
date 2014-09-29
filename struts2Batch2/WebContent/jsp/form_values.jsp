<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Hello World</title>
</head>
<body>
	<h1>It is a Huge success</h1>
	<br/>
	Student Name : <s:property value="student.name"/>
	
	<br/>
	Student Sno : <s:property value="student.sno"/>
	<br/>
	Student Age : <s:property value="student.age"/>
	
	<br/>
	<h2>Student 2 details</h2>
	Student Name : <s:property value="student1.name"/>
	<br/>
	Student Sno : <s:property value="student1.sno"/>
	<br/>
	Student Age : <s:property value="student1.age"/>
	
</body>
</html>