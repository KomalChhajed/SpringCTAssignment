<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form>
	
	<br>
	<c:if test="${not empty studentlist}">
	<table border="2">
		
			<tr>
				<th>Name</th><th>Email</th><th>Phone</th>
			</tr>
			<c:forEach var="var" items="${studentlist}">
			<tr>
				<td>${var.name}</td><td>${var.email}</td><td>${var.phone}</td>
			</tr>		
			</c:forEach>
		
	</table>
	
	</c:if>
	<c:if test="${empty empList}">
	
		<h2>No Employees Available</h2>
	
	</c:if>
</form:form>

</body>
</html>