package Tema3;
/**
 * Clase CuentaBnacariaStatic que crea cuentas bancarias con atributo estatico
 * @author Mario
 * @since 31-oct-2025
 */

public class Cuentabancariastatic {
    private double saldo;
    private String titular;
    // Atributo estático: número total de cuentas creadas
    private static int totalCuentas = 0;

    // Constructor
    /**
     * @param titular
     * @param saldoInicial
     */
    public Cuentabancariastatic(String titular, double saldoInicial) {
        this.titular = titular;
    	this.saldo = saldoInicial;
        this.totalCuentas ++;
    }

    // Método para ingresar dinero (método de instancia)
    
    public void ingresar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se ha ingresado " + cantidad + "€. Saldo actual: " + saldo + "€");
    }

    // Método para retirar dinero (método de instancia)
    /**
     * @param cantidad
     */
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Fondos insuficientes. Operación cancelada.");
        } else {
            saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + "€. Saldo actual: " + saldo + "€");
        }
    }

    // Método para consultar el saldo
  
    public double getSaldo() {
        return saldo;
    }

    // Método estático para obtener el número total de cuentas creadas
    public static int getTotalCuentas() {
        return totalCuentas;
    }
}