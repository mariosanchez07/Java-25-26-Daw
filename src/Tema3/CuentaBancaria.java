package Tema3;

public class CuentaBancaria {
    // Atributos
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para ingresar dinero
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para obtener el titular
    public String getTitular() {
        return titular;
    }

    // Clase de test
public class CuentaBancariaTest {
    public static void main(String[] args) {
        // Crear la cuenta con saldo inicial de 1000€
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.0);

        // Ingresar 500€
        cuenta.ingresar(500.0);

        // Retirar 200€
        cuenta.retirar(200.0);

        // Mostrar el saldo final
        System.out.println("El saldo actual de " + cuenta.getTitular() + " es: " + cuenta.consultarSaldo() + "€");
    }
}
}

