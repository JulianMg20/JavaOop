public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo MusicalInstrumento
        MusicalInstrumento guitarra = new MusicalInstrumento("Guitarra Acústica", "Cuerda", "Yamaha");
        MusicalInstrumento piano = new MusicalInstrumento("Piano Digital", "Teclado", "Casio");
        MusicalInstrumento bateria = new MusicalInstrumento("Batería Completa", "Percusión", "Pearl");


        guitarra.showInfo();
        piano.showInfo();
        bateria.showInfo();
    }
}
