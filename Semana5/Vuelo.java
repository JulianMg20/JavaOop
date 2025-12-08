public class Vuelo extends ServicioTuristico {

    private String aerolinea;
    private String destino;

    // Constructor
    public Vuelo(String nombre, double precio, String aerolinea, String destino) {
        super(nombre, precio); // Llamada al constructor del padre
        this.aerolinea = aerolinea;
        this.destino = destino;
    }

    // Getters y setters
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    // Sobrescritura del método obtenerDescripcion()
    @Override
    public String obtenerDescripcion() {
        return "Vuelo: " + nombre +
                "\nAerolínea: " + aerolinea +
                "\nDestino: " + destino +
                "\nPrecio: $" + precio;
    }

    // Sobrescritura del método mostrarInfo()
    @Override
    public void mostrarInfo() {
        System.out.println("=== Información del Vuelo ===");
        System.out.println(obtenerDescripcion());
    }
}
