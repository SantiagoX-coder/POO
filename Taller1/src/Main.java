import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println('\n'+"Bienvenido al registro de carros.");
        System.out.println("Por favor, ingrese la información de los carros que desea registrar.");
        System.out.println("¿Cuántos carros desea registrar?");
        int cantidad = inp.nextInt();
        int i;
        inp.nextLine();
        for (i = 0; i < cantidad; i++) {
            System.out.println("Generando el carro número: " + (i + 1));

            System.out.println("Registre la marca de su carro:");
            String marca = inp.nextLine();
            System.out.println("Registre el modelo de su carro:");
            String modelo = inp.nextLine();

            Carro carro = new Carro(marca, modelo);
            System.out.println(carro);
        }

    Carro.mostrarContadorCoches();
        System.out.println('\n'+"Gracias por usar nuestro sistema de registro de carros. ¡Hasta luego!");

        double a, b;
        System.out.println(" Ingrese dos números para realizar una adición: ");
        a = inp.nextDouble();
        b = inp.nextDouble();
        System.out.println("El resultado de la suma es: " + Matematica.sumar(a, b));
        System.out.println(" Ingrese dos números para realizar una resta: ");
        a = inp.nextDouble();
        b = inp.nextDouble();
        System.out.println("El resultado de la resta es: " + Matematica.restar(a, b));
        System.out.println(" Ingrese dos números para realizar una multiplicación: ");
        a = inp.nextDouble();
        b = inp.nextDouble();
        System.out.println("El resultado de la multiplicación es: " + Matematica.multiplicar(a, b));
        System.out.println(" Ingrese dos números para realizar una división: ");
        a = inp.nextDouble();
        b = inp.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println("Indeterminación matemática.");
        } else if (b == 0) {
            System.out.println("Error: División por cero no está definida.");
        }
        System.out.println("El resultado de la división es: " + Matematica.dividir(a, b));
        inp.close();
    }

}

