    public class Hotel extends ServicioTuristico {

        private int numeroEstrellas;
        private String ubicacion;

        // Constructor
        public Hotel(String nombre, double precio, int numeroEstrellas, String ubicacion) {
            super(nombre, precio); // Constructor del padre
            this.numeroEstrellas = numeroEstrellas;
            this.ubicacion = ubicacion;
        }

        // Getters y setters
        public int getNumeroEstrellas() {
            return numeroEstrellas;
        }

        public void setNumeroEstrellas(int numeroEstrellas) {
            this.numeroEstrellas = numeroEstrellas;
        }

        public String getUbicacion() {
            return ubicacion;
        }

        public void setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
        }

        // Sobrescritura del método obtenerDescripcion()
        @Override
        public String obtenerDescripcion() {
            return "Hotel: " + nombre +
                    "\nUbicación: " + ubicacion +
                    "\nEstrellas: " + numeroEstrellas +
                    "\nPrecio por noche: $" + precio;
        }

        // Sobrescritura del método mostrarInfo()
        @Override
        public void mostrarInfo() {
            System.out.println("=== Información del Hotel ===");
            System.out.println(obtenerDescripcion());
        }
    }


