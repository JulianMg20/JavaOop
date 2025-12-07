public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, String identificacion, double salarioBase,
                            int horasTrabajadas, double valorHora) {
        super(nombre, identificacion, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        // sobrescribe: salario base + pago por horas
        return salarioBase + (horasTrabajadas * valorHora);
    }

    @Override
    public String obtenerDescripcion() {
        return "Empleado por Horas: " + nombre +
                " (horas: " + horasTrabajadas + ", valor/hora: " + valorHora + ")";
    }
}

