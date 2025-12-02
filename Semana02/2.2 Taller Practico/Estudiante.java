public class Estudiante {
    String nombre;
    int edad;
    double nota1;
    double nota2;

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("-------------------------");
    }
}

