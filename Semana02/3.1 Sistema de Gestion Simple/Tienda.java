import java.util.ArrayList;

public class Tienda {

    ArrayList<Producto> productos = new ArrayList<>();

    public void agregar(Producto p) {
        productos.add(p);
    }

    public Producto buscar(int id) {
        for (Producto p : productos)
            if (p.id == id) return p;
        return null;
    }

    public void mostrar() {
        if (productos.isEmpty()) System.out.println("No hay productos.");
        for (Producto p : productos) System.out.println(p);
    }

    public boolean eliminar(int id) {
        Producto p = buscar(id);
        return productos.remove(p);
    }
}
