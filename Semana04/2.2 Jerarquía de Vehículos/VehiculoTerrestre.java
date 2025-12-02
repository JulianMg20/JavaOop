public class VehiculoTerrestre extends Vehiculo {
    protected int numeroLlantas;

    public VehiculoTerrestre(String marca, String modelo, int anio, int numeroLlantas) {
        super(marca, modelo, anio);
        this.numeroLlantas = numeroLlantas;
    }

    public void conducir() {
        System.out.println(marca + " " + modelo + " está conduciendo por tierra.");
    }
}
