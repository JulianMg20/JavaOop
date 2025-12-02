public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad, "¡Guau guau!"); // Uso correcto de super()
        this.raza = raza;
    }

    public void correr() {
        System.out.println(getNombre() + " está corriendo.");
    }
}
