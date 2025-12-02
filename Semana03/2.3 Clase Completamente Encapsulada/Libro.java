/**
 * Se representa un libro dentro de una biblioteca. */
public class Libro {

    // Atributos privados
    private String titulo;
    private String autor;
    private int paginas;
    private boolean disponible;

    public Libro(String titulo, String autor, int paginas) {
        setTitulo(titulo);
        setAutor(autor);
        setPaginas(paginas);
        this.disponible = true; // por defecto el libro está disponible
    }

    /**
     * Constructor mínimo (solo título y autor).
     * Las páginas quedan en 1 por defecto.
     */
    public Libro(String titulo, String autor) {
        this(titulo, autor, 1);
    }

    /**
     * Constructor de copia.
     */
    public Libro(Libro otro) {
        this(otro.titulo, otro.autor, otro.paginas);
        this.disponible = otro.disponible;
    }

    //Getters/Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas <= 0) {
            throw new IllegalArgumentException("Las páginas deben ser mayores a 0.");
        }
        this.paginas = paginas;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Métodos de negocio

    //libro como prestado.

    public void prestar() {
        if (!disponible) {
            throw new IllegalStateException("El libro ya está prestado.");
        }
        disponible = false;
    }

    // Marca el libro como devuelto.

    public void devolver() {
        if (disponible) {
            throw new IllegalStateException("El libro ya estaba disponible.");
        }
        disponible = true;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", disponible=" + disponible +
                '}';
    }
}
