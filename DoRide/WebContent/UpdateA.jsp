<%@page import="com.DoRide.model.Customer"%>
<%@page import="com.DoRide.service.CustomerService"%>
<%@page import="com.DoRide.service.ICustomerService"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Profile</title>

<link rel="stylesheet" type="text/css" href="update.css" />

</head>
<body>

<div class = "box">

	<h2>Edit Customer Profile</h2>
	
					<%
					
					
					String Nic = (String) request.getParameter("Nic");
					ICustomerService custService = new CustomerService();
					
					Customer customer = custService.getCustomer(Nic);


					%>
	     
					  <form action="UpdateServletA?Nic=<%=customer.getNic() %>" method="post">
					
						<p>NIC</p>
						<input type = "text" name = "Nic" value="<%=customer.getNic()%>">
					
					
					
						<p>Name</p>
						<input type = "text" name = "Name" value="<%=customer.getName()%>">
					
					
						<p>E-mail</p>
						<input type = "text" name = "Email" value="<%=customer.getEmail()%>">
						
					
						<p>Mobile</p>
						<input type = "text" name = "Mobile" value="<%=customer.getMobile()%>">
					
			
						<p>Address</p>
						<input type = "text" name = "Address" value="<%=customer.getAddress()%>">
					
					
						
						<p>Username</p>
						<input type = "text" name = "Username" value="<%=customer.getUsername()%>">
						
						<p>Password</p>
						<input type = "text" name = "Password" value="<%=customer.getPassword()%>">
					
						
						<input type="submit" id="submitBtn" value="Update">
					</form>
				
			</div>

</body>
</html>