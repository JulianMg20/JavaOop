package EjercicioDos;

public class main {
    public static void Main(String[] args) {

        ProductoFisico laptop = new ProductoFisico("Laptop Gamer", 5000, 3.2);
        ProductoDigital ebook = new ProductoDigital("Ebook Java", 40);
        ServicioPremium suscripcion = new ServicioPremium("Membresía Pro", 20);

        System.out.println("--- PRODUCTO FÍSICO ---");
        System.out.println(laptop.obtenerDescripcion());
        laptop.aplicarDescuento(10);
        System.out.println("Precio final: " + laptop.calcularPrecioFinal());
        System.out.println("Envío: " + laptop.calcularCostoEnvio());
        laptop.generarGuiaEnvio();

        System.out.println("\n--- PRODUCTO DIGITAL ---");
        System.out.println(ebook.obtenerDescripcion());
        ebook.aplicarDescuento(5);
        System.out.println("Precio final: " + ebook.calcularPrecioFinal());

        System.out.println("\n--- SERVICIO PREMIUM ---");
        System.out.println(suscripcion.obtenerDescripcion());
        suscripcion.aplicarDescuento(20);
        System.out.println("Precio final: " + suscripcion.calcularPrecioFinal());
    }
}
