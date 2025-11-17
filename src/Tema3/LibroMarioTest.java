package Tema3;

public class LibroMarioTest {
public static void main (String [] args) {
	LibroMario libro1 = new libroMario("Cien años de soledad", "Gabriel García Maárquez", 417);
	
	//mostrar informacion inicial
	libro1.mostrarnformacion();
	
	//leer páginas
	libro1.leer(100);
	libro1.leer(200);
	libro1.leer(150); //esto deberia completar el libro 
	
	//verificar si ha terminado
	if (libro1.estaTerminado()) {
		System.out.println("Has terminado el libro");
	} else {
		System.out.println("Aun te quedan paginas");
	}
	
	//Mostrar informacion final
	System.out.println();
	libro1.mostrarInformacion();
}
}
