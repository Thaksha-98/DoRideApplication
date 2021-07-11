<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Solutions</title>

<style>

@CHARSET "ISO-8859-1";

h1 {font-size:200%;
    text-align:center;
    font-family:Comic Sans MS;
    color:#191970;
}

h2 {font-size:130%;
    font-family:Comic Sans MS;    
}

h3 {font-size:90%;
    font-family:Comic Sans MS;    
}

.box{

   border:3px solid DarkGrey;
   margin-right:300px;
   
   
}

input{
}
fieldset{
border:none;
width:600px;
margin:0px auto;
}

.container{
             float:right;
             padding-right: 15%;
             margin-top-left:500px;
           
}
body {background-image:url("images/background.jpg");
  	  background-position: center;
      background-size: cover;
}
      
}


</style>

</head>

<body style="background-color:lightSteelblue">

<h1> Select your Vehicle here !</h1>


<div class="box"> 

<a href ="Economy.jsp" > 
<img src = "images/suz.jpg " height= "15%" width ="50%"> </a>
 
 <div class="container">
 
<h2>  Car-Type: Economy </h2>
 
<h3>Suzuki Swift Sport 
<p> USD 28.98/day </p> </h3>


<button> <a href="Economy.jsp">Vehicle Details</a> </button>
<br> <br> <br>
<button> <a href="Reservation.jsp">Make Reservation</a> </button>


 </div>
 </div>

<br>
<br>

<div class="box">

<a href ="luxuary.jsp" > 
<img src = "images/mer.jpeg " height= "15%" width ="50%"> </a>
 
 <div class="container">
 
<h2> Car-Type: Luxuary </h2>
<h3> Mercedes Benz coupe 
 <p> USD 40.99/day </p> </h3>

<button> <a href="luxuary.jsp">Vehicle Details</a> </button>
<br> <br> <br>
<button> <a href="Reservation.jsp">Make Reservation</a> </button>


</div>
</div>

<br>
<br>

<div class="box">

<a href ="Premium.jsp" > 
<img src = "images/mer2.jpg " height="15%" width = "50%"> </a>

 <div class="container">
 
<h2>  Car-Type: Premium </h2>
<h3> Mercedes Benz S-Class
<p> USD 47.79/day </p> </h3>
<button> <a href="Premium.jsp">Vehicle Details</a> </button>
<br> <br> 
<button> <a href="Reservation.jsp">Make Reservation</a> </button>

</div>
</div>


<br>
<br>

<div class="box">

<a href ="Minivan.jsp" > 
<img src = "images/toy.jpg " height="15%" width ="50%"> </a>
 
<div class="container"> 
 <h2>  Car-Type: MiniVan </h2>
<h3> Toyota-Sienna
<p> USD 59.69/day </p></h3>

<button> <a href="Minivan.jsp">Vehicle Details</a> </button>
<br> <br> <br>
<button> <a href="Reservation.jsp">Make Reservation</a> </button>


</div>
</div>

</body>
</html>