public class Motocicleta extends VehiculoTerrestre {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int anio, int numeroLlantas, boolean tieneSidecar) {
        super(marca, modelo, anio, numeroLlantas);
        this.tieneSidecar = tieneSidecar;
    }

    public void hacerCaballito() {
        System.out.println(marca + " " + modelo + " está haciendo un caballito!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}
