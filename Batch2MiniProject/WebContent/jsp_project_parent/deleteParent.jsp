<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<a href="getAllParentDetails">Get All Parent Details</a>	<br><br>

<a href="getParByStuId">Get Parent by Student ID</a>

<a href="insertParent">InsertParent</a>						<br><br>

<a href="deleteParent">DeleteParent</a>						

<form action="ParentDelete">
Enter Student ID to delete:<input type="text" name="studentId" />
<input type="submit" name="submit" />
</form>

<br><br>


</body>
</html>