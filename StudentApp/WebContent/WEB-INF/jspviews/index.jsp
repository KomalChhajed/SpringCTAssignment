<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Welcome to Student Course Enrollment Application

<a href="${pageContext.request.contextPath}/addcourse.html">Add Course</a>
<br>
<a href="${pageContext.request.contextPath}/addstudent.html">Add Student </a>
<br>
<a href="${pageContext.request.contextPath}/enroll.html">Enroll Student</a>
<br>
<a href="${pageContext.request.contextPath}/listcourse.html">Courses List</a>
<br>
<a href="${pageContext.request.contextPath}/deletecourse.html">Delete Course</a>
<br>
<a href="${pageContext.request.contextPath}/studentdetails.html">Student Details in a Course</a>

</body>
</html>