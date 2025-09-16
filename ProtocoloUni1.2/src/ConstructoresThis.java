//Ejercicio 2: Llamada a Constructores con this()
//1. Define una clase Estudiante con los atributos nombre y edad.
//2. Crea un constructor por defecto que llame a un constructor con dos parámetros utilizando this().
//3. Define un metodo que imprima los detalles del estudiante.
public class ConstructoresThis {
    private String Nombre;
    private int edad;

    // Constructor por defecto
    public ConstructoresThis() {
        this("Desconocido", 0); // Llama al constructor con dos parámetros
    }

    // Constructor con dos parámetros
    public ConstructoresThis(String nombre, int edad) {
        this.Nombre = nombre;
        this.edad = edad;
    }

    // Metodo para mostrar los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Estudiante: " + Nombre + ", Edad: " + edad);
    }
}
