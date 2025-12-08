package EJERCICIOTRES;

public interface Vendible {
    String obtenerDescripcion();
    void aplicarDescuento(double porcentaje);
    double calcularPrecioFinal();
}

