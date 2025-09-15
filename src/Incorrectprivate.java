//Ejercicio 3: Uso Incorrecto de private
//1. Intenta crear una clase que declare una propiedad private y accede a ella directamente desde otra clase. Observa los errores de compilación.
//2. Crea una clase que no implemente métodos get y set para un atributo private, y discute cómo podría afectar la protección de datos.
public class Incorrectprivate {
    private String secreto;


    public Incorrectprivate(String secreto) {
        this.secreto = secreto;

    }
}
public class Main {
    public static void main(String[] args) {
        Incorrectprivate ob = new Incorrectprivate("Mi secreto es *****");

        // No hay métodos get o set para el atributo secreto, lo que significa que no hay forma de acceder...
        // ... o modificar este atributo desde fuera de la clase Incorrectprivate.

        // Intentar acceder directamente al atributo private (esto causará un error de compilación)
        System.out.println("El secreto es: " + ob.secreto);
        // Error 1:
        // C: \User\desconocido\src\Incorretprivate13:22 java: //implicitly declared classes are a preview feature and are disabled by default.
        //(use --enable-preview to enable implicitly declared classes)
        // Error 2:
        // C: \User\desconocido\src\Incorretprivate13:22 java: ob. secreto has private access in Incorrectprivate
        // Explicación:
        // El atributo 'secreto' está declarado como private, lo que significa que solo puede ser accedido...
        // ... dentro de la clase Incorrectprivate. Intentar acceder a él directamente desde la clase Main...
        // ... resulta en un error de compilación porque la protección de acceso impide dicha acción.
        // Esto demuestra cómo la encapsulación y el uso del private protegen los datos de la clase...
        // ... evitando accesos no autorizados desde fuera de la clase.
    }
}