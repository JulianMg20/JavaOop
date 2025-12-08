package EJERCICIOUNO;

public class Revista extends MaterialBiblioteca {

    private int numeroEdicion;

    // Constructor usando super()
    public Revista(String titulo, String autor, int numeroEdicion) {
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInfo() {
        System.out.println("📰 Revista:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Edición No.: " + numeroEdicion);
    }
}
