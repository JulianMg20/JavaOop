public class Polimofismo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sonido();

        Dog dog = new Dog();
        dog.sonido();

        // - Polimorfismo por Sobrecarga

        var calculadora = new Calculadora();
        System.out.println (calculadora.sum(3, 5));
        System.out.println (calculadora.sum(3, 5 , 9));
        System.out.println (calculadora.sum(3.2, 5.4));

    }

    public static class Animal {
        public void sonido() {
            System.out.println("Algún Sonido");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void sonido() {
            System.out.println("Gua");
        }
    }

    public static class Calculadora {

        public int sum(int a, int b) {
            return a + b;
        }

        public int sum(int a, int b, int c) {
            return a + b + c ;
        }

        public double sum(double a, double b) {
            return a + b;
        }
    }
}

