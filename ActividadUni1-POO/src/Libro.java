// Ejercicio 1: Crear una clase Libro
// Crea una clase Libro con las siguientes propiedades: titulo, autor, numeroPaginas.
// Define:
// 1. Un constructor por defecto que asigne valores predeterminados.
// 2. Un constructor parametrizado que permita asignar valores específicos.
// 3. Métodos para mostrar los detalles del libro.

//Aplicamos la clase (Libro) para moldear y definir las propiedades y los comportamiento que tenga esta.
public class Libro {
    // 👾 Propiedades (atributos) caracteristiocas del objeto a presentar en este caso: Autor, titulo y número de paginas
    String autor;
    String titulo;
    int numeroPaginas;

    //Implementamos los construres (por defecto, sobrecargado y parametrizado) para inicializar el/los objetos al momento de crealos

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
        this(autor);
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    // Adoptamos los metodos toStirng y mostrarDetalles para que los objetos realicen las acciones deseadas
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }

    // Metodo toString para que la representacion textual sea legible al correr el programa y el @override para redifinir este metodo heredado...
    //...y se pueda adaptar a la clase.
    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', autor='" + autor + "', numeroPaginas=" + numeroPaginas + "}";
    }

 }


