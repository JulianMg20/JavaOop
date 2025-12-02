public class TestVehiculos {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Toyota", "Corolla", 2020, 4, 4);
        Motocicleta moto = new Motocicleta("Yamaha", "R6", 2019, 2, false);
        Barco barco = new Barco("Yamaha", "WaveRunner", 2021, 3.5, 3);

        System.out.println("\n--- AUTOMÓVIL ---");
        auto.mostrarInfo();
        auto.encender();
        auto.conducir();
        auto.tocarClaxon();

        System.out.println("\n--- MOTOCICLETA ---");
        moto.mostrarInfo();
        moto.encender();
        moto.conducir();
        moto.hacerCaballito();

        System.out.println("\n--- BARCO ---");
        barco.mostrarInfo();
        barco.encender();
        barco.navegar();
        barco.sonarSirena();
    }
}
