package modelo;

public class Usuario {
	
	private String nombreUsuario;
	private String nombre;
	private String contrasenia;
	private int anioNacimiento;
	private int idHoroscopo;
	public Usuario(String nombreUsuario, String nombre, String contrasenia, int anioNacimiento, int idHoroscopo) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.anioNacimiento = anioNacimiento;
		this.idHoroscopo = idHoroscopo;
	}
	public Usuario() {
		super();
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	public int getIdHoroscopo() {
		return idHoroscopo;
	}
	public void setIdHoroscopo(int idHoroscopo) {
		this.idHoroscopo = idHoroscopo;
	}
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", nombre=" + nombre + ", contrasenia=" + contrasenia
				+ ", anioNacimiento=" + anioNacimiento + ", idHoroscopo=" + idHoroscopo + "]";
	}
	
	
}
