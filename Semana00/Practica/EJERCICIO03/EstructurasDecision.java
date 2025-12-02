import java.util.Scanner;
public class  EstructurasDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("=== EVALUADOR DE CALIFICACIONES ===\n");
        System.out.print("Ingrese su calificación (0-100): \n");
        int calificacion = scanner.nextInt();


        char letra;
        if (calificacion >= 90) {
            letra = 'A';
        } else if (calificacion >= 80) {
            letra = 'B';
        } else if (calificacion >= 70) {
            letra = 'C';
        } else if (calificacion >= 60) {
            letra = 'D';
        } else {
            letra = 'F';
        }
        System.out.println("\nTu calificación: " + calificacion);
        System.out.println("Letra: " + letra);


        System.out.print("Estado: ");
        switch (letra) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Muy bien");
                break;
            case 'C':
                System.out.println("Bien");
                break;
            case 'D':
                System.out.println("Suficiente");
                break;
            case 'F':
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Desconocido");
        }


        if (letra == 'F') {
            System.out.println("Resultado: Reprobado");
        } else {
            System.out.println("Resultado: Aprobado");
        }

        scanner.close();
    }
}
