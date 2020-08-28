<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="modelo.*"%>
<%@page import="servlet.*"%>
<%@page import="facade.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse" %>
<%@page import="javax.servlet.http.HttpSession"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Horoscopo Chino</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700,800&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<link rel="stylesheet" href="style.css">
</head>
<body class="fondo">
 	<% 	HttpSession sesion = request.getSession();
 		
 		Usuario currentUser = (Usuario) sesion.getAttribute("usuarioLogueado");
 		String name = currentUser.getNombre();
 		Horoscopo horos = (Horoscopo) session.getAttribute("horoscopoLogueado");
 		String sign = horos.getNombre();
 		String icon = horos.getUrl();
 		String desc = horos.getDescripcion();
 		
 		Calendar cal= Calendar.getInstance();
 		int anioActual= cal.get(Calendar.YEAR);
 		%>

	<header>	
		<nav class="navbar navbar-expand-lg navbar-inverse fondo py-4"> 
			<div class="navbar-header">
			    <a class="navbar-brand px-2" href="#"><h3 style="color: white;">Horoscopo</h3></a>
			 </div>
			 <form action="util" method="post">
			    <button class="btn btn-outline-info align-content-center m-1" type="submit">Mantenedor</button>
			 </form>
			 <form  class="ml-auto" action="CerrarSesion" method="get">
			 	<button type="submit" class="btn btn-link text-right">Salir</button>
			 </form>	 
			 
		</nav> 
	</header>
	<section id="main">
		<div class="jumbotron jumbo">
  			<div class="container px-5">
  				<h1 class="display-4 text-center">Hola <%=name %>, eres: <%=sign%></h1>
  				<div class="row inline align-items-center text-right mx-5 px-5">
  					<div class="col-lg-8 col-sm-12 inline">
  					<p class="lead"><%=desc %></p> 
  					</div>
  					<div class="col-lg-4 col-sm-12 inline">
  					<img class="mx-3 px-3" src="<%=icon %>"	alt="Imagen Signo">
  					</div>
  				</div>  				
  				<hr class="my-1 pb-2">
  				
  				<form class="text-center mt-2" action="consultarSigno" method="post">
  					<p>Para ver otro signo, ingresa el año de nacimiento a consultar:</p>
  					<input class="py-2 px-2 align-middle" type="number" id="inputAnio" name="inputAnio" min="1000" max="<%=anioActual %>" placeholder="1999" >
			    	<button class="btn btn-dark btn-lg" type="submit" id="consultar">Consultar otro signo</button>
			 	</form>	
			 			
  			</div>
		</div>
	</section>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script></body>
</html>