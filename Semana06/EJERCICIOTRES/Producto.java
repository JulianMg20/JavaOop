package EJERCICIOTRES;

public abstract class Producto {
    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio base: " + precioBase);
    }

    public abstract double calcularPrecioFinal();
}

