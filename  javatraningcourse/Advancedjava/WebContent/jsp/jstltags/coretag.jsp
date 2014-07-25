<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="xml"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:out value="Hi This is out tage"></c:out>
	<c:catch>
		int x=20;
	</c:catch>
	<c:import var="data" url="/jsp/directivesex/test.jsp"></c:import>
	<c:out value="${data}"></c:out>
	<br/>
	<c:forEach var="x" begin="1" end="10">
		<br/>
		<!-- 
		<c:if test="${x < 5 }">
			<c:out value="${x}"></c:out>
		</c:if>
		 -->
		<c:choose>
			<c:when test="${ x == 8}">
				<c:out value="Number eight comes here"></c:out>
			</c:when>
			<c:when test="${ x == 7}">
				<c:out value="Number SEVEN comes here"></c:out>
			</c:when>
			<c:otherwise>
				<c:out value="${x}"></c:out>
			</c:otherwise>		
		</c:choose>
	
		
	</c:forEach>
	
	<%--
	  <c:redirect url="/jsp/directivesex/test.jsp"></c:redirect>
	  --%>
	
	
</body>
</html>