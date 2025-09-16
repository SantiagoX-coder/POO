//7. Ejercicios Propuestos
//Ejercicio 1: Clase Producto con Constructor y Métodos de Acceso
//1. Define una clase Producto con los atributos nombre y precio.
//2. Crea un constructor que reciba los parámetros nombre y precio y utiliza this para diferenciarlos de los atributos.
//3. Define un metodo mostrarProducto que imprima los detalles del producto.
//4. Crea una clase de prueba para instanciar objetos de Producto y llamar al metodo mostrarProducto.

public class Propuestos {
    private String nombre;
    private double precio;

    // Constructor
    public Propuestos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Metodo para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio);

    }
}
