<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

<link rel="stylesheet" type="text/css" href="stylesheet.css" />


<script> 
function validate()
{ 
	var name = document.form.name.value;
	var nic = document.form.nic.value;
	var email = document.form.email.value;
	var mobile = document.form.mobile.value;
	var address = document.form.address.value;
 	var username = document.form.username.value; 
 	var password = document.form.password.value;
 	var conpassword= document.form.conpassword.value;
 
 if (Name==null || name=="")
 { 
 alert("Name can't be blank"); 
 return false; 
 }
 else if (NIC==null || NIC=="")
 { 
 alert("NIC number can't be blank"); 
 return false; 
 }
 else if (E-mail==null || E-mail=="")
 { 
 alert("Email can't be blank"); 
 return false; 
 }
 else if (Mobile==null || Mobile=="")
 { 
 alert("Mobile Number can't be blank"); 
 return false; 
 }
 else if (Address==null || Address=="")
 { 
 alert("Address can't be blank"); 
 return false; 
 }
 else if (Username==null || Username=="")
 { 
 alert("Username can't be blank"); 
 return false; 
 }
 else if(password.length<6)
 { 
 alert("Password must be at least 6 characters long."); 
 return false;
 } 
 else if (password!=conpassword)
 { 
 alert("Confirm Password should match with the Password"); 
 return false; 
 } 
 else
 {
alert("You have successfully registered");
return false;
}
 
 {
	if(document.getElementById("pwd").value != document.getElementById("cnfrmpwd").value){
	       alert("Password Mismatch!");
			return false;
	  }else{
	        alert("Success!");
			return true;
	    }	
	}
 
 
 } 
</script> 

</head>
<body>

	
		<div class= "box">	
		
		
		<h2>Register Now!</h2>
		
		
		<form name = "form" action = "register-servlet" method = "post" onsubmit="return validate()">
		
      		<p>Name</p>		
      		<input type="text" name="Name" required>
      			
   				
			<p>NIC</p>		
      		<input type="text" name="Nic" pattern ="[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][V|v]" required>
      			
      		
      		<p>E-mail</p>		
      		<input type="text" name="Email" pattern = "[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}" required>
			
      				
      		<p>Mobile</p>		
      		<input type="text" name="Mobile" pattern = "[0-9]{10}" required>
      		
      		<p>Address</p>		
      		<input type="text" name="Address" required>		
      							 
      		<p>Username</p>		
      		<input type="text" name="Username" required>	
      					
      		<p>Password</p>		
      		<input type="password" name="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[a-z]).{5,10}" required><br>
      		
			<input type="submit" id="submitBtn" value="Register">
			
				
				
			
		</form>
	</div>

</body>
</html>