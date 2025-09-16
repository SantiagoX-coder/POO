//Ejercicio 2: Clase Matematicas con Métodos static
//1. Define una clase Matematicas que tenga métodos static para realizar las operaciones básicas (suma, resta, multiplicación, división).
//2. Crea una clase de prueba que llame a estos métodos y muestre los resultados.
public class Matematica {
    // Metodo static para sumar dos numeros
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Metodo static para restar dos numeros
    public static double restar(double a, double b) {
        return a - b;
    }

    // Metodo static para multiplicar dos numeros
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Metodo static para dividir dos numeros
    public static double dividir(double a, double b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Syntax Error ;).");
            return 0;
        }
    }
}
