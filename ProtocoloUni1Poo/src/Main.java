import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Ingrese el título del libro:");
        String titulo = inp.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = inp.nextLine();

        System.out.println("Ingrese el número de páginas del libro:");
        int numeroPaginas = inp.nextInt();

        Libro libro1 = new Libro(titulo, autor, numeroPaginas);

        libro1.mostrarDetalles();

        System.out.println(libro1);

        System.out.println( '\n' +" Creando una cuenta bancaria ");
        inp.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese el número de cuenta:");
        String numeroCuenta = inp.nextLine();
        System.out.println("Ingrese el tipo de cuenta:");
        String tipoCuenta = inp.nextLine();
        CuentaBancaria cuenta1 = new CuentaBancaria(numeroCuenta, tipoCuenta);
        cuenta1.depositar(500.0);
        cuenta1.retirar(200.0);
        cuenta1.mostrarSaldo();
        System.out.println(cuenta1);

        System.out.println(" Generando credenciales de un estudiante ");
        System.out.println("Ingrese Nombre y Apellido del estudiante:");
        String nombre = inp.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edad = Integer.parseInt(inp.nextLine());
        System.out.println("Ingrese el curso del estudiante:");
        String curso = inp.nextLine();
        Estudiante estudiante1 = new Estudiante(nombre, edad, curso);
        estudiante1.mostrarDetalles();
        System.out.println(estudiante1);
        inp.close();
    }

}
