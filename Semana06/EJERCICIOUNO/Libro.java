package EJERCICIOUNO;

public class Libro extends MaterialBiblioteca {

    private int numeroPaginas;

    // Constructor usando super()
    public Libro(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInfo() {
        System.out.println("📘 Libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
    }
}
