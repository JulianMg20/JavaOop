public class Animal {

    private String nombre;
    private int edad;
    private String sonido;

    public Animal(String nombre, int edad, String sonido) {
        this.nombre = nombre;
        this.edad = edad;
        this.sonido = sonido;
    }

    public void hacerSonido() {
        System.out.println(sonido);
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
}


