public class MusicalInstrumento {
    private String nombre;
    private String tipo;
    private String marca;


    public MusicalInstrumento(String nombre, String tipo, String marca) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
    }


    public void showInfo() {
        System.out.println("Instrumento: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("---------------------------");
    }
}
