import java.util.Scanner;

public class PruebaLibro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese el título del libro: ");
        String titulo = sc.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = sc.nextLine();

        System.out.print("Ingrese el número de páginas: ");
        int numeroPaginas = sc.nextInt();

        // Crear el libro
        Libro libro = new Libro(titulo, autor, numeroPaginas);

        // === Menú interactivo ===
        int opcion;

        do {
            System.out.println("\n===== MENÚ LIBRO =====");
            System.out.println("1. Leer páginas");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar información");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántas páginas leer? ");
                    int cant = sc.nextInt();
                    libro.leerPaginas(cant);
                    break;

                case 2:
                    libro.prestar();
                    break;

                case 3:
                    libro.devolver();
                    break;

                case 4:
                    libro.mostrarInformacion();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
