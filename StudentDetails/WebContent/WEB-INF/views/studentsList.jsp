<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Students</title>
</head>
<body>
<h1>List Students</h1>
<!-- link for index page -->
<h2> <a href="index.html">Home</a></h2>
<!-- link for adding students page -->
<h3><a href="add.html">Add More Students</a></h3>
<!-- table showing available students -->
<c:if test="${!empty students}">
	<table align="left" border="1">
		<tr>
		<th>Student ID</th>
			<th>Student Name</th>
			<th>Student Age</th>
			<th>Student email</th>
		</tr>

		<c:forEach items="${students}" var="student">
			<tr>
				<td><c:out value="${student.studentId}"/></td>
				<td><c:out value="${student.studentName}"/></td>
				<td><c:out value="${student.age}"/></td>
				<td><c:out value="${student.email}"/></td>
				

			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>