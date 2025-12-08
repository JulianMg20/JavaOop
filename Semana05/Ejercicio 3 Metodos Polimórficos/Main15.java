public class Main15 {
    public static void main(String[] args) {

        Animal generic = new Animal();
        Animal perro = new Perro();
        Animal gato = new Gato();

        System.out.println("--- DEMOSTRACIÓN DE MÉTODO POLIMÓRFICO ---");

        SonidoService.reproducirSonido(generic);
        SonidoService.reproducirSonido(perro);
        SonidoService.reproducirSonido(gato);
    }
}

