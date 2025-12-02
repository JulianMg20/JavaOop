public class Persona {

    private String nombre;
    private int edad;
    private String identificacion;
    private String profesion;

    public Persona(String nombre, int edad, String identificacion, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.profesion = profesion;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void cumplirAnios() {
        edad++;
    }

    public void cambiarProfesion(String nuevaProfesion) {
        profesion = nuevaProfesion;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void mostrarInformacion() {
        System.out.println("=== Información de la Personas ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Profesión: " + profesion);
        System.out.println("Mayor de edad: " + (esMayorDeEdad() ? "Sí" : "No"));
    }
}

