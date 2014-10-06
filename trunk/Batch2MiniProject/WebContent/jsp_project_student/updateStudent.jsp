<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="pos">
<a href="studentMenu" >Student</a>
<a href="parentMenu" id="one">Parent</a>
<a href="branchMenu" id="two">Branch</a>
</div>
<br/>
<a href="getAllStudentDetails">Get All Student Details</a>

<a href="getStuByName">Get Student by Name</a><br><br>

<a href="getStuById">Get Student by ID</a><br><br>

<a href="updateStudent">Update Student</a><br><br>
<form action="updateStudent">
Enter Student details you want to update :
<br>student ID: <input type="text" name="studentId" />
<br>Student name: <input type="text" name="studentName" />
<br>branch ID: <input type="text" name="branchId" />
<input type="submit" name="submit" />
</form>
<a href="insertStudent">Insert Student</a><br><br>

<a href="deleteStudentByName">Delete Student By Name</a><br><br>

<br><br>

<a href="deleteStudentById">Delete Student By ID</a><br><br>
</body>
</html>