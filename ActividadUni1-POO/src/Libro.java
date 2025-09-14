// Ejercicio 1: Crear una clase Libro
// Crea una clase Libro con las siguientes propiedades: titulo, autor, numeroPaginas.
// Define:
// 1. Un constructor por defecto que asigne valores predeterminados.
// 2. Un constructor parametrizado que permita asignar valores específicos.
// 3. Métodos para mostrar los detalles del libro.

public class Libro {
    // 👾 Propiedades
    String autor;
    String titulo;
    int numeroPaginas;

    // Constructor solo con autor, (ejemplo de sobrecarga)
    public Libro(String autor) {
       // Usamos metodo this. para
        this.autor = autor;
        this.titulo = "Sin titulo";
        this.numeroPaginas = 0;

    }


    // Constructor por defecto
    public Libro() {
        this.autor = "Desconocido";
        this.titulo = "Sin titulo";
        this.numeroPaginas = 0;
    }

    // Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    // Metodo para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }

    // Metodo toString para que la representacion textual sea legible al correr el programa
    @Override
    public String toString () {
        return "Libro{titulo='" + titulo + "', autor='" + autor + "', numeroPaginas=" + numeroPaginas + "}";
    }
    //Utilizamos clase Main para poder correr el programa
public class Main{
        public static void main(String[] args) {
            Libro libro1 = new Libro();
            libro1.mostrarDetalles();
        }
}

}