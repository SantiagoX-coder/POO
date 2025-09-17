//7. Ejercicios Propuestos
//Ejercicio 1: Clase Producto
//Crea una clase Producto con las propiedades nombre, precio y stock. Define:
//1. Todas las propiedades deben tener acceso de paquete (default).
//2. Crea un constructor con acceso de paquete que inicialice todas las propiedades.
//3. Crea un metodo mostrarInfo() con acceso de paquete para mostrar los detalles del producto.
//4. Crea una clase de prueba dentro del mismo paquete y verifica que se pueden acceder correctamente a los miembros.
public class Producto {
    String nombre;
    double precio;
    int stock;

    // Constructor con acceso de paquete
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodo para mostrar la información del producto
    void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}
