
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="NewAccount" method= "post">
Account type: <input type="text" name="type"/><br>
<% String custName =(String) request.getParameter("name");%>
 <input type="hidden" name="custName"  value="<%=custName%>"/>

<br>

<input type="submit" value="Save"/>

</form>
</body>
</html>