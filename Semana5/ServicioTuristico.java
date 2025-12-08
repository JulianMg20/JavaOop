public class ServicioTuristico {

    // Atributos comunes
    protected String nombre;
    protected double precio;

    // Constructor
    public ServicioTuristico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Constructor vacío opcional
    public ServicioTuristico() {
        this.nombre = "Sin nombre";
        this.precio = 0.0;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método polimórfico
    public String obtenerDescripcion() {
        return "Servicio turístico genérico: " + nombre + " - Precio: $" + precio;
    }

    // Sobrescritura sugerida para hijos
    public void mostrarInfo() {
        System.out.println(obtenerDescripcion());
    }
}
