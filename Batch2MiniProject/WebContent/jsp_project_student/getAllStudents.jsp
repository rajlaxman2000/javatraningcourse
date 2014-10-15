<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.student.dto.Student"%>
<%@ page import="com.student.service.StudentService"%>
<%@ page import="com.student.service.impl.StudentServiceImpl"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#pos {
	margin-left: 200px;
}

#one {
	padding-left: 50px;
}

#two {
	padding-left: 50px;
}
</style>
</head>
<body>
	<div id="pos">
		<a href="studentMenu">Student</a> <a href="parentMenu" id="one">Parent</a>
		<a href="branchMenu" id="two">Branch</a>
	</div>
	<br />
	<a href="getAllStudentDetails">Get All Student Details</a>
	<%
		List<Student> students = new ArrayList<Student>();
		students = (List<Student>) application.getAttribute("studentlist");

		for (Student student : students) {
	%>
	<%=student.toString()%><br />
	<%
		}
	%>

	<br>
	<br>
	<a href="getStuByName">Get Student by Name</a>
	<br>
	<br>

	<a href="getStuById">Get Student by ID</a>
	<br>
	<br>

	<a href="updateStudent">Update Student</a>
	<br>
	<br>

	<a href="insertStudent">Insert Student</a>
	<br>
	<br>

	<a href="deleteStudentByName">Delete Student By Name</a>
	<br>
	<br>

	<a href="deleteStudentById">Delete Student By ID</a>
	<br>
	<br>

</body>
</html>