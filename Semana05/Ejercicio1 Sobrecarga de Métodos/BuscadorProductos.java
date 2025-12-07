public class BuscadorProductos {


    public void buscar(int codigo) {
        System.out.println("Buscando producto con código: " + codigo);
        // Lógica para buscar por código...
    }


    public void buscar(String nombre) {
        System.out.println("Buscando producto con nombre: " + nombre);

    }


    public void buscar(double precioMin, double precioMax) {
        System.out.println("Buscando productos entre $" + precioMin + " y $" + precioMax);

    }
}

