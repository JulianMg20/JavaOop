import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese la identificación: ");
        String identificacion = sc.nextLine();

        System.out.print("Ingrese la profesión: ");
        String profesion = sc.nextLine();


        Persona p = new Persona(nombre, edad, identificacion, profesion);


        p.presentarse();
        p.mostrarInformacion();
    }
}
