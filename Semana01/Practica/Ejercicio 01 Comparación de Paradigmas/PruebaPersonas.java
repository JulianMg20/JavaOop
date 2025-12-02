import java.util.Scanner;

public class PruebaPersonas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese la identificación: ");
        String identificacion = sc.nextLine();

        // Crear objeto Persona
        Personas p = new Personas(nombre, edad, identificacion);

        // Mostrar información
        p.presentarse();
        System.out.println("Año de nacimiento: " + p.calcularAnioNacimiento());

        sc.close();
    }
}
