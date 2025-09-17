import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del articulo:");
        String nombre = sc.nextLine();
        System.out.println("Introduzca el precio del articulo:");
        double precio = sc.nextDouble();
        System.out.println("Introduzca el stock del articulo:");
        int stock = sc.nextInt();
        Producto producto = new Producto(nombre, precio, stock);
        producto.mostrarInfo();
    }
}