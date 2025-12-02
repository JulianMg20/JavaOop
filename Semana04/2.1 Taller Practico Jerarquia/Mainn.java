public class Mainn {
    public static void main(String[] args) {

        Perro p = new Perro("Tarzan", 3, "Labrador");
        Gato g = new Gato("Mala", 4, "Blanco");

        System.out.println("=== Prueba del Perro ===");
        p.hacerSonido();  // herencia + override
        p.correr();

        System.out.println("\n=== Prueba del Gato ===");
        g.hacerSonido();  // herencia + override
        g.dormir();
    }
}
