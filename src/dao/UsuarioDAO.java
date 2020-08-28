package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import interfaceCrud.InterfaceCrud;
import modelo.Usuario;


public class UsuarioDAO implements InterfaceCrud<Usuario>{
	
	private final String SQL_INSERT = "INSERT INTO USUARIO (nombreUsuario, nombre, contrasenia, anioNacimiento, idHoroscopo) values (?,?,?,?,?)";
	private final String SQL_DELETE = "DELETE FROM USUARIO where nombreUsuario = ?";
	private final String SQL_UPDATE = "UPDATE USUARIO SET contrasenia = ? where nombreUsuario = ?";
	private final String SQL_READ = "SELECT nombreUsuario, nombre, contrasenia, anioNacimiento, idHoroscopo FROM USUARIO where nombreUsuario = ?";
	private final String SQL_READALL = "SELECT * FROM USUARIO";
	private final String SQL_VALIDATE = "SELECT * FROM USUARIO WHERE nombreUsuario = ? and contrasenia = ?";
	private final String SQL_USRNAME = "SELECT nombreUsuario FROM USUARIO WHERE nombreUsuario = ?";
	
	@Override
	public boolean create(Usuario lqs) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		Connection cnn;
		
		try {
			cnn = Conexion.crearEntregarInstancia().getConexion();
			ps = cnn.prepareStatement(SQL_INSERT);
			ps.setString(1, lqs.getNombreUsuario());
			ps.setString(2, lqs.getNombre());
			ps.setString(3, lqs.getContrasenia());
			ps.setInt(4, lqs.getAnioNacimiento());            
			ps.setInt(5, lqs.getIdHoroscopo());
			//xz ** Si ejecuto retornar true**
			if(ps.executeUpdate()>0) {
			   return true;
			 }
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Object key) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		Connection cnn;
		
		try {
			cnn = Conexion.crearEntregarInstancia().getConexion();
			ps =  cnn.prepareStatement(SQL_DELETE);
			ps.setString(1, (String) key);
			if(ps.executeUpdate() > 0) {
				return true;
			}
			Conexion.crearEntregarInstancia().cerrarConexion(cnn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean update(Usuario lqs) {
		// TODO Auto-generated method stub
		
		PreparedStatement ps;
		Connection cnn;
		
		try {
			cnn = Conexion.crearEntregarInstancia().getConexion();
			ps = cnn.prepareStatement(SQL_UPDATE);
			ps.setString(1, lqs.getContrasenia());
			ps.setString(2, lqs.getNombreUsuario());
			if(ps.executeUpdate() > 0) {
				return true;
			}
			
			Conexion.crearEntregarInstancia().cerrarConexion(cnn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return false;
	}

	@Override
	public Usuario read(Object key) {
		// TODO Auto-generated method stub
		
		PreparedStatement ps;
		ResultSet rs;
		Usuario usuario = null;
		Connection cnn;
		
		try {
			cnn = Conexion.crearEntregarInstancia().getConexion();
			ps = cnn.prepareStatement(SQL_READ);
			ps.setString(1, (String) key);
			rs = ps.executeQuery();
			while(rs.next()) {
				
				usuario = new Usuario();
				usuario.setNombreUsuario(rs.getString("nombreUsuario"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setContrasenia(rs.getString("contrasenia"));
				usuario.setAnioNacimiento(rs.getInt("anioNacimiento"));
				usuario.setIdHoroscopo(rs.getInt("idHoroscopo"));
				
			}
			Conexion.crearEntregarInstancia().cerrarConexion(cnn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuario;
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		PreparedStatement ps;
		ResultSet rs;
		Usuario usuario = null;
		Connection cnn;
		
		try {
			cnn = Conexion.crearEntregarInstancia().getConexion();
			ps = cnn.prepareStatement(SQL_READALL);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				usuario = new Usuario();
				usuario.setNombreUsuario(rs.getString("nombreUsuario"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setContrasenia(rs.getString("contrasenia"));
				usuario.setAnioNacimiento(rs.getInt("anioNacimiento"));
				usuario.setIdHoroscopo(rs.getInt("idHoroscopo"));
				listaUsuario.add(usuario);
				
			}
			Conexion.crearEntregarInstancia().cerrarConexion(cnn);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaUsuario;
	}
	
	public boolean ValidarUsuario(Usuario usuario) {
		boolean estado = false;
		PreparedStatement ps;
		Connection cnn;
		ResultSet rs;
		try {
			cnn = Conexion.crearEntregarInstancia().getConexion();
			ps = cnn.prepareStatement(SQL_VALIDATE);
			ps.setString(1, usuario.getNombreUsuario());
			ps.setString(2, usuario.getContrasenia());
			rs = ps.executeQuery();
			estado = rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estado;
		
	}
	public boolean validaUsrName(Object lqs) {
		// TODO Auto-generated method stub
		boolean estado = false;
		PreparedStatement ps;
		Connection cnn;
		ResultSet rs;
		try {
			cnn = Conexion.crearEntregarInstancia().getConexion();
			ps = cnn.prepareStatement(SQL_USRNAME);
			ps.setString(1, (String) lqs);			
			rs = ps.executeQuery();
			estado = rs.next();					
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return estado;
	}
	

		
		
		
		
		
		
		
		
	
	
}
