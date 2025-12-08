public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad, "¡Guau guau!");
        this.raza = raza;
    }

    public void correr() {
        System.out.println(getNombre() + " (" + raza + ") está corriendo.");
    }

    public String getRaza() {
        return raza;
    }
}

