<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Inscripcion</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700,800&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<link rel="stylesheet" href="style.css">
</head>
<body class="fondo">
	<%int num;
	 num = Calendar.getInstance().get(Calendar.YEAR);
	%>
	<header>
		<nav class="navbar navbar-expand-lg navbar-inverse fondo py-4"> <!--navbar-inverse-->
			<div class="navbar-header">
			   <a class="navbar-brand px-2" href="#"><h3 style="color: white;">Regístrate</h3></a>
			 </div>

		</nav> 
	</header>
	
<section>
<div class="jumbotron jumbo pt-3">
	<div class="container px-5">
		<div class="col-sm" style="text-align: left">
			<h1 class="display-4 text-center">Formulario de registro</h1>
			<p class="text-white text-center">Ingresa tus datos a continuación para ingresar al sitio</p>
		</div>

	<form class="pt-3" action="registraLogin" method="post" onsubmit="return validar()">
		<div class="form-row ">
			<div class="form-group col-md-6">
				<label for="inputAddress2">Nombre</label> 
				<input type="text"class="form-control" id ="nombre" name="nombre" placeholder="Ingrese Nombre" required>
			</div>
			<div class="form-group col-md-6">
				<label for="inputAddress">Username</label> 
				<input type="text" class="form-control" id= "id_usuario" name ="nombreUsuario" placeholder="Username" required>
			</div>
		</div>
			
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputAddress2">Año Nacimiento</label> 
					<input type="text" class="form-control" id ="anio" name="anioNacimiento" placeholder="Ingrese Año Nacimiento" required  >
				</div>
				<div class="form-group col-md-6">			
		            <label for="inputAddress2">Password</label>
	                <input type="password" name="contrasenia" id="password" class="form-control" placeholder="Ingrese Password" required>                				
				</div>
			</div>
			
			<hr class="my-1 pb-2">
			<div class="text-center mt-2">
				 <button type="submit" class="btn btn-dark btn-lg px-5" id="boton">Registrar</button>
			</div>								

		</form>
	</div>
</div>
</section> 
<script type="text/javascript" src="ValidarRegistro.js"></script>	
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script></body>

</body>
</html>