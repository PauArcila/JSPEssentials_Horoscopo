<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="modelo.*"%>
<%@page import="dao.*"%>
<%@page import="servlet.*"%>
<%@page import="facade.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse" %>
<%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<!--  <link rel="stylesheet" href="style.css"> -->
<head>
<meta charset="ISO-8859-1">
<title>Consulta Horoscopo</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700,800&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<link rel="stylesheet" href="style.css">
</head>
<body class="fondo">
 	<%	int anio = (int) request.getAttribute("anioNacimiento");
		Horoscopo horos = (Horoscopo) request.getAttribute("horoscopo"); 
		String sign = horos.getNombre();
		String desc = horos.getDescripcion();
		String imagen = horos.getUrl();
	%>
	<header>	
		<nav class="navbar navbar-expand-lg navbar-inverse fondo py-4"> <!--navbar-inverse-->
			<div class="navbar-header">
			    <a class="navbar-brand px-2" href="horoscopo.jsp" style="color: white;">
			    <h3>Horoscopo</h3></a>
			 </div> 
			 <form action="mantenedor.jsp" method="post">
			    <button class="btn btn-outline-info m-1" type="submit">Mantenedor</button>
			 </form>
			 <form  class="ml-auto" action="CerrarSesion" method="get">
			 	<button type="submit" class="btn btn-link text-right">Salir</button>
			 </form>	 	 
		</nav> 
	</header>
		
	<section>
	<div class="jumbotron jumbo pt-3">
		<div class="container px-5">
			<div class="center font-weight-light" >				 	 
			
				<div class="row inline align-items-center text-right mx-3 px-3">
  					<div class="col-lg-4 col-sm-12 inline">
  						<img class = "img-responsive" src="https://rukaweb.com/otrasImgs/rueda.png" style="max-width: 65%;">
  					</div>
  					<div class="col-lg-8 col-sm-12 inline">
  						<h1 class= "display-4 text-justify">Horoscopo Chino</h1> 
  						<h2 class= "display-4 text-justify">Año:&ensp;<%=anio %></h2>
  					</div>
  					
  					<div class="col-lg-8 col-sm-12 inline">
  						<p class="lead"><%=desc %></p> 
  					</div>
  					<div class="col-lg-4 col-sm-12 inline align-top">
  						<h1 class="text-center" style="color: #994342;"><b><%=sign %></b></h1>
  						<img class="mx-3 px-3" src="<%=imagen %>" alt="Imagen Signo">
  					</div>
  				</div>  	
			<hr class="my-1 pb-2">								
			<form class="text-center mt-2" action="horoscopo.jsp" method="post">
			    <button class="btn btn-dark btn-lg px-5" type="submit">Volver</button>
			 </form>		
		</div>
		</div>
	</div>
	</section>
	
<script type="text/javascript" src="ValidarRegistro.js"></script>	
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script></body>
</body>
</html>