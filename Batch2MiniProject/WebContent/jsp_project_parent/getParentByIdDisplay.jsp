<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.student.dto.Parent" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#pos{margin-left:200px;}
#one{padding-left:50px;}#two{padding-left:50px;}
</style>
</head>

<body>
<div id="pos">
<a href="studentMenu" >Student</a>
<a href="parentMenu" id="one">Parent</a>
<a href="branchMenu" id="two">Branch</a>
</div>
<br/>
<a href="getAllParentDetails">Get All Parent Details</a><br><br>

<a href="getParByStuId">Get Parent by Student ID</a>

<%Parent par = (Parent)session.getAttribute("parentbyID"); %>
<%=par.toString() %>


<br><br>

<a href="insertParent">InsertParent</a><br><br>

<a href="deleteParent">DeleteParent</a><br><br>

</body>
</html>