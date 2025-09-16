//Ejercicio 3: Uso Incorrecto de static
//1. Intenta crear un metodo static en una clase que intente acceder y modificar un atributo no estático. Observa los errores de compilación y explica
//por qué suceden.
//2. Corrige el código para que sea correcto.
public class StaticIncorrecto {
    String nombre;
    int edad;

    // Metodo static que intenta acceder a atributos no estáticos (esto causará un error de compilación)
    public static void mostrarDetalles() {
        //System.out.println("Nombre: " + nombre); // Error: no se puede hacer referencia a un campo de instancia desde un contexto estático
        //System.out.println("Edad: " + edad);   // Error: no se puede hacer referencia a un campo de instancia desde un contexto estático
        System.out.println("Error: No se puede acceder a atributos de instancia desde un método estático.");
    }

    // Metodo corregido que no es static y puede acceder a los atributos de instancia
    public void mostrarDetallesCorrecto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
