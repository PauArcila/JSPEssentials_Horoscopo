/**
 * 
 */

function validar(){

password = document.getElementById("password").value;
nombre = document.getElementById("nombre").value;	
anio = document.getElementById("anio").value;

if (validaAnio()&&validarNombre()&&validarPassword()){
		return true;
	}else{
		return false;
	}
	
}

function validaAnio(){
	var anioActual = (new Date).getFullYear();
    var valida = true;
    expr = /^[0-9]*$/;
    if(!expr.test(anio) || (anio < 1000 || anio > anioActual) ){
        alert(">> Debe Ingresar un anio correcto <<<< ");
        valida = false;
    }
   
    else{	    	
    	return valida;
    }    
}

function validarNombre(){
	var valida = true;
	expr = /^[a-zA-Z]+(\s*[a-zA-Z]*)*[a-zA-Z]+$/;
	if(!expr.test(nombre)){
			alert(">> Ingrese solo letras para el nombre <<");
			valida = false;
	}
	return valida;
}
function validarPassword(){
//	expr=/[0-9]{1,3}/;
//	if(!expr.test(password)){
//		alert("Password *** --> Ingrese solo numeros: ");		
//		return false;
//	}
//	else if((password < 1) || password > 999){
//		alert("Password *** --> se permiten numeros entre 1 y 999 --> ")
//		return false;
//	}
	if (password.length < 4 || password.length > 15){
		alert("La contraseña debe tener entre 4 y 15 caracteres")
		return false;
	}
	else
		return true;
}

var input=document.getElementById("inputAnio").value;
	function validaAnioIngresado(input){
	    if ( input < 1000 || input > 2020) {
	        alert(">> Ingresa un año válido <<<< ");
	      	console.log(input);
	      	document.getElementById("consultar").disabled = true;
	      	location.href='horoscopo.jsp';
	    	
	      	
	        return false;
	    }
	    else if (input!= "" || isNaN(input)){
	    	alert(">> Ingresa el año antes de consultar <<<< ");
	    	document.getElementById("consultar").disabled = true;
	    	console.log(input);
	    	location.href='horoscopo.jsp';
	      	
	        return false;
	    }
	    else 
	    	return true;	
	  console.log(input);
	}  				
