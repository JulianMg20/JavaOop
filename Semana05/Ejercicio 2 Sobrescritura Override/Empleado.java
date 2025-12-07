public class Empleado {
    protected String nombre;
    protected String identificacion;
    protected double salarioBase;

    public Empleado(String nombre, String identificacion, double salarioBase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
    }

    // Método base
    public double calcularSalario() {
        return salarioBase;
    }

    // Método base
    public String obtenerDescripcion() {
        return "Empleado general: " + nombre;
    }
}
