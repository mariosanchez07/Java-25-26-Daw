package Tema3;

public class coche {

	public static void main(String[] args) {
		ClaseCoche cocheMario = new ClaseCoche("negro", 250, 2.5);
		System.out.println(cocheMario.toString());
		
		
		
		//Pintamos el coche
		cocheMario.setColor("Amarillo");
		//Para comprobar opcion 1
		System.out.println(cocheMario.toString());
		//opcion 2
		System.out.println("El nuevo color de mario es: " +cocheMario.getColor());
	}

}
