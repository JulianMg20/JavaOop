import java.util.Scanner;

public class PruebaPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         // Creamos el lector
        System.out.print("Ingrese el nombre: ");     // Pedimos el nombre
        String nombre = sc.nextLine();               // Guardamos lo que escribe el usuario
        System.out.println("Hola, " + nombre + "!"); // Mostramos un saludo
        sc.close();                                   // Cerramos el lector
    }
}
