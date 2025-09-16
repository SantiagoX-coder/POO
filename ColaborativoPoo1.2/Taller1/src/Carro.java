// Ejercicio 1: Clase Coche con Contador de Instancias
//1. Crea una clase Coche con los atributos marca, modelo y un atributo static llamado contadorCoches.
//2. Define un constructor que incremente contadorCoches cada vez que se cree un objeto de la clase.
//3. Crea un metodo static para mostrar cuántos coches se han creado.
//4. Implementa un metodo toString para representar el coche como una cadena de texto.
//5. En el metodo main, crea varios objetos de la clase Coche y muestra el contador...
//... de coches utilizando el metodo static.
public class Carro {
    String marca;
    String modelo;
    static int contadorCoches = 0;

    // Constructor que incrementa el contador de coches
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    // Metodo static para mostrar cuántos coches se han creado
    public static void mostrarContadorCoches() {
        System.out.println("Número de coches registrados: " + contadorCoches);
    }

    // Metodo toString para representar el coche como una cadena de texto
    @Override
    public String toString() {
        return "Carro[" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                "]";
    }
}
