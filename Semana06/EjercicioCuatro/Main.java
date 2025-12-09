package EjercicioCuatro;

import java.util.ArrayList;

// ------------------------------
// Clase padre (base)
// ------------------------------
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
}

// ------------------------------
// Subclase Perro
// ------------------------------
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}

// ------------------------------
// Subclase Gato
// ------------------------------
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau!");
    }
}

// ------------------------------
// Clase Main: demostración de polimorfismo
// ------------------------------
public class Main {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" DEMOSTRACIÓN DE POLIMORFISMO ");
        System.out.println("=================================\n");

        // ArrayList polimórfico (tipo padre)
        ArrayList<Animal> animales = new ArrayList<>();

        // Agregamos diferentes subclases
        animales.add(new Animal());
        animales.add(new Perro());
        animales.add(new Gato());

        System.out.println("--- Recorriendo con for-each ---");
        for (Animal a : animales) {
            a.hacerSonido(); // Dynamic Binding
        }

        System.out.println("\n--- Recorriendo con for clásico ---");
        for (int i = 0; i < animales.size(); i++) {
            animales.get(i).hacerSonido(); // Polimorfismo en acción
        }

        System.out.println("\n--- Fin de la demostración ---");
    }
}
