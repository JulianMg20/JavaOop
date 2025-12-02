public class CuentaBancaria {

    // Atributos
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    // Método retirar
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
            } else {
                System.out.println("Fondos insuficientes.");
            }
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    // Método consultarSaldo
    public double consultarSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("\n=== Información de la Cuenta ===");
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Inicial: " + saldo);
    }
}
