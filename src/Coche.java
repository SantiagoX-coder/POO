//Ejercicio 2: Clase Coche
//Crea una clase Coche con las propiedades marca, modelo y velocidadMaxima. Define:
//1. Todas las propiedades deben ser privadas.
//2. Proporciona un metodo acelerar que incremente velocidadMaxima solo si el incremento es positivo.
//3. Crea una clase de prueba que intente acceder a las propiedades directamente y observa los errores de compilación.
public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    // Constructor
    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = this.velocidadMaxima;
    }

    // Metodo para acelerar el coche
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }

    // Getters para las propiedades (sin setters para mantener la encapsulación)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;

    }
    public String toString() {
        return "Coche[" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ']';
    }
}

