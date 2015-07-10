<%@page import="DataBaseHelper.AccountsHelper"%>
<%@page import="CustomerAccountDetails.Account"%>
<%@page import="DataBaseHelper.CustomersHelper"%>
<%@page import="CustomerAccountDetails.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function redirect(){
	window.location = "http://localhost:8080/Banking_System/Login.html";
}</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>
New customer Entry</title>
</head>
<body>
<h1>Enter your Details</h1>
<form action="NewCustomer" method="post">
<B>Name:</B><input type="text" name="customerName"><br>
<b>Address:</b><input type="text" name="customerAddress"><br>
<b>Password:</b><input type="password" name="password"><br>
<input type="submit" value="Save"/><br>
<input type="button" value="SignIn" onclick="redirect()"/>
</form>



</body>
</html>