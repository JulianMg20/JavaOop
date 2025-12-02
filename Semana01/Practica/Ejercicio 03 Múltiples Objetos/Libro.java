public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int paginaActual;
    private boolean prestado;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.paginaActual = 0;
        this.prestado = false;
    }

    public void leerPaginas(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que 0.");
            return;
        }

        paginaActual += cantidad;

        if (paginaActual > numeroPaginas) {
            paginaActual = numeroPaginas;
        }

        System.out.println("Ahora vas en la página " + paginaActual + ".");
    }

    public void prestar() {
        if (prestado) {
            System.out.println("El libro ya está prestado.");
        } else {
            prestado = true;
            System.out.println("Libro prestado.");
        }
    }

    public void devolver() {
        if (!prestado) {
            System.out.println("El libro no estaba prestado.");
        } else {
            prestado = false;
            System.out.println("Libro devuelto.");
        }
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public double porcentajeLeido() {
        return (paginaActual * 100.0) / numeroPaginas;
    }

    public void mostrarInformacion() {
        System.out.println("=== Información del Libro ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Página actual: " + paginaActual);
        System.out.println("Prestado: " + (prestado ? "Sí" : "No"));
        System.out.println("Porcentaje leído: " + porcentajeLeido() + "%");
    }
}

