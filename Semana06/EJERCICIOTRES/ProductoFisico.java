package EJERCICIOTRES;

public class ProductoFisico extends Producto implements Vendible, Enviable {

    private double peso;

    public ProductoFisico(String nombre, double precioBase, double peso) {
        super(nombre, precioBase);
        this.peso = peso;
    }

    @Override
    public double calcularPrecioFinal() {
        // Ejemplo simple: se añade 15% de impuesto/servicio
        return precioBase * 1.15;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) return;
        precioBase = precioBase * (1 - porcentaje / 100.0);
    }

    @Override
    public String obtenerDescripcion() {
        return nombre + " (Físico, " + peso + "kg)";
    }

    @Override
    public double calcularCostoEnvio() {
        // Ejemplo: tarifa por kg
        return 10.0 * peso;
    }

    @Override
    public void generarGuiaEnvio() {
        System.out.println("Guía de envío generada para: " + nombre);
        System.out.println("Peso: " + peso + " kg | Costo envío: " + calcularCostoEnvio());
    }
}


