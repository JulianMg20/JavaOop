import java.util.Scanner;
   public class Estudiantes {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Datos del estudiante
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el código del estudiante: ");
            String codigo = sc.nextLine();

            System.out.print("Ingrese Nota 1: ");
            double nota1 = sc.nextDouble();

            System.out.print("Ingrese Nota 2: ");
            double nota2 = sc.nextDouble();

            System.out.print("Ingrese Nota 3: ");
            double nota3 = sc.nextDouble();

            // Calcular promedio
            double promedio = (nota1 + nota2 + nota3) / 3;

            // Determinar aprobación
            String estado = (promedio >= 3.0) ? "APROBÓ" : "NO APROBÓ";

            // Mostrar información completa
            System.out.println("\n=== INFORMACIÓN DEL ESTUDIANTE ===");
            System.out.println("Nombre: " + nombre);
            System.out.println("Código: " + codigo);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Nota 3: " + nota3);
            System.out.printf("Promedio: %.2f%n", promedio);
            System.out.println("Estado: " + estado);




        }
    }


