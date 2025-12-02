public class Main1 {
    public static void main(String[] args) {

        // Crear objeto Persona
        Persona p = new Persona();

        // Usar setters para darle valores
        p.setNombre("Julian");
        p.setEdad(20);

        // Mostrar información
        p.mostrar();

        // Probar validación
        p.setEdad(-5); // Esto mostrará: "La edad no puede ser negativa."
    }
}
