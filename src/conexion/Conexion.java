package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;



public class Conexion {
		
		
		private String usr = "tuNombreDeUsuarioRoot";
		private String pwd = "tuClaveDeUsuarioRoot";
		private String driver ="com.mysql.cj.jdbc.Driver";
		private String url = "jdbc:mysql://tuUrlDeServidorBBDD:0000/TuNombreDeBBDD?serverTimezone=UTC";
		//private String url = "jdbc:mysql://localhost:0000/TuNombreDeBBDD?serverTimezone=UTC";
		private static Conexion dataSource;
		private BasicDataSource basicDataSource = null;
		
		private Conexion() {
			
			basicDataSource = new BasicDataSource();
			basicDataSource.setDriverClassName(driver);
			basicDataSource.setUsername(usr);
			basicDataSource.setPassword(pwd);
			basicDataSource.setUrl(url);
			
			basicDataSource.setMinIdle(5);
			basicDataSource.setMaxIdle(10);
			basicDataSource.setMaxTotal(50);
			basicDataSource.setMaxWaitMillis(10000);
			
			
		}
		public static Conexion crearEntregarInstancia() {
			if(dataSource == null) {
				dataSource = new Conexion();
			}
			return dataSource;
		}
		public Connection getConexion() throws SQLException {
			return this.basicDataSource.getConnection();
		}
		public void cerrarConexion(Connection cnn) throws SQLException {
			cnn.close();
		}
	
}
