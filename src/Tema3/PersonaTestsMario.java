package Tema3;

public class PersonaTestsMario {
	public static void main(String[] args) {
		PersonaMario Mario= new PersonaMario("Mario", (byte) 17, 1.70);
		System.out.println("Datos del Mario=" + Mario+"\n");
		//Vemos el saludo de Mario
		Mario.Saludar();
		//Mario cumple Años
		Mario.CumplirAños();
		//Y ha crecido
		Mario.crecer(0.03);
		//Volvemos a ver los datos de Mario
		System.out.println("\nDatos de Mario=" + Mario+"\n");
		//Han pasado dos años
		Mario.setEdad( (byte)18);
		//Y ha crecido un poco más
		Mario.setEstatura(1.75);
		//Y ahora nos piden guardar también el apellido
		Mario.setNombre("Mario Sánchez");
		//Mostramos los nuevos datos
		System.out.println("Datos con cambios");
		System.out.println("Nombre:"+Mario.getNombre());
		System.out.println("Edad:"+Mario.getEdad());
		System.out.println("Estatura:"+Mario.getEstatura());
		}
}
