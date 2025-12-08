package EJERCICIOUNO;

public class Main0 {
    public static void main(String[] args) {

        MaterialBiblioteca libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);
        MaterialBiblioteca revista = new Revista("National Geographic", "Varios", 202);

        libro.saludar();
        libro.mostrarInfo();
        System.out.println();

        revista.saludar();
        revista.mostrarInfo();
    }
}
