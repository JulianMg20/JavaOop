public class Personas {
    private String nombre;
    private int edad;
    private String identificacion;

    public Personas(String nombre, int edad, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre +
                ", tengo " + edad +
                " años y mi identificación es " + identificacion + ".");
    }

    public int calcularAnioNacimiento() {
        int anioActual = java.time.Year.now().getValue();
        return anioActual - edad;
    }
}
