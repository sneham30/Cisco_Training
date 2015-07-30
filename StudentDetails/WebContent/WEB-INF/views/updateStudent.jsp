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
		<h2>Edit Student Data</h2>
		<!-- form for editing student -->
		<form:form method="POST" action="update.html" modelAttribute="student" commandName="student">
	   		<table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Edit Stduent-details</h2></td>
                </tr>
                 <tr>
                    <td>Student ID:</td>
                    
                    <td><form:input path="studentId" value="${student.studentId}"/></td>
                </tr>
                <tr>
                    <td>Student Name:</td>
                    
                    <td><form:input path="studentName" value="${student.studentName}"/></td>
                </tr>
                
                <tr>
                    <td>E-mail:</td>

                    <td><form:input path="email" value="${student.email}"/></td>
                </tr>
                
                <tr>
                    <td>Age:</td>
                    
                    <td><form:input path="age" value="${student.age }"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="SaveChanges" /></td>
                </tr>
            </table>
		</form:form>
		
	</body>
</html>