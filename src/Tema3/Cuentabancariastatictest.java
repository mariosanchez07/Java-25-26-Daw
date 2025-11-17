package Tema3;

public class Cuentabancariastatictest {
    public static void main(String[] args) {
        // Crear tres cuentas (llamadas al constructor crean e incrementan totalCuentas)
        Cuentabancariastatic cuenta1 = new Cuentabancariastatic("Juan", 1000);
        Cuentabancariastatic cuenta2 = new Cuentabancariastatic("María", 2000);
        Cuentabancariastatic cuenta3 = new Cuentabancariastatic("Pedro", 1500);

        // Mostrar el total de cuentas creadas (método estático)
        System.out.println("El total de cuentas creadas es: " + Cuentabancariastatic.getTotalCuentas());
        System.out.println();

        // Realizar operaciones SOBRE LAS INSTANCIAS
        cuenta1.ingresar(200.0);   // correcto: llamar sobre objeto
        cuenta2.retirar(100.0);    // correcto: llamar sobre objeto
        cuenta3.retirar(10.0);     // correcto: llamar sobre objeto

        System.out.println();
        System.out.println("El total de cuentas creadas es: " + Cuentabancariastatic.getTotalCuentas());
    }
}