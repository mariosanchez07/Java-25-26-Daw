package examen_simulacro;

public class PerroMario2 {
	private String Nombre;
	private int edad;
	private String Raza;
	
	// constructor 
			PerroMario2(String Nombre, int edad, String Raza){
				this.Nombre = Nombre;
				this.edad = edad;
				this.Raza= Raza;

				
}

			@Override
			public String toString() {
				return "PerroMario [Nombre=" + Nombre + ", edad=" + edad + ", Raza=" + Raza + "]";
			}
			public void HacerRuido (){
			System.out.println("Guau");	
			}
}