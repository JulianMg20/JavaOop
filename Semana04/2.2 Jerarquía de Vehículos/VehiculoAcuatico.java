public class VehiculoAcuatico extends Vehiculo {
    protected double eslora; // largo del barco

    public VehiculoAcuatico(String marca, String modelo, int anio, double eslora) {
        super(marca, modelo, anio);
        this.eslora = eslora;
    }

    public void navegar() {
        System.out.println(marca + " " + modelo + " está navegando en el agua.");
    }
}
