//Crea una clase Estudiante que contenga las propiedades: nombre, edad, y curso. Define:
//1. Un constructor por defecto que asigne valores genéricos.
//2. Un constructor que acepte como parámetros el nombre y la edad.
//3. Un constructor que acepte todos los parámetros y utilice this() para llamar a otro constructor.
//4. Métodos para mostrar los detalles del estudiante.
//5. Un método toString para representar al estudiante como una cadena de texto.

public class Estudiante {
    String nombreYapellido;
    int edad;
    String curso;

    // 1. Constructor por defecto
    public Estudiante() {
        this.nombreYapellido = "Desconocido";
        this.edad = 0;
        this.curso = "No asignado";
    }

    // 2. Constructor con nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombreYapellido = nombre;
        this.edad = edad;
        this.curso = "No asignado";
    }

    // 3. Constructor con todos los parámetros, utilizando this() para llamar a otro constructor
    public Estudiante(String nombreYapellido, int edad, String curso) {
        this(nombreYapellido, edad); // Llama al constructor con nombre y edad
        this.curso = curso;
    }

    // 4. Metodo para mostrar los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombres Y Apellidos: " + nombreYapellido);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }

    // 5. Método toString para representar al estudiante como una cadena de texto
    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre y Apellido='" + nombreYapellido + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }
}

