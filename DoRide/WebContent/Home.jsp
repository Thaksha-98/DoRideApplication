<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

<link rel="stylesheet" type="text/css" href="home.css" />    

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<div class="header">
	<div class="header-content">
		<div class="header-items">
        	
		
            	
            </div>
        </div>

        <div class="header-items">
        
        	<div class="menu-bar">
        	
        		<img src="logo.jpg" class="logo">
            	<ul>
					<li class = "active"><a href = "Home.jsp"><i class="fa fa-home"></i>Home</a></li>
					<li class = "active"><a href = "solutions.jsp"><i class="fa fa-car">Solutions</i></a></li>
					<li class = "active"><a href = "feedback.jsp"><i class="fa fa-commenting-o">Feedback</i></a></li>
					<li class = "active"><a href = "contactus.jsp"><i class="fa fa-comments-o">Contact Us</i></a></li>
					<li class = "active"><a href = "Register.jsp"><i class="fa fa-user-plus">Sign Up</i></a></li>
					<li class = "active"><a href = "login.jsp"><i class="fa fa-sign-in">Login</i></a></li>
				</ul>
            </div>
        </div>
	</div>

    <div class="slider" style="width:100%">
    
  <img class="mySlides" src="er.jpg" style="width:100%" height="700">  
  <img class="mySlides" src="bm.jpg" style="width:100%" height="700">
  <img class="mySlides" src="ku.jpg" style="width:100%" height="700">
  <img class="mySlides" src="dr.jpg" style="width:100%" height="700">
  <img class="mySlides" src="lam.jpg" style="width:100%" height="700"> <br><br><br><br>
  
</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 4000); // Change image every 2 seconds
}
</script>


<body>

<div class = "msg">

<p> &nbsp &nbsp &nbsp &nbsp  Our company that rents automobiles for short periods of time, generally ranging 
from a few hours to a few weeks. <br> &nbsp &nbsp &nbsp &nbsp It is often organized with numerous local branches
(which allow a user to return a vehicle to a different location).<br><br>

&nbsp &nbsp &nbsp &nbsp The user can book a car or reserve a car based on its efficiency, performance, effort or cost.

Car rental agencies <br> &nbsp &nbsp &nbsp &nbsp primarily serve people who require a temporary vehicle, for example,
those who do not own their own car, travelers <br> &nbsp &nbsp &nbsp &nbsp who are out of town. Car rental agencies
may also serve the self-moving industry needs, by renting vans or trucks.<br> &nbsp &nbsp &nbsp &nbsp

Alongside the basic rental of a vehicle, car rental agencies typically also offer extra 
products such as global positioning <br> &nbsp &nbsp &nbsp &nbsp system (GPS) navigation systems, entertainment systems, 
mobile phones, portable WiFi and child safety seats.</p> <br><br><br><br>

<div class="row">
  <div class="column">
    <img src="car10.gif" style="width:100%"> 
  </div>
  
  <div class="column">
    <img src="we.gif" style="width:100%">
  </div>

 </div>
</div>
 
 







<div class = "footer-main-div">

<div class = "footer-social-icons">
	<ul>
		<li><a href="https://www.facebook.com/" target="blank"><i class="fa fa-facebook"></i></a></li>
		<li><a href="https://twitter.com/explore" target="blank"><i class="fa fa-twitter"></i></a></li>
		<li><a href="https://www.googleaccount.com/" target="blank"><i class="fa fa-google-plus"></i></a></li>
		<li><a href="https://www.youtube.com/" target="blank"><i class="fa fa-youtube"></i></a></li>
	
	</ul>
</div>

<div class = "footer-menu-one">
	<ul>
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="solution.jsp">Solution</a></li>
		<li><a href="feedback.jsp">Feedback</a></li>
		<li><a href="contactus.jsp">Contact US</a></li>
	</ul>
</div>

<div class = "footer-menu-two">
	<ul>
		<li><a href="blog.jsp">Blog</a></li>
		<li><a href="news.jsp">News</a></li>
		<li><a href="media.jsp">Media</a></li>
	</ul>
</div>

</div>


</body>
</html>
