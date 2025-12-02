public class Automovil extends VehiculoTerrestre {
    private int puertas;

    public Automovil(String marca, String modelo, int anio, int numeroLlantas, int puertas) {
        super(marca, modelo, anio, numeroLlantas);
        this.puertas = puertas;
    }

    public void tocarClaxon() {
        System.out.println("El automóvil hace: ¡BEEP BEEP!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Llantas: " + numeroLlantas);
        System.out.println("Puertas: " + puertas);
    }

}


