package Tema3;

public class ClaseHotel {
	String codigo;
    String ciudad;
    String num_plazas;
    String direccion;
    String nombre;
	public ClaseHotel(String codigo, String ciudad, String num_plazas, String direccion, String nombre) {
		super();
		this.codigo = codigo;
		this.ciudad = ciudad;
		this.num_plazas = num_plazas;
		this.direccion = direccion;
		this.nombre = nombre;
	}
	
	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getNum_plazas() {
		return num_plazas;
	}


	public void setNum_plazas(String num_plazas) {
		this.num_plazas = num_plazas;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "ClaseHotel [codigo=" + codigo + ", ciudad=" + ciudad + ", num_plazas=" + num_plazas + ", direccion="
				+ direccion + ", nombre=" + nombre + "]";
	}
    

}
