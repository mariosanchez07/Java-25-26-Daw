package examen_simulacro;

import java.util.Scanner;

public class sim24Mario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sumapositivos = 0;
        int cuentapositivo = 0;
        int sumanegativo = 0;
        int cuentanegativo = 0;
        int cuentaceros = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = sc.nextInt();

            if (numero > 0) {
                sumapositivos += numero;
                cuentapositivo++;
            } else if (numero < 0) {
                sumanegativo += numero;
                cuentanegativo++;
            } else {
                cuentaceros++;
            }
        }

        double mediapositivo = cuentapositivo > 0 ? (double) sumapositivos / cuentapositivo : 0;
        double medianegativo = cuentanegativo > 0 ? (double) sumanegativo / cuentanegativo : 0;

        System.out.println("\nEl número de ceros introducidos es: " + cuentaceros);
        System.out.println("Media de los positivos: " + mediapositivo);
        System.out.println("Media de los negativos: " + medianegativo);

        sc.close();
    }
}





