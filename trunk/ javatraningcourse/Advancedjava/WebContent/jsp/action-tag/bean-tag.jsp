<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="servlets.beans.User" scope="session"></jsp:useBean> 
 
<jsp:setProperty property="*" name="user"/>  
  
Record:<br>  
<jsp:getProperty property="name" name="user"/><br>  
<jsp:getProperty property="age" name="user"/><br>  

<a href="second.jsp">Go to Second jsp</a>  
  