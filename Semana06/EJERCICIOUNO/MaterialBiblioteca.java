package EJERCICIOUNO;

// Clase abstracta
public abstract class MaterialBiblioteca {

    // Atributos protegidos
    protected String titulo;
    protected String autor;

    // Constructor
    public MaterialBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Método abstracto (cada material lo implementa diferente)
    public abstract void mostrarInfo();

    // Método concreto (común para todos)
    public void saludar() {
        System.out.println("Bienvenido al sistema de Biblioteca.");
    }
}
