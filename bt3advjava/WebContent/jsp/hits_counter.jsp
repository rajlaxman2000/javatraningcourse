<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%	response.setIntHeader("Refresh",5);		
		Integer count = (Integer)application.getAttribute("counter");
	
		if(count == null || count ==0){
			count  = 1;
			out.println("Some body came first time");
		}else{
			count = count +1;
			out.println("Some body is comming again and again");
		}
		
		application.setAttribute("counter",count);
	%>
	<h2> Total no of hits on this page: <%= count%></h2>
</body>
</html>