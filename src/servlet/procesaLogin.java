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
import javax.servlet.http.HttpSession;

import facade.Facade;
import modelo.Horoscopo;
import modelo.Usuario;

/**
 * Servlet implementation class procesaLogin
 */
@WebServlet("/procesaLogin")
public class procesaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public procesaLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter escribe = response.getWriter();
		String nombre = request.getParameter("nombreUsuario");
		String contrasenia = request.getParameter("contrasenia");
		
		Facade facade = new Facade();
		Usuario usuario = new Usuario();
		Horoscopo horoscopo = new Horoscopo();
		
		usuario.setNombreUsuario(nombre);
		usuario.setContrasenia(contrasenia);
		List <Usuario> listaUsuario = new ArrayList<Usuario>();
		
		Usuario datoUsuario = new Usuario();// esto estaba dentro del if
		
		if(facade.validarUsuario(usuario)) {
			
			HttpSession session = request.getSession(true);
			
			datoUsuario = facade.buscarUsuario(usuario);
			horoscopo = facade.mostrarHoroscopo(datoUsuario.getIdHoroscopo());
			listaUsuario = facade.obtenerUsuarios();
			
			//session.setAttribute("nombre", nombre);
			session.setAttribute("usuarioLogueado", datoUsuario); // le mando el usuarioLogueado completo
			session.setAttribute("horoscopoLogueado", horoscopo);//le mando el horoscopo del usuarioLogueado completo
			session.setAttribute("lista", listaUsuario);
			request.setAttribute("horoscopo", horoscopo);
			request.getRequestDispatcher("/horoscopo.jsp").forward(request, response);
		}
		else {
			escribe.println("<script>");
			escribe.println("alert('Nombre o contraseña incorrectos');");
			escribe.println("location.href='login.jsp';");
			escribe.println("</script>");
		}
	}

}
