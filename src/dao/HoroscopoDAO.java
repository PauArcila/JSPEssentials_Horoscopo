package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import interfaceCrud.InterfaceCrud;
import modelo.Horoscopo;
import modelo.Usuario;


public class HoroscopoDAO implements InterfaceCrud<Horoscopo> {
	
	private final String SQL_READ = "SELECT idHoroscopo, signo, descripcion, url FROM HOROSCOPO WHERE idHoroscopo = ?";
	private final String SQL_SEARCH = "SELECT * FROM HOROSCOPO WHERE idHoroscopo = ?";
	private final String SQL_SEARCHALL = "SELECT * FROM HOROSCOPO";
	
	@Override
	public boolean create(Horoscopo lqs) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Horoscopo lqs) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Horoscopo read(Object key) {
		PreparedStatement ps;
		ResultSet rs;
		Horoscopo horoscopo = null;
		Connection cnn;
		
		try {
			cnn = Conexion.crearEntregarInstancia().getConexion();
			ps = cnn.prepareStatement(SQL_READ);
			ps.setInt(1, (int) key);
			rs = ps.executeQuery();
			while(rs.next()) {
				horoscopo = new Horoscopo();
				horoscopo.setIdHoroscopo(rs.getInt("idHoroscopo"));
				horoscopo.setNombre(rs.getString("signo"));
				horoscopo.setDescripcion(rs.getString("descripcion"));
				horoscopo.setUrl(rs.getString("url"));	
			}
			Conexion.crearEntregarInstancia().cerrarConexion(cnn);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return horoscopo;
	}

	@Override
	public List<Horoscopo> readAll() {
		// ///////////////////////////////////////////////////////////////////////////
				List<Horoscopo> listaSignos = new ArrayList<Horoscopo>();
				PreparedStatement ps;
				ResultSet rs;
				Horoscopo signo = null;
				Connection cnn;
				try {
					cnn = Conexion.crearEntregarInstancia().getConexion();
					ps = cnn.prepareStatement(SQL_SEARCHALL);
					rs = ps.executeQuery();	
					while(rs.next()) {
						//CLase horoscopo: int idHoroscopo, String nombre, String descripcion, String url
						signo = new Horoscopo();//Tabla Horoscopo: idHoroscopo, signo, descripcion, url
						signo.setIdHoroscopo(rs.getInt("idHoroscopo")); 
						signo.setNombre(rs.getString("signo"));  
						signo.setDescripcion(rs.getString("descripcion")); 
						signo.setUrl(rs.getString("url"));
						listaSignos.add(signo);
					}
				Conexion.crearEntregarInstancia().cerrarConexion(cnn);
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
		return listaSignos;
	}
	
	public Horoscopo buscarHoroscopoId(int id) {
		PreparedStatement ps;
		ResultSet rs;
		Horoscopo horoscopo = null;
		Connection cnn;
		
		try {
			cnn = Conexion.crearEntregarInstancia().getConexion();
			ps = cnn.prepareStatement(SQL_SEARCH);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			while(rs.next()) {		
				horoscopo = new Horoscopo(); //idHoroscopo, signo, descripcion, url 
				horoscopo.setIdHoroscopo(rs.getInt("idHoroscopo"));
				horoscopo.setNombre(rs.getString("signo"));
				horoscopo.setDescripcion(rs.getString("descripcion"));
				horoscopo.setUrl(rs.getString("url"));
			}
			Conexion.crearEntregarInstancia().cerrarConexion(cnn);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return horoscopo;
	}

}
