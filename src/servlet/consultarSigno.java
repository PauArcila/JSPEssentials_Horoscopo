package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facade.Facade;
import modelo.Horoscopo;

/**
 * Servlet implementation class consultaSigno
 */
@WebServlet("/consultarSigno")
public class consultarSigno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public consultarSigno() {
        super();        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter escribe = response.getWriter();
		
		if (request.getParameter("inputAnio") == "" || request.getParameter("inputAnio") == null) {
			escribe.println("<script>");
			escribe.println("alert('Por favor ingresa un año válido');");
			escribe.println("location.href='horoscopo.jsp';");
			escribe.println("</script>");
		}
		
		else {
			int anioNac = Integer.parseInt(request.getParameter("inputAnio"));
			int Idsigno = anioNac % 12;
			Horoscopo horos = new Horoscopo();
			Facade facade = new Facade();
			horos = facade.mostrarHoroscopo(Idsigno);
			
			request.setAttribute("anioNacimiento", anioNac);
			request.setAttribute("horoscopo", horos);

			request.getRequestDispatcher("/consultaHoroscopo.jsp").forward(request, response);	
		}
		
	}

}
