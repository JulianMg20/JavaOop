package EjercicioDos;

public class ProductoDigital implements Vendible {

    private String nombre;
    private double precio;

    public ProductoDigital(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        precio -= precio * (porcentaje / 100);
    }

    @Override
    public String obtenerDescripcion() {
        return "Producto Digital: " + nombre;
    }
}
