import java.util.Scanner;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ingresar datos para crear la cuenta
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = sc.nextLine();

        System.out.print("Ingrese el nombre del titular: ");
        String titular = sc.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        // Crear objeto
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, titular, saldoInicial);

        cuenta.mostrarInformacion();

        int opcion;
        do {
            System.out.println("\n=== Menú ===");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Cantidad a depositar: ");
                    double dep = sc.nextDouble();
                    cuenta.depositar(dep);
                    break;

                case 2:
                    System.out.print("Cantidad a retirar: ");
                    double ret = sc.nextDouble();
                    cuenta.retirar(ret);
                    break;

                case 3:
                    System.out.println("Saldo actual: " + cuenta.consultarSaldo());
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}
