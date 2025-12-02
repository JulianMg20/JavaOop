public class Barco extends VehiculoAcuatico {
    private int capacidadPasajeros;

    public Barco(String marca, String modelo, int anio, double eslora, int capacidadPasajeros) {
        super(marca, modelo, anio, eslora);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void sonarSirena() {
        System.out.println("El barco hace: ¡BUOOOOOH!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Eslora (m): " + eslora);
        System.out.println("Capacidad pasajeros: " + capacidadPasajeros);
    }
}
