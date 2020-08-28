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
 * Servlet implementation class eliminarUsuario
 */
@WebServlet("/eliminarUsuario")
public class eliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public eliminarUsuario() {
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
		// TODO Auto-generated method stub
		PrintWriter escribe = response.getWriter();
		List <Usuario> usuario = new ArrayList<Usuario>();
		String id = request.getParameter("nombreUsuario");
		Facade facade = new Facade();
		usuario = facade.obtenerUsuarios();//
		request.setAttribute("lista", usuario);//
		
		if(facade.validaNombreUsuario(id)) {
			facade.borrarUsuario(id);
			escribe.println("<script>");
			escribe.println("alert('Usuario eliminado');");	
			escribe.println("</script>");
		//
			request.getRequestDispatcher("/mantenedor.jsp").forward(request, response);
			
		}else {
			escribe.println("<script>");
			escribe.println("alert('Usuario no existe');");
			escribe.println("location.href='mantenedor.jsp';");
			escribe.println("</script>");
			usuario = facade.obtenerUsuarios();
			request.setAttribute("lista", usuario);
			request.getRequestDispatcher("/mantenedor.jsp").forward(request, response);
	}

}
}