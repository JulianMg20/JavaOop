public class MainX {
    public static void main(String[] args) {
        Empleado empHoras = new EmpleadoPorHoras(
                "María", "123", 500000, 40, 20000);

        Empleado empComision = new EmpleadoComision(
                "Carlos", "456", 800000, 10000000, 0.10);

        System.out.println(empHoras.obtenerDescripcion());
        System.out.println("Salario: " + empHoras.calcularSalario());

        System.out.println();

        System.out.println(empComision.obtenerDescripcion());
        System.out.println("Salario: " + empComision.calcularSalario());
    }
}
