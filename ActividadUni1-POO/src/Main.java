import java.util.Scanner;

    //Y en este bloque incorporamos la clase "Main" para poder correr el programa.
    public class Main {
        public static void main(String[] args) {
            Libro libro1 = new Libro();
            Scanner key = new Scanner(System.in);
            System.out.println("Ingrese el título del libro:" + libro1);
            libro1.titulo = key.nextLine();
            System.out.println("Ingrese el autor del libro:" );
            libro1.autor = key.nextLine();
            System.out.println("Ingrese el número de páginas del libro:");
            libro1.numeroPaginas = key.nextInt();
            key.close();
            libro1.mostrarDetalles();
            System.out.println(libro1);
        }
    }
