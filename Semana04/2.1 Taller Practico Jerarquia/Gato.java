public class Gato extends Animal {

    private String colorPelaje;

    public Gato(String nombre, int edad, String colorPelaje) {
        super(nombre, edad, "¡Miau!"); // Uso correcto de super()
        this.colorPelaje = colorPelaje;
    }

    public void dormir() {
        System.out.println(getNombre() + " está durmiendo.");
    }
}
