<%@ page contentType="text/html; charset=UTF-8" %> 
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello world : <s:property value="name"/>
	<br/>
	Student Name : <s:property value="student.name"/>
	<br/>
	Student Sno : <s:property value="student.sno"/>
	<br/>
	Student Age : <s:property value="student.age"/>
	<br/>
	<br/>
	Student2 Name : <s:property value="student2.name"/>
	<br/>
	Student2 Sno : <s:property value="student2.sno"/>
	<br/>
	Student2 Age : <s:property value="student2.age"/>
</body>
</html>