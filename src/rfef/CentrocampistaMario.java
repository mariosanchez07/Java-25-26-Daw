package rfef;

public class CentrocampistaMario {
		private String Nombre;
		private int edad;
		private int Numasistencia;
		
		// constructor 
		CentrocampistaMario(String ParamNombre, int Paramedad, int ParamNumasistencia){
			// ahora se meten los this de cada uno string = etc 
			this.Nombre = ParamNombre;
			this.edad = Paramedad;
			this.Numasistencia = ParamNumasistencia;
		}
		
		// hacemso get de todos los parametros que tenemos
		public int getEdad() {
			return this.edad;
		}

		public int getNumasistencia() {
			return this.Numasistencia;

		}

		public String getNombre() {
			return this.Nombre;
		}

		//Ahora hacemos un set de los parametros, nombre = nombre etc...
		public void setEdad(int edad) {
		    this.edad = edad;
		}

		public void setNumasistencia (int Numasistencia) {
		    this.Numasistencia = Numasistencia;
		}

		public void setNombre(String Nombre) {
		    this.Nombre = Nombre;
		}

		@Override
		public String toString() {
		    return "Centrocampista [Nombre=" + Nombre + ", edad=" + edad + ", Numasistencia=" + Numasistencia + "]";
	}

		public int getAsistencias() {
			return 0;
		}

		public void setAsistencias(int i) {
			// TODO Auto-generated method stub
			
		}
	}


