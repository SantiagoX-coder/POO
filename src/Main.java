import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre del estudiante:");
        String nombre = sc.nextLine();
        System.out.println("Introduzca la edad del estudiante:");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        double notainicial, notafinal, notaPromedio;
        System.out.println("Introduzca la nota inicial del estudiante:");
        notainicial = sc.nextDouble();
        System.out.println("Introduzca la nota final del estudiante:");
        notafinal = sc.nextDouble();
        notaPromedio = (notainicial + notafinal) / 2;
        System.out.println("La nota promedio del estudiante: " + notaPromedio);
        Estudiante estudiante = new Estudiante(nombre, edad, notaPromedio);
        System.out.println(estudiante);

        sc.nextLine(); // Limpiar el buffer

        System.out.println('\n' + "Bienvenido al registro de carros.");

        System.out.println('\n'+"Por favor, ingrese la información de los carros que desea registrar.");

        System.out.println("¿Cuántos carros desea registrar?");
        int cantidad = sc.nextInt();
        int i;
        sc.nextLine(); // Limpiar el buffer
        for (i = 0; i < cantidad; i++) {
            System.out.println("Generando el carro número: " + (i + 1));

            System.out.println("Registre la marca de su carro:");
            String marca = sc.nextLine();
            sc.nextLine(); // Limpiar el buffer
            System.out.println("Escriba el modelo del carro:");
            String modelo = sc.nextLine();
            double velocidadMaxima = 0;
            Coche carro = new Coche(marca, modelo, velocidadMaxima);
            System.out.println(carro);
            double tiempo;
            double distancia;
            System.out.println("Escriba la distancia del carro:");
            distancia = Double.parseDouble(sc.next());
            System.out.println("Escriba el tiempo de viaje del carro:");
            tiempo = Double.parseDouble(sc.next());
            velocidadMaxima = distancia / tiempo;
            System.out.println("La velocidad máxima del carro es: " + velocidadMaxima + " Km/h");

        }
        System.out.println('\n' + "Gracias por usar nuestro sistema de registro de carros. ¡Nos vemos prontooo!");
        sc.close();



    }
}