<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Vehicle</title>

</head>
<body>


	<h1>Add New Vehicle</h1>
	
	<form method="post" action="insert">
	
	<p>Vehicle Name</p>
	<input type="text" name="vehicleName" />
	
	<p>Registration Number</p>
	<input type="text" name="registrationNum" />

	<p>Vehicle Type</p>
	<input type="text" name="type" />
	
	<p>Description</p>
	<input type="text" name="description" />
	
	<p>Rate Per Day</p>
	<input type="text" name="ratePerDay" /><br><br>
		
	<input type="submit" value="Save">
	
	<input type="reset" value="Reset" class="reset-button" />
	
	</form>
	<br>
	<form method="POST" action="ListVehicleServlet">
	
		<input type="submit" value="List All Vehicles" />
	
	</form>





</body>
</html>