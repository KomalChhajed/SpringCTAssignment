<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Enter the name of course you want to delete
<br>
${msg }
<form action="deletecourseobj" method="post" >
Course Name:&nbps;<input type="text" name="name" id="name">
<input type="submit" value="Delete">
</form>
</body>
</html>