public class MusicalInstrument {

    // Atributos
    private String nombre;
    private String tipo;
    private String marca;

    // Constructor
    public MusicalInstrument (String nombre, String tipo, String marca) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
    }

    // Método para mostrar la información
    public void showInfo() {
        System.out.println("Instrumento: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("---------------------------");
    }
}

// Clase principal (debe tener el mismo nombre que el archivo)
class MúltiplesObjetos {
    public static void main(String[] args) {

        // Crear objetos de tipo MusicalInstrument
        MusicalInstrument bajo = new MusicalInstrument("Bajo Electrónico", "Cuerda", "Sandberg");
        MusicalInstrument clarinete = new MusicalInstrument("Clarinete", "Aerófono", "Yamaha");
        MusicalInstrument xilofono = new MusicalInstrument("Xilófono", "Percusión", "Pearl");
        MusicalInstrument trompeta = new MusicalInstrument("Trompeta", "Viento-metal", "Besson");
        MusicalInstrument trombon = new MusicalInstrument("Trombón", "Viento-metal", "Conn");

        // Mostrar la información de cada instrumento
        bajo.showInfo();
        clarinete.showInfo();
        xilofono.showInfo();
        trompeta.showInfo();
        trombon.showInfo();
    }
}
