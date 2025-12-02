import java.util.Scanner;
public class CalculadoraIMC {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

           System.out.print("Ingrese su peso en kilogramos (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Ingrese su altura en metros (m): ");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);

            System.out.printf("Su IMC es: %.2f%n", imc);
            System.out.print("Categoría: ");

            if (imc < 18.5) {
                System.out.println("Bajo peso");
            } else if (imc < 25) {
                System.out.println("Normal");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidad");
            }

            scanner.close();
        }
    }



