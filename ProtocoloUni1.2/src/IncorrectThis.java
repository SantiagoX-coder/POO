//Ejercicio 3: Evitar Errores con this
//1. Intenta crear un metodo static que intente utilizar this y observa los errores de compilación.
//2. Corrige el código para eliminar el uso incorrecto de this.
public class IncorrectThis {
    private String nombre;

    public IncorrectThis(String nombre) {
        this.nombre = nombre;
    }

    // Metodo static que intenta usar 'this' (esto causará un error de compilación)
    public static void metodoEstatico() {
        // System.out.println("El nombre es: " + this.nombre); // Error: Cannot use 'this' in a static context
        // Explicación:
        // El uso de 'this' en un contexto estático no es válido porque 'this' se refiere a la instancia actual...
        // ... de la clase, y los métodos estáticos no están asociados a ninguna instancia específica.
        // Intentar acceder a 'this. nombre' en un metodo estático resulta en un error de compilación.
    }

    // Metodo corregido sin uso de 'this'
    public static void metodoEstaticoCorregido(IncorrectThis obj) {
        System.out.println("El nombre es: " + obj.nombre);
        // Explicación:
        // En este caso, pasamos una instancia de IncorrectThis como parámetro al metodo estático...
        // ... y accedemos al atributo 'nombre' a través de esa instancia, evitando el uso incorrecto de 'this'.
    }
}
