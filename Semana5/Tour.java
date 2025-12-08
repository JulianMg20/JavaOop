public class Tour extends ServicioTuristico {

    private double duracionHoras;
    private String guia;

    // Constructor
    public Tour(String nombre, double precio, double duracionHoras, String guia) {
        super(nombre, precio);
        this.duracionHoras = duracionHoras;
        this.guia = guia;
    }

    // Getters y setters
    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    // Sobrescritura del método obtenerDescripcion()
    @Override
    public String obtenerDescripcion() {
        return "Tour: " + nombre +
                "\nDuración: " + duracionHoras + " horas" +
                "\nGuía: " + guia +
                "\nPrecio: $" + precio;
    }

    // Sobrescritura del método mostrarInfo()
    @Override
    public void mostrarInfo() {
        System.out.println("=== Información del Tour ===");
        System.out.println(obtenerDescripcion());
    }
}
