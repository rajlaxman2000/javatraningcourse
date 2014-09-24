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
<a href="getAllBranches">Get All Branch Details</a>This is Retreive All branch JSP file.<br><br>
<a href="getBranchById">Get Branch by ID</a>	<br><br>
<a href="updateBranch">UpdateBranch</a>			<br><br>
<a href="insertBranch">InsertBranch</a>			<br><br>
<a href="deleteBranch">DeleteBranch</a>			<br><br>

</body>
</html>