package rfef;

public class DelanteroMario {
		private String Nombre;
		private int edad;
		private int GolesAnotados;
		
		// constructor 
		DelanteroMario (String ParamNombre, int Paramedad, int ParamGolesAnotados){
			// ahora se meten los this de cada uno string = etc 
			this.Nombre = ParamNombre;
			this.edad = Paramedad;
			this.GolesAnotados = ParamGolesAnotados;
		}
		
		// hacemso get de todos los parametros que tenemos
		public int getEdad() {
			return this.edad;
		}

		public int getGolesAnotados() {
			return this.GolesAnotados;

		}

		public String getNombre() {
			return this.Nombre;
		}

		//Ahora hacemos un set de los parametros, nombre = nombre etc...
		public void setEdad(int edad) {
		    this.edad = edad;
		}

		public void setGolesAnotados (int GolesAnotados) {
		    this.GolesAnotados = GolesAnotados;
		}

		public void setNombre(String Nombre) {
		    this.Nombre = Nombre;
		}

		@Override
		public String toString() {
		    return "Delantero [Nombre=" + Nombre + ", edad=" + edad + ", GolesAnotados=" + GolesAnotados + "]";
	}
	}


