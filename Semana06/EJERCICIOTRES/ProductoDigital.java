package EJERCICIOTRES;

public class ProductoDigital extends Producto implements Vendible {

    public ProductoDigital(String nombre, double precioBase) {
        super(nombre, precioBase);
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
        return "Producto Digital: " + nombre;
    }
}

