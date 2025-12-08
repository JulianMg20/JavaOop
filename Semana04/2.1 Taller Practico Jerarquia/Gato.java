public class Gato extends Animal {

    public Gato(String nombre, int edad, String colorPelaje) {
        super(nombre, edad, "¡Miau!"); // Uso correcto de super()
    }

    public void dormir() {
        System.out.println(getNombre() + " está durmiendo.");
    }
}