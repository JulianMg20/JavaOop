public class EmpleadoComision extends Empleado {
    private double ventasRealizadas;
    private double porcentajeComision;  // ejemplo: 0.10 = 10%

    public EmpleadoComision(String nombre, String identificacion, double salarioBase,
                            double ventasRealizadas, double porcentajeComision) {
        super(nombre, identificacion, salarioBase);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        // sobrescribe: salario base + comisión por ventas
        double comision = ventasRealizadas * porcentajeComision;
        return salarioBase + comision;
    }

    @Override
    public String obtenerDescripcion() {
        return "Empleado por Comisión: " + nombre +
                " (ventas: $" + ventasRealizadas +
                ", comisión: " + (porcentajeComision * 100) + "%)";
    }
}

