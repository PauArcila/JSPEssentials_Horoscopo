package facade;

import java.util.List;

import dao.HoroscopoDAO;
import dao.UsuarioDAO;
import modelo.Horoscopo;
import modelo.Usuario;



public class Facade {
	
	public List<Usuario> obtenerUsuarios(){
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.readAll();
	}
	
	public boolean validarUsuario(Usuario usuario) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.ValidarUsuario(usuario);
		
	}
	public boolean insertaUsuario(Usuario usuario) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.create(usuario);
		
	}
	public boolean borrarUsuario(String usuario) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.delete(usuario);
	}
	
	public boolean modificarUsuario(Usuario usuario) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.update(usuario);
		
	}
	
	public Usuario buscarUsuario(Usuario usuario) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Object objeto = usuario.getNombreUsuario();
		return usuarioDAO.read(objeto);
		
	}
	public Horoscopo buscarHoroscopo(Horoscopo horoscopo) {
		HoroscopoDAO horoscopoDAO = new HoroscopoDAO();
		return horoscopoDAO.read(horoscopo);
	}
	public Horoscopo mostrarHoroscopo(int horoscopo) {
		HoroscopoDAO horoscopoDAO = new HoroscopoDAO();
		return horoscopoDAO.buscarHoroscopoId(horoscopo);
	}
	
	public List<Horoscopo> obtenerHoroscopos(){
		HoroscopoDAO horoscopoDAO = new HoroscopoDAO();
		return horoscopoDAO.readAll();
	}
	
	
	public boolean validaNombreUsuario(String nombreUsuario) {			
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.validaUsrName(nombreUsuario);		
	}
}
