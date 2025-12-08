package EjercicioDos;

public class ServicioPremium implements Vendible {

    private String nombre;
    private double precioMensual;

    public ServicioPremium(String nombre, double precioMensual) {
        this.nombre = nombre;
        this.precioMensual = precioMensual;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioMensual;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        precioMensual -= precioMensual * (porcentaje / 100);
    }

    @Override
    public String obtenerDescripcion() {
        return "Servicio Premium: " + nombre;
    }
}
