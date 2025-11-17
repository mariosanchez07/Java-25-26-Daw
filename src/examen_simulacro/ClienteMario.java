package examen_simulacro;

public class ClienteMario {
	private String Nombre;
	private String Dirección;
	private PerroMario Perro;
	
	
	// constructor 
				ClienteMario(String Nombre, String Dirección, PerroMario Perro){
					this.Nombre = Nombre;
					this.Dirección = Dirección;
}


				@Override
				public String toString() {
					return "ClienteMario [Nombre=" + Nombre + ", Dirección=" + Dirección + ", Perro=" + Perro + "]";
				}
				public void ComprarPerro(){
					System.out.println();	
					}
}
