//Ejercicio 1: Clase Estudiante
//Crea una clase Estudiante con las propiedades nombre, edad y notaPromedio. Define:
//1. Todas las propiedades deben ser privadas.
//2. Proporciona métodos get y set para cada propiedad, incluyendo validaciones en los métodos set.
//3. Crea una clase de prueba para crear instancias de Estudiante y acceder a las propiedades.

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        setEdad(edad); // Usar el setter para aplicar validación
        setNotaPromedio(notaPromedio); // Usar el setter para aplicar validación
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para edad con validación
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Esa edad no va.");
        }
    }

    // Getter y Setter para notaPromedio con validación
    public double getNotaPromedio() {
        return notaPromedio;
        // ejemplo de variables para validacion
    }

    double notaInicial;
    double notaFinal;
    double notaPremedio = (notaInicial + notaFinal) / 2; // ejemplo de calulo de ncota promedio

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 100) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("La nota promedio debe estar entre 0 y 100.");
        }
    }
    @Override
    public String toString() {
        return "Estudiante[" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", notaPromedio=" + notaPromedio +
                "]";
    }
}
