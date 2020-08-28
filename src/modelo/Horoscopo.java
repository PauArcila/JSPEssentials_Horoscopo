package modelo;

public class Horoscopo {
	
	private int idHoroscopo;
	private String nombre;
	private String descripcion;
	private String url;
	
	public Horoscopo(int idHoroscopo, String nombre, String descripcion, String url) {
		super();
		this.idHoroscopo = idHoroscopo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.url = url;
	}
	
	public Horoscopo() {
		super();		// TODO Auto-generated constructor stub
	}

	public int getIdHoroscopo() {
		return idHoroscopo;
	}

	public void setIdHoroscopo(int idHoroscopo) {
		this.idHoroscopo = idHoroscopo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Horoscopo [idHoroscopo=" + idHoroscopo + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", url=" + url + "]";
	}
	
		
}
