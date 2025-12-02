public class Main {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante();
        Estudiante est3 = new Estudiante();

        est1.nombre = "Ana";
        est1.edad = 18;
        est1.nota1 = 4.5;
        est1.nota2 = 3.8;

        est2.nombre = "Luis";
        est2.edad = 20;
        est2.nota1 = 2.9;
        est2.nota2 = 3.5;

        est3.nombre = "María";
        est3.edad = 19;
        est3.nota1 = 5.0;
        est3.nota2 = 4.7;

        est1.mostrarInformacion();
        est2.mostrarInformacion();
        est3.mostrarInformacion();
    }
}
