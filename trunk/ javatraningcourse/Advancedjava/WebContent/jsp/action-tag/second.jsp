<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="servlets.beans.User" scope="session"></jsp:useBean>  
Record:<br>  
<jsp:getProperty property="name" name="user"/><br>  
<jsp:getProperty property="age" name="user"/><br>  
  