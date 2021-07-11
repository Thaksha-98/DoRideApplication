<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>

<style>
@CHARSET "ISO-8859-1";

body {background-image:url("images/vr.jpg");
  	  background-position: center;
      background-size: cover;
      text-align:center;
}

h1 {font-size:300%;
    text-align:center;
    font-family:Comic Sans MS;
    
}


</style>

</head>
<body>

<h1>Feedback</h1>  	
	
	<div class="row">
	<div class="column">	
	
	</div>
	
    <div class="column">
	<div class="div2"><h3><u>Leave us your Valuble Feedback</u></h3> <br>
	
	<form name="user" action="CustomerFeedback" onsubmit="return validateForm()"  method="post" >
	
	<b>NIC: <input type="text" name="nic" placeholder="123456789V/v" pattern ="[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][V|v]" required autocomplete="off"></b> </b><br><br>
	
	<b>Name: <input type="text" name="name"  required autocomplete="off" ></b><br><br>
	
	<b>Email: <input type="email" name="email"  placeholder="abc@gmail.com" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}"  required autocomplete="off"></b><br><br>
	
	<h3 id="h3">How could we improve this service?</h3>
	<b>Comments: 
	<br>
	<textarea name="comments" id="fb" class="fb" required></textarea> </b>
	

	<h3 id="fb1">How did you feel about the service you received today? </h3>
	
		<div id="input1">

		<p class="p1"><input type = "radio" name="rate"  id="rd1" value="Very Satisfied">Very Satisfied</p>
		<p class="p1"><input type = "radio" name="rate"  id="rd2" value="Satisfied">Satisfied</p>
		<p class="p1"><input type = "radio" name="rate"  id="rd3" value="Average" >Average</p>
		<p class="p1"><input type = "radio" name="rate"  id="rd4" value="Unsatisfied">Unsatisfied</p>
			
	
		</div>
	
	<input type="submit" value="Add Feedback" class="add-button" />
	<span>     </span>
	<input type="reset" value="Reset" class="reset-button" />
	
	</form>

    </div>
	</div>

</body>
</html>