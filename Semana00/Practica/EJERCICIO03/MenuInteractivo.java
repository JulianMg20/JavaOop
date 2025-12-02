import java.util.Scanner;
public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = "";
        double calificacion = -1;
        int opcion;

        System.out.println("=== SISTEMA DE GESTIÓN DE ESTUDIANTES ===");

        do {
            // Mostrar menú
            System.out.println("\n--- MENU INTERACTIVO ---");
            System.out.println("1. Registrar nombre del estudiante");
            System.out.println("2. Registrar calificación");
            System.out.println("3. Mostrar información completa");
            System.out.println("4. Evaluar calificación con letra");
            System.out.println("5. Salir");
            System.out.print("\nSelecciona una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del estudiante: ");
                    nombre = sc.nextLine();
                    System.out.println("Nombre registrado exitosamente");
                    break;

                case 2:
                    System.out.print("Calificación (0-100): ");
                    calificacion = sc.nextDouble();

                    if (calificacion < 0 || calificacion > 100) {
                        System.out.println("Error: Calificación debe estar entre 0 y 100");
                        calificacion = -1;
                    } else {
                        System.out.println("Calificación registrada exitosamente");
                    }
                    break;

                case 3:
                    System.out.println("\n--- INFORMACIÓN DEL ESTUDIANTE ---");

                    System.out.println("Nombre: " +
                            (nombre.isEmpty() ? "(No registrado)" : nombre));

                    System.out.println("Calificación: " +
                            (calificacion == -1 ? "(No registrada)" : calificacion));
                    break;

                case 4:
                    if (calificacion == -1) {
                        System.out.println("Registra una calificación primero");
                    } else {
                        String letra;

                        if (calificacion >= 97) letra = "A+";
                        else if (calificacion >= 93) letra = "A";
                        else if (calificacion >= 90) letra = "A-";
                        else if (calificacion >= 87) letra = "B+";
                        else if (calificacion >= 83) letra = "B";
                        else if (calificacion >= 80) letra = "B-";
                        else if (calificacion >= 77) letra = "C+";
                        else if (calificacion >= 73) letra = "C";
                        else if (calificacion >= 70) letra = "C-";
                        else if (calificacion >= 60) letra = "D";
                        else letra = "F";

                        System.out.println("\n--- EVALUACIÓN ---");
                        System.out.println("Calificación: " + calificacion);
                        System.out.println("Letra: " + letra);
                        System.out.println("Estado: " +
                                (calificacion >= 60 ? "APROBADO" : "REPROBADO"));
                    }
                    break;

                case 5:
                    System.out.println("\n¡Hasta luego! Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 5);

        sc.close();
    }
}



