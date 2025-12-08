import java.util.ArrayList;

public class AgenciaViajes {

    private String nombre;
    private ArrayList<ServicioTuristico> servicios; // Lista polimórfica

    // Constructor
    public AgenciaViajes(String nombre) {
        this.nombre = nombre;
        this.servicios = new ArrayList<>();
    }

    // ================================
    //   MÉTODOS PARA AGREGAR SERVICIOS
    //   (SOBRECARGA)
    // ================================

    // ✔ Sobrecarga 1: añade un servicio genérico
    public void agregarServicio(ServicioTuristico servicio) {
        servicios.add(servicio);
        System.out.println("Servicio agregado: " + servicio.getNombre());
    }

    // ✔ Sobrecarga 2: añade un vuelo directamente por parámetros
    public void agregarServicio(String nombre, double precio, String aerolinea, String destino) {
        servicios.add(new Vuelo(nombre, precio, aerolinea, destino));
        System.out.println("Vuelo agregado: " + nombre);
    }

    // ✔ Sobrecarga 3: añade un hotel por parámetros
    public void agregarServicio(String nombre, double precio, int estrellas, String ubicacion) {
        servicios.add(new Hotel(nombre, precio, estrellas, ubicacion));
        System.out.println("Hotel agregado: " + nombre);
    }

    // ✔ Sobrecarga 4: añade un tour por parámetros
    public void agregarServicio(String nombre, double precio, double duracion, String guia, boolean esTour) {
        servicios.add(new Tour(nombre, precio, duracion, guia));
        System.out.println("Tour agregado: " + nombre);
    }

    // ================================
    //   MÉTODOS POLIMÓRFICOS
    // ================================

    // ✔ Método polimórfico: recibe cualquier servicio y llama al método sobrescrito
    public void mostrarInfoServicio(ServicioTuristico servicio) {
        System.out.println("\n--- Información del Servicio ---");
        servicio.mostrarInfo(); // Polimorfismo en acción
    }

    // ✔ Método polimórfico: recorre todos los servicios almacenados
    public void mostrarTodosLosServicios() {
        System.out.println("\n===== SERVICIOS REGISTRADOS EN LA AGENCIA =====");
        for (ServicioTuristico s : servicios) {
            s.mostrarInfo(); // Cada hijo ejecuta su propia versión
            System.out.println();
        }
    }
}
