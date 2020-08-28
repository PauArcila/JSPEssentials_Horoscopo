<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Iniciar Sesion</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700,800&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<link rel="stylesheet" href="style.css">


</head>

<body class="fondo"><!--bg-info  -->
    <div id="login" class="py-4">
        <h3 class="text-center text-white pt-5"></h3><!-- Login form -->
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="p-5 col-md-12 bg-white rounded shadow-lg">
                        
                        <form id="login-form" class="form" action="procesaLogin" method="post">
                        		<div class="d-flex justify-content-center">
                        			<img class="img-responsive " src="https://rukaweb.com/otrasImgs/rueda.png" width="100" height="100" alt="Rueda del Zodiaco Chino">
                        		</div>
                        		<h3 class="text-center text-info">Login</h3>
                        		<div></div>
                        		<div></div>
                        		<div></div>
                        	                            
                            <div class="form-group">
                                <label for="username" class="text-info">Nombre:</label><br>
                                <input type="text" name="nombreUsuario" id="nombre" class="form-control" placeholder="Username" autofocus required>
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password:</label><br>
                                <input type="password" name="contrasenia" id="password" class="form-control" placeholder="Contraseña" required>
                            </div>
                            <div class="form-group"> <!-- form-group -->                               
                           		<input type="submit" name="submit" class="btn btn-info btn-md btn-block p-2 mt-1" value="Ingresar">
                          </div>
                            
                        </form>
	                    <form id="Reg-form" class="form" action="RegistraUsuario.jsp" method="post"> 
	                        <div class="form-group inline-block text-center"> 
	                        	<span class="text-muted  align-middle">¿No tienes una cuenta?</span>
	                        	<input type="submit" name="submit" class="btn btn btn-link btn-md" value="Registrate acá">
	                         </div>  
	                     </form>                         
                    </div>
                </div>
            </div>
        </div>
    </div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script></body>

</body>
</html>