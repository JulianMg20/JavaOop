import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tienda tienda = new Tienda();
        int op;

        do {
            System.out.println("\n1. Agregar\n2. Mostrar\n3. Buscar\n4. Eliminar\n5. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("ID: "); int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: "); String nombre = sc.nextLine();
                    System.out.print("Precio: "); double precio = sc.nextDouble();
                    tienda.agregar(new Producto(id, nombre, precio));
                    break;

                case 2:
                    tienda.mostrar();
                    break;

                case 3:
                    System.out.print("ID a buscar: ");
                    Producto p = tienda.buscar(sc.nextInt());
                    System.out.println(p != null ? p : "No encontrado");
                    break;

                case 4:
                    System.out.print("ID a eliminar: ");
                    System.out.println(tienda.eliminar(sc.nextInt()) ? "Eliminado" : "No existe");
                    break;
            }
        } while (op != 5);
    }
}
