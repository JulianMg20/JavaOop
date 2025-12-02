import java.util.Scanner;
public class Bucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // FOR Tabla de multiplicar
        System.out.println("=== TABLA DE MULTIPLICAR ===");
        System.out.print("Ingrese un número para la tabla: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // WHILE Numero Factorial
        System.out.println("\n=== FACTORIAL ===");
        System.out.print("Ingrese un número para calcular su factorial: ");
        int n = scanner.nextInt();
        int factorial = 1;
        int contador = 1;

        while (contador <= n) {
            factorial *= contador;
            contador++;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);


        // DO- WHILE VALIDAR ENTRADA
        System.out.println("\n=== VALIDACIÓN DE ENTRADA ===");
        do {
            System.out.print("Ingrese su número (0-10): ");
            numero = scanner.nextInt();

            if (numero < 0 || numero > 10) {
                System.out.println("Número inválido, intente de nuevo.");
            }

        } while (numero < 0 || numero > 10);

        System.out.println("Número válido: " + numero);


        //  FOR +BREAK
        System.out.println("\n=== BÚSQUEDA CON BREAK ===");
        int[] numeros = {3, 7, 10, 15, 20, 25};
        System.out.print("Ingrese un número a buscar: ");
        int buscar = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                System.out.println("Número encontrado en la posición " + i);
                encontrado = true;
                break; // Detiene la búsqueda
            }
        }
        if (!encontrado) {
            System.out.println("Número no encontrado.");
        }


        // CONTINUE: Filtrar números

        System.out.println("\n=== FILTRAR CON CONTINUE ===");
        System.out.println("Números pares entre 1 y 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // Salta los impares
            }
            System.out.println(i);



        }


    }
}

