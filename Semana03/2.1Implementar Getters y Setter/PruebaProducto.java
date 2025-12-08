import java.util.Scanner;

public class PruebaProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Producto p = new Producto();

        System.out.print("Ingrese código del producto: ");
        p.setCodigo(sc.nextLine());

        System.out.print("Ingrese nombre del producto: ");
        p.setNombre(sc.nextLine());

        System.out.print("Ingrese precio: ");
        p.setPrecio(sc.nextDouble());
        sc.nextLine(); // Limpia el salto de línea pendiente

        System.out.print("Ingrese stock: ");
        p.setStock(sc.nextInt());

        System.out.println("\n== Información del producto ==");
        System.out.println("Código: " + p.getCodigo());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Precio: " + p.getPrecio());
        System.out.println("Stock: " + p.getStock());

        sc.close(); // Buena práctica: cerrar el Scanner
    }
}

