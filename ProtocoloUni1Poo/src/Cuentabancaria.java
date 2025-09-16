// Define una clase CuentaBancaria con las propiedades: numeroCuenta, saldo y tipoCuenta.
//1. Un constructor por defecto.
//2. Un constructor parametrizado con dos parámetros (numeroCuenta y tipoCuenta).
//3. Un constructor sobrecargado con tres parámetros (numeroCuenta, saldo, y tipoCuenta).
//4. Métodos para depositar, retirar y mostrar el saldo actual.
//5. Un metodo toString para representar la cuenta bancaria como una cadena de texto.

public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    // 1. Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Desconocido";
    }

    // 2. Constructor parametrizado con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    // 3. Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // 4. Metodo para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso: " + cantidad);
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }

    // 4. Metodo para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso: " + cantidad);
        } else {
            System.out.println("Cantidad inválida para retiro.");
        }
    }

    // 4. Metodo para mostrar el saldo actual
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    // 5. Metodo toString
    @Override
    public String toString() {
        return "Cuenta Bancaria [" +
                "Número de cuenta: " + numeroCuenta +
                ", Saldo: " + saldo +
                ", Tipo de cuenta: " + tipoCuenta +
                "]";
    }
}
