//Ejercicio 2: Clase Vehículo y Moto en Diferentes Paquetes
//1. Define una clase Vehículo en el paquete vehiculos con la propiedad tipo de paquete.
//2. Define una clase Moto en el paquete vehiculos que herede de Vehículo.
//3. Crea una clase de prueba en otro paquete e intenta acceder a los miembros de Vehículo y Moto...
//... Observa los errores de compilación y discute por qué suceden.
public class Vehiculo{
    String tipo; // Propiedad con acceso de paquete

    // Constructor
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    // Metodo para mostrar el tipo de vehiculo
    void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}
pakage vehiculos;
public class Moto extends Vehiculo {
    String marca;

    // Constructor
    public Moto(String tipo, String marca) {
        super(tipo); // Llamada al constructor de la clase base Vehículo
        this.marca = marca;
    }

    // Metodo para mostrar la información de la moto
    void mostrarInfo() {
        mostrarTipo(); // Llamada al metodo de la clase base
// Clase de prueba en otro paquete
package prueba;
import vehiculos.Vehiculo;
import vehiculos.Moto;
public class TestVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Genérico");
        Moto moto = new Moto("Motocicleta", "Yamaha");

        // Intentar acceder a la propiedad tipo (esto causará un error de compilación)
        System.out.println("Tipo de vehículo: " + vehiculo.tipo);
        // Error:
        // C:\User\desconocido\src\prueba\TestVehiculo.java:10: error: tipo has package-private access in Vehiculo
        // System.out.println("Tipo de vehículo: " + vehiculo.tipo);
        // Explicación:
        // La propiedad 'tipo' en la clase Vehículo tiene acceso de paquete (default), lo que significa...
        // ... que solo puede ser accedida desde clases dentro del mismo paquete 'vehiculos'.
        // Intentar acceder a ella desde la clase TestVehiculo en el paquete 'prueba' resulta en un error...
        // ... de compilación porque la protección de acceso impide dicha acción.
        // Esto demuestra cómo el acceso de paquete limita la visibilidad de los miembros de una clase...
        // ... a su propio paquete, protegiendo así los datos y comportamientos internos de accesos no autorizados.
    }
}
        System.out.println("Marca de la moto: " + marca);
    }
}
