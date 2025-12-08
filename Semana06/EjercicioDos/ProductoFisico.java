package EjercicioDos;

public class ProductoFisico implements Vendible, Enviable {

    private String nombre;
    private double precioBase;
    private double peso;

    public ProductoFisico(String nombre, double precioBase, double peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.peso = peso;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        precioBase -= precioBase * (porcentaje / 100);
    }

    @Override
    public String obtenerDescripcion() {
        return "Producto Físico: " + nombre;
    }

    @Override
    public double calcularCostoEnvio() {
        return peso * 1.5; // costo por kg
    }

    @Override
    public void generarGuiaEnvio() {
        System.out.println("Generando guía de envío para " + nombre);
    }
}

