<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="courseobj" method="POST" action="/addcourseobj">
<table border="2">
<tr>
<td>NAme: </td>
<td><form:input path="name"/></td>
<tr>
<td>Professor Name</td>
<td><form:input path="profname"/></td>
<tr>
<td>Description</td>
<td><form:input path="description"/></td>
</tr>
<tr>
<td><input type="submit" value="Add"></td>
<td><input  type="reset" value="Reset"></td>
</tr>
</table>
</form:form>

</body>
</html>