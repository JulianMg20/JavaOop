import java.util.ArrayList;

public class AgenciaViajes {

    private String nombre;
    private ArrayList<ServicioTuristico> servicios; // Lista polimórfica

    // Constructor
    public AgenciaViajes(String nombre) {
        this.nombre = nombre;
        this.servicios = new ArrayList<>();
    }

    // ==============================
    // MÉTODOS PARA AGREGAR SERVICIOS
    // (SOBRECARGA)
    // ==============================

    // ✓ Sobrecarga 1: añade un servicio genérico
    public void agregarServicio(ServicioTuristico servicio) {
        if (servicio != null) {
            servicios.add(servicio);
            System.out.println("Servicio agregado: " + servicio.getNombre());
        } else {
            System.out.println("Error: servicio nulo.");
        }
    }

    // Getter para nombre (opcional)
    public String getNombre() {
        return nombre;
    }

    // Getter para lista de servicios (opcional)
    public ArrayList<ServicioTuristico> getServicios() {
        return servicios;
    }
}

