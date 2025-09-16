import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el precio del producto:");
        double precio = sc.nextDouble();
        Propuestos producto = new Propuestos(nombre, precio);
        producto.mostrarProducto();

        System.out.println('\n' + "Hasta aqui ha llegado el servicio de productos, ¡vuelva pronto!.");
        sc.nextLine(); // Limpiar el buffer

        System.out.println('\n' + "Bienvenido al registro de estudiantes.");
        System.out.println("Por favor, ingrese la información del estudiante que desea registrar.");

        System.out.println("Para comenzar, ingrese el nombre del estudiante:");
        String Nombre = sc.nextLine();
        System.out.println("Ahora, ingrese la edad del estudiante:");
        int edad = sc.nextInt();
        ConstructoresThis estudiante = new ConstructoresThis(Nombre, edad);
        estudiante.mostrarDetalles();

        sc.close();
    }
}