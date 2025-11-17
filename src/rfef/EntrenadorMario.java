package rfef;

public class EntrenadorMario {
int AñosExperencia;
int Edad;
String Nombre;
int Titulos;
	
	// constructor 
	EntrenadorMario (int AñosExperencia, int Edad, String Nombre, int Titulos){
		// ahora se meten los this de cada uno string = etc 
		this.Nombre = Nombre;
		this.Edad = Edad;
		this.AñosExperencia = AñosExperencia;
		this.Titulos = Titulos;
	}
	
	// hacemso get de todos los parametros que tenemos
	public int getEdad() {
		return this.Edad;
	}
	
	public int getTitulos() {
		return this.Titulos;
	}

	public int getAñosExperencia() {
		return this.AñosExperencia;

	}

	public String getNombre() {
		return this.Nombre;
	}

	//Ahora hacemos un set de los parametros, nombre = nombre etc...
	public void setEdad(int Edad) {
	    this.Edad = Edad;
	}

	public void setAñosExperencia (int AñosExperencia) {
	    this.AñosExperencia = AñosExperencia;
	}

	public void setNombre(String Nombre) {
	    this.Nombre = Nombre;
	}
	
	public void setTitulos(int Titulos) {
	    this.Titulos = Titulos;
	}

	@Override
	public String toString() {
	    return "Entrenador [Nombre=" + Nombre + ", Edad=" + Edad + ", AñosExperencia=" + AñosExperencia + ", Titulos=" + Titulos + "]";
}
}


