import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // 1) Demostración usando distintos constructores
        Rectangulo rDef = new Rectangulo(); // constructor sin parámetros
        Rectangulo rBA = new Rectangulo(3.0, 4.0); // constructor parcial base+altura
        Rectangulo rBAC = new Rectangulo(5.0, 2.5, "rojo"); // constructor parcial con color
        Rectangulo rFull = new Rectangulo(6.0, 4.0, "azul", "MiRect"); // constructor completo

        System.out.println("=== Ejemplos rápidos ===");
        System.out.println(rDef);
        System.out.println(rBA);
        System.out.println(rBAC);
        System.out.println(rFull);

        // 2) Ejemplo con datos del usuario (programa de prueba)
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Crear rectángulo desde entrada del usuario ===");
        try {
            System.out.print("Ingrese base: ");
            double base = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Ingrese altura: ");
            double altura = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Ingrese color: ");
            String color = sc.nextLine().trim();
            if (color.isEmpty()) color = "blanco";

            System.out.print("Ingrese nombre : ");
            String nombre = sc.nextLine().trim();
            if (nombre.isEmpty()) nombre = "Rectangulo";


            Rectangulo rUsuario = new Rectangulo(base, altura, color, nombre);
            System.out.println("\nRectángulo creado:");
            System.out.println(rUsuario);
        } catch (NumberFormatException e) {
            System.out.println("Entrada numérica inválida. Asegúrate de ingresar números válidos para base y altura.");
        } finally {
            sc.close();
        }
    }
}
