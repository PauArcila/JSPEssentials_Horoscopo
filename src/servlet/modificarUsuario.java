package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facade.Facade;
import modelo.Usuario;

/**
 * Servlet implementation class modificarUsuario
 */
@WebServlet("/modificarUsuario")
public class modificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modificarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter escribe = response.getWriter();
		List <Usuario> usuarios = new ArrayList<Usuario>();
		String id = request.getParameter("nombreUsuario");
		String password = request.getParameter("contrasenia");
		Usuario usuario = new Usuario();
		Facade facade = new Facade();
		usuario.setNombreUsuario(id);
		usuario.setContrasenia(password);
		
		if(facade.validaNombreUsuario(id)) {
			escribe.println("<script>");
			escribe.println("alert('Usuario modificado');");
			
			escribe.println("</script>");
			
			facade.modificarUsuario(usuario);
			
			
			usuarios = facade.obtenerUsuarios();
			System.out.println(usuarios);
			request.setAttribute("lista", usuarios);
			request.getRequestDispatcher("/mantenedor.jsp").forward(request, response);
			
		}else {
			escribe.println("<script>");
			escribe.println("alert('No existe el usuario ingresado');");
	
			escribe.println("</script>");
			usuarios = facade.obtenerUsuarios();
			request.setAttribute("lista", usuarios);
			request.getRequestDispatcher("/mantenedor.jsp").forward(request, response);
		}
	}

}
