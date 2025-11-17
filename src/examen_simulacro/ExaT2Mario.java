package examen_simulacro;

import java.util.Scanner;

public class ExaT2Mario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int opcion;
		//Bucle do while que se ejecutara repetidamente hasta que elija la opcion 3
		do { 
			// Le ingresamos por pantalla al usuario las opciones
		System.out.println("Menú del progrma del alumno Mario: ");
		// Pintamos la opcion 1
		System.out.println("1. Opcion 1. Usando el buvle for pinta los números pares del 2 al 20.");
		//Pintamos la opcion 2
		System.out.println("2. Opcion 2. Usando while pinta los impares del 21 al 1 en orden decreciente");
		//Pintamos la opcion 3
		System.out.println("3. Salir");
		//Pintamos la opcion 4
		System.out.print("Ingrese su opcion: ");
		opcion = sc.nextInt();
		// Hacemos un switch para que depende del numero que ingrese se use cierta opción
		switch (opcion) {
		// Hacemos la primero opcion que es la 1, si ingresa el numero uno se hara un bucle usando for que pinta los numeros pares del 2 al 20 
		case 1:
			System.out.println("Has pulsado la opcion 1: ");
			for (int i = 2; i <20; i +=2) {
				System.out.print(i+ " ");
			}
			System.out.println("\n");
			//Rompemos el case 1 y empezamos el case 2
			break;
		//Aqui se creara el bucle con while cuando pulsa la opcion 2
		case 2:
			System.out.println("Has pulsado la opcion 2: ");
			//Bucle while para que pinte los numero impares del 21 al 1 en orden descendiente 
			int i = 21;
			while (i >= 1)
{
				//si el numero es impar se imprime
	if (i % 2 != 0) {
		System.out.print(i + " ");
}
	//decrementamos i en 1 cada vez  
	i--;
}
	System.out.println("\n");
	break;
	
	//Creamos la opcion 3 que le hara salir del menu 
case 3:
	System.out.println("Saliendo del progrma...");
	break;
	
	default:
		System.out.println("Opcion no valida pulse de nuevo otra vez. \n");
		break;
		}
		// El bucle se repetira misntras no se pulse la opcion 3 
		}while (opcion != 3);
		
	System.out.println("El programa del alumno Mario a finalizado.");
	sc.close();
	}
}
	
