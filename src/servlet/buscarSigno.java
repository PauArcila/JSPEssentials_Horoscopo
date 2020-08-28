package servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class buscarSigno
 */
@WebServlet("/buscarSigno")
public class buscarSigno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buscarSigno() {
        super();        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//inputAnio
		//xz** Buscar el signo de acuerdo a un año ingresado por la página
		PrintWriter escribe = response.getWriter();
		
		int anioNacimiento = Integer.parseInt(request.getParameter("inputAnio"));
		String animal = "";
		Horoscopo horoscopoDTO = new Horoscopo();
		//A partir del anio se obtiene el Id del signo para buscar sus características 
		//mostrarHoroscopo 
		int Idsigno = anioNacimiento % 12;
		Facade facade = new Facade();
		horoscopoDTO = facade.mostrarHoroscopo(Idsigno);
		request.setAttribute("anioNacimiento", anioNacimiento);
		request.setAttribute("animal", animal);
		request.setAttribute("horoscopo", horoscopoDTO);
		request.getRequestDispatcher("/horoscopo.jsp").forward(request, response);

	}

}
