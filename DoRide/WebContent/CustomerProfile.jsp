<%@page import="com.DoRide.model.Customer"%>
<%@page import="com.DoRide.service.CustomerService"%>
<%@page import="com.DoRide.service.ICustomerService"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Profile</title>

<link rel="stylesheet" type="text/css" href="stylesheet.css" />

<link rel ="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"/>
<script src = "https://kit.fontawesome.com/a076d05399.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>



</head>
<body>
		
		<input type = "checkbox" id = "check">
		<label for = "check">
			<i class = "fas fa-bars" id = "btn"></i>
			<i class = "fas fa-times" id = "cancel"></i>
		</label>

	<div class = "middle">
	
		<img src = "gomz.jpg" class = "user">
		
		<header>Felina Robert</header>
		
			<ul>
	
				<li><a href = "#"><i class="far fa-envelope"></i>Inbox</a></li>
				<li><a href = "#"><i class="fas fa-clipboard-list"></i>My Reserve</a></li>
				<li><a href = "#"><i class="fas fa-car"></i>My Trips</a></li>
				<li><a href = "#"><i class="far fa-calendar-alt"></i>Events</a></li>
				<li><a href = "#"><i class="fas fa-cogs"></i>Settings</a></li>
				<li><a href = "#"><i class="fas fa-sign-out-alt"></i>Logout</a></li>
					
			</ul>
			
		</div>
		<section></section>
		
		
			
		<div class = " card-container">
			<div class = "upper-container">
			
			
				<div class = "image-container">
				
					<img src = "gomz.jpg"/>
				
				</div>
			</div>
			
			<div class = "lower-container">

			<div class = "row justify-content-center">
				
				
				
				<h2>List of Customers</h2>
	
		<table class = "table">
			<thead>
				<tr>
					<th>NIC</th>
					<th>Name</th>
					<th>Email</th>
					<th>Mobile</th>
					<th>Address</th>
					<th>Username</th>
					<th>Password</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
		
				<%
					ICustomerService custService = new CustomerService();
					ArrayList<Customer> arrayList = custService.selectAllCustomers();

					for (Customer customer : arrayList) {
				%>
			<tbody>
					<tr>
						<td><%=customer.getNic() %></td>
						<td><%=customer.getName() %></td>
						<td><%=customer.getEmail() %></td>
						<td><%=customer.getMobile() %></td>
					    <td><%=customer.getAddress() %></td>
					    <td><%=customer.getUsername() %></td>
					    <td><%=customer.getPassword() %></td>
					    
						<td><a href="UpdateA.jsp?Nic=<%=customer.getNic() %>"><button type = "submit" class = "btn btn-primary" name = "edit">Edit</button></a></td>
				 		<td><form method="POST" action="DeleteServletA?Nic=<%=customer.getNic() %>"><button type = "submit" class = "btn btn-primary" name = "delete">Delete</button></form>
				 		
				 	</tr>						
			</tbody>
			<%
				}
			%>
			
						
				</table>
			</div>		
			
			
		</div>
	</div>
		
</body>
</html>