<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation</title>

<style>

h2 {font-size:200%;
    text-align:center;
    font-family:Comic Sans MS; 
    color:Maroon;   
}

h3 {font-size:110%;
    text-align:center;
    font-family:Comic Sans MS; 
    color:Darkblue;   
}
body {background-image:url("images/vr.jpg");
  	  background-position: center;
      background-size: cover;
      text-align:center;


</style>

</head>
<body>

<h2> Reserve your Vehicle now</h2>


<h3>  Pick-up Details: 
<br> <br> 
<form name ="user" action="Reserve"  method="post" >
         
 
 Pick-up Location:
    <input class="text" type="text" name="pickuplocation" 
 placeholder="Pick-up-Location" id="location" required autocomplete="off"> <br><br>

Pick-up-date:
	<input type="date" name="pickupdate" required> <br><br/>        

Pick-up-time:
     <input type="time" id="appt" name="pickuptime" required> 
     
 <h3> Return Details: </h3>    
 
 Drop-off Location:
    <input class="text" type="text" name="dropofflocation" 
 placeholder="Return-Location" id="location" required autocomplete="off"> <br><br>

 Return date:
	<input type="date" name="returndate" required> <br><br/>

Drop-off-time:
     <input type="time" id="appt" name="returntime" required > <br>
     

<h3>Additional info: 
<br>
	<textarea name="additionalinfo" placeholder="Add a Note"id="re1" class="re"></textarea> </h3>
<br>
<input type="reset" value="Reset" class="reset-button" /> &nbsp &nbsp

<input type="submit" value="Confirm Reserve" class="add-button" />


</h3>

</form>



</body>
</html>