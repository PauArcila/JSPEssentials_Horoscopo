<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="modelo.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mantenedor</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700,800&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<link rel="stylesheet" href="style.css">
</head>
<body class="fondo">
	<% //HttpSession sesion = request.getSession();
		//Usuario currentUser = (Usuario) sesion.getAttribute("usuarioLogueado");
		List<Usuario> listaUsuarios = (List<Usuario>) request.getAttribute("lista");
		
		%>
		
	<header>	
		<nav class="navbar navbar-expand-lg navbar-inverse fondo py-4"> <!--navbar-inverse-->
			<div class="navbar-header">
			    <a class="navbar-brand px-2" href="horoscopo.jsp" style="color: grey;">
			    <h3>Horoscopo</h3></a>
			 </div> 
			 <form  class="ml-auto" action="CerrarSesion" method="get">
			 	<button type="submit" class="btn btn-link text-right">Salir</button>
			 </form>	 
					 
		</nav> 
	</header>			
		
<section>
<div class="jumbotron jumbo pt-3">
	<div class="container px-5">
		<div class="col-sm" style="text-align: left">
			<h1 class="display-4 text-center">Mantenedor de Usuarios</h1>
			<p class="text-white text-center">Los cambios que se hagan en esta sección no se pueden deshacer</p>
		</div>
		
 			 <form action="modificarUsuario" method="post">
 			 <label for="exampleInputEmail1">Modificar usuario:</label>
 			 	<div class="input-group mb-1">
 			 		
					<input type="text" class="form-control" name="nombreUsuario" placeholder="Ingrese username del usuario a modificar">
					<input type="text" class="form-control" name="contrasenia" placeholder="Ingrese nueva contraseña">
						<div class="input-group-append">
							<button type="submit" class="btn btn-dark">Modificar</button> 
			 			</div>
			 	</div>
			 </form>	

	 		<form action="eliminarUsuario" method="post">
	 		<label for="exampleInputEmail1">Eliminar usuario:</label>
	 		<div class="input-group mb-1">
	  			<input type="text" class="form-control" name="nombreUsuario" placeholder="Username del usuario a eliminar">
	 			 <div class="input-group-append">
	    			<button class="btn btn-secondary" type="submit">Eliminar</button>
	  			</div>
			</div>
	 		</form> 

   	 			<div class="form-group table-responsive pt-3 " id="items">	
					<span class= "text-left pl-2 py-5"><b>LISTADO DE USUARIOS</b></span>
					<table class="table table-dark table-striped table-hover rounded">
					    <thead>
					      <tr>
					        <th>Nombre Usuario</th>
					        <th>Nombre</th>
					        <th>Año de Nacimiento</th>
					        <th>Id Horoscopo</th> 
					      </tr>
					    </thead>
					    <tbody>
					    	<% for(Usuario u : listaUsuarios){%>   
						       <tr><td><%=u.getNombreUsuario()%></td> 
						         	<td><%=u.getNombre()%></td> 
						         	<td><%=u.getAnioNacimiento()%></td>
						          	<td><%=u.getIdHoroscopo()%></td>
						          	<td><%=u.getContrasenia()%></td></tr> 
						       <%}%>
						      <!-- acá iban los forms -->      
					    </tbody>
					  </table>
				</div>	
			<hr class="my-1 pb-2">								
			<form class="text-center mt-2" action="horoscopo.jsp" method="post">
			    <button class="btn btn-dark btn-lg px-5" type="submit">Volver</button>
			 </form>	
	</div>
</div>
</section>
	
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script></body>
</body>
</html>