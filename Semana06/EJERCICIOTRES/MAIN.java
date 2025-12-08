package EJERCICIOTRES;

import java.util.ArrayList;

public class MAIN {
    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("        DEMOSTRACIÓN TIENDA ONLINE");
        System.out.println("============================================\n");

        // -----------------------------------------
        // 1. POLIMORFISMO CON CLASE ABSTRACTA
        // -----------------------------------------
        System.out.println(">>> 1. POLIMORFISMO CON CLASE ABSTRACTA\n");

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new ProductoFisico("Laptop Gamer", 5000, 3.2));
        productos.add(new ProductoDigital("Ebook de Java", 40));

        for (Producto p : productos) {
            p.mostrarInfo(); // método concreto de la clase abstracta
            System.out.println("Precio final: " + p.calcularPrecioFinal()); // método abstracto implementado
            System.out.println("--------------------------------------------");
        }

        // -----------------------------------------
        // 2. POLIMORFISMO CON INTERFACES
        // -----------------------------------------
        System.out.println("\n>>> 2. POLIMORFISMO CON INTERFACES\n");

        ArrayList<Vendible> vendibles = new ArrayList<>();

        vendibles.add(new ProductoFisico("Mouse Gamer", 120, 0.3));
        vendibles.add(new ProductoDigital("Curso Online Java", 90));

        for (Vendible v : vendibles) {
            System.out.println(v.obtenerDescripcion());
            v.aplicarDescuento(10);
            System.out.println("Precio final con descuento: " + v.calcularPrecioFinal());
            System.out.println("--------------------------------------------");
        }

        // -----------------------------------------
        // 3. DEMOSTRAR MÚLTIPLE IMPLEMENTACIÓN
        // -----------------------------------------
        System.out.println("\n>>> 3. DEMOSTRAR MÚLTIPLE IMPLEMENTACIÓN\n");

        Enviable productoEnviable = new ProductoFisico("Teclado Mecánico", 250, 1.1);

        System.out.println("Costo de envío: " + productoEnviable.calcularCostoEnvio());
        productoEnviable.generarGuiaEnvio();

        System.out.println("\n============================================");
        System.out.println("            FIN DE LA DEMOSTRACIÓN");
        System.out.println("============================================");
    }
}
