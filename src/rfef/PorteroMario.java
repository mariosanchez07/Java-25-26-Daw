package rfef;

public class PorteroMario{
	int GolesRecibidos;
	int Edad;
	String Nombre;
	
		
		// constructor 
		PorteroMario (int GolesRecibidos, int Edad, String Nombre){
			// ahora se meten los this de cada uno string = etc 
			this.Nombre = Nombre;
			this.Edad = Edad;
			this.GolesRecibidos = GolesRecibidos;
			
		}
		public int getPorterias() {
	
			return 0;
		}

public void setPorterias(int i) {
			
		}

		
		// hacemso get de todos los parametros que tenemos
		public int getEdad() {
			return this.Edad;
		}
		

		public int getGolesRecibidos() {
			return this.GolesRecibidos;

		}

		public String getNombre() {
			return this.Nombre;
		}

		//Ahora hacemos un set de los parametros, nombre = nombre etc...
		public void setEdad(int Edad) {
		    this.Edad = Edad;
		}

		public void setGolesRecibidos (int GolesRecibidos) {
		    this.GolesRecibidos = GolesRecibidos;
		}

		public void setNombre(String Nombre) {
		    this.Nombre = Nombre;
		}
		
	

		@Override
		public String toString() {
		    return "Portero [Nombre=" + Nombre + ", Edad=" + Edad + ", GolesRecibidos=" + GolesRecibidos + "]";
		}
		
}
