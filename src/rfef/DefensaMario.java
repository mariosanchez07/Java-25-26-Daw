package rfef;

public class DefensaMario {
		private String Nombre;
		private int edad;
		private int PenaltisCometidos;
		
		// constructor 
		DefensaMario(String ParamNombre, int Paramedad, int ParamPenaltisCometidos){
			// ahora se meten los this de cada uno string = etc 
			this.Nombre = ParamNombre;
			this.edad = Paramedad;
			this.PenaltisCometidos = ParamPenaltisCometidos;
		}
		
		// hacemso get de todos los parametros que tenemos
		public int getEdad() {
			return this.edad;
		}

		public int getPenaltisCometidos() {
			return this.PenaltisCometidos;

		}

		public String getNombre() {
			return this.Nombre;
		}

		//Ahora hacemos un set de los parametros, nombre = nombre etc...
		public void setEdad(int edad) {
		    this.edad = edad;
		}

		public void setNumasistencia (int PenaltisCometidos) {
		    this.PenaltisCometidos = PenaltisCometidos;
		}

		public void setNombre(String Nombre) {
		    this.Nombre = Nombre;
		}

		@Override
		public String toString() {
		    return "Defensa [Nombre=" + Nombre + ", edad=" + edad + ", PenaltisCometidos=" + PenaltisCometidos + "]";
	}

		public int getAsistencias() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void setAsistencias(int i) {
			// TODO Auto-generated method stub
			
		}

		public int getFaltas() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void setFaltas(int i) {
			// TODO Auto-generated method stub
			
		}
	}


