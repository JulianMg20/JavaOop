public class main11 {
    public static void main(String[] args) {
            BuscadorProductos buscador = new BuscadorProductos();

            buscador.buscar(101);
            buscador.buscar("Audífonos Gamer");
            buscador.buscar(50.0, 150.0);
        }
    }

