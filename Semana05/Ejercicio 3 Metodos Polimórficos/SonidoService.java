public class SonidoService {

    // MÉTODO POLIMÓRFICO
    public static void reproducirSonido(Animal animal) {
        animal.hacerSonido();
        // Dynamic binding: Java decide en tiempo de ejecución qué método llamar
    }
}
