package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facade.Facade;
import modelo.Usuario;

/**
 * Servlet implementation class registraLogin
 */
@WebServlet("/registraLogin")
public class registraLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public registraLogin() {
        super();        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter escribe = response.getWriter();
		String id = request.getParameter("nombreUsuario");
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("contrasenia");
		int anioNacimiento = Integer.parseInt(request.getParameter("anioNacimiento"));
		int signo = anioNacimiento % 12;
		
		Usuario dto = new Usuario();
		dto.setNombreUsuario(id);
		dto.setNombre(nombre);
		dto.setContrasenia(password);
		dto.setAnioNacimiento(anioNacimiento);
		dto.setIdHoroscopo(signo);
		
		Facade facade = new Facade();
			
		if(facade.validaNombreUsuario(id)) {
			escribe.println("<script>");
			escribe.println("alert('>>>  Usuario Ya Existe  <<<');");
			escribe.println("location.href='RegistraUsuario.jsp';");
			escribe.println("</script>");
		}
		else {
			if(facade.insertaUsuario(dto)) {
				escribe.println("<script>");
				escribe.println("alert('Se ha registrado correctamente');");
				escribe.println("location.href='login.jsp';");
				escribe.println("</script>");
				
			}else {
				escribe.println("<script>");
				escribe.println("alert('Problemas con su Registro, intente nuevamente');");
				escribe.println("location.href='RegistraUsuario.jsp';");
				escribe.println("</script>");
			}
		}
			
		
	}

}
