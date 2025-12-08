public abstract class NombreClase {

// Atributos comunes para las clases hijas
private String nombre;

// Constructor
public NombreClase(String nombre) {
        this.nombre = nombre;
    }

// Getter y Setter

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

// Método abstracto (las clases hijas deben implementarlo)
public abstract void ejecutarServicio();

// Método NO abstracto (opcional)
public void mostrarInfo() {
    System.out.println("Servicio: " + nombre);
}
}
