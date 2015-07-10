<%@page import="DataBaseHelper.AccountsHelper"%>
<%@page import="CustomerAccountDetails.Account"%>
<%@page import="DataBaseHelper.CustomersHelper"%>
<%@page import="CustomerAccountDetails.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
<% CustomersHelper custHelp = new CustomersHelper();
AccountsHelper accHelp = new AccountsHelper();

ArrayList<Customer> customers = custHelp.fetchRecords(((String)request.getAttribute("CustomerName")));
out.println("<h1><B><I>Your Details are :</I></B></h1>");
for(Customer customer:customers){
	out.println("<B><I>Name:" + customer.getCustomerName() +"</I></B><br>");
	out.println("<B><I>Customer Number:" + customer.getCustomerNumber() +"</I></B><br>");
	out.println("<B><I>Customer Address:" + customer.getAddress() +"</I></B><br>");
	ArrayList<Account> accounts= accHelp.fetchRecords(customer.getCustomerName());
	out.println("Your Account Details are:<br>");
	out.println("Click on accountNumber for Transactions on it!!<br>");
	if(accounts.size()!=0){
		
	out.println("<table border=2px> <caption> Accounts</caption>");
	out.println("<tr><th>AccountNumber</th><th>AccountType</th><th>Balance<th></tr>");
	for(Account account:accounts){
		out.println("<tr><td><a href='DoTransaction.jsp?accNo="+account.getAccountNumber()+"&accName="+account.getAccountHolderName()+"'>"+account.getAccountNumber() +"</a></td>");
		out.println("<td>"+account.getAccountType() +"</td>");
		out.println("<td>"+account.getbalance() +"</td></tr>");
	
       }
	String name = customer.getCustomerName();
	out.println("<a href='NewAccount.jsp?name="+name+"'>Click here to create new Account </a>");
	}else if(accounts.size()== 0){
		out.println("You have no accounts!!!");
		String name = customer.getCustomerName();
		out.println("<a href='NewAccount.jsp?name="+name+"'>Click here to create new Account </a>");
	}
	
}

%>

<form action="Logout" method="post">
<input type="submit" value="Logout"/>
</form>

</body>
</html>