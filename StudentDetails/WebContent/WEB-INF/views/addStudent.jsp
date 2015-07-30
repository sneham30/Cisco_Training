<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
	</head>
	<body>
	<!-- link for index page -->
	<h2> <a href="index.html">Home</a></h2>
		<h2>Add Student Data</h2>
		<!-- Form to take inputs -->
		<form:form method="POST" action="save.html" modelAttribute="student" commandName="student">
	   		<table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Student Form - Registration</h2></td>
                </tr>
                 <tr>
                    <td>Student ID:</td>
                    <td><form:input path="studentId" /></td>
                </tr>
                <tr>
                    <td>Student Name:</td>
                    <td><form:input path="studentName" /></td>
                </tr>
                
                <tr>
                    <td>E-mail:</td>
                    <td><form:input path="email" /></td>
                </tr>
                
                <tr>
                    <td>Age:</td>
                    <td><form:input path="age" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Save" /></td>
                </tr>
            </table>
		</form:form>
	<!-- table showing available students -->	
  <c:if test="${!empty students}">
		<h2>List of Students</h2>
	<table align="left" border="1">
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>Student Age</th>
			<th>Student email</th>
			
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${students}" var="student">
			<tr>
				<td><c:out value="${student.studentId}"/></td>
				<td><c:out value="${student.studentName}"/></td>
				<td><c:out value="${student.age}"/></td>
				<td><c:out value="${student.email}"/></td>
				
				<td align="center"><a href="edit.html?id=${student.studentId}">Edit</a>|<a href="delete.html?id=${student.studentId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
	</body>
</html>