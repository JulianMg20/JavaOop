public class Rectangulo {
    // Atributos privados
    private double base;
    private double altura;
    private String color;
    private String nombre;

    // Constructor principal (todos los parámetros)
    public Rectangulo(double base, double altura, String color, String nombre) {
        // Validación y asignación
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println(" Base inválida. Se establece valor por defecto 1.0");
            this.base = 1.0;
        }

        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println(" Altura inválida. Se establece valor por defecto 1.0");
            this.altura = 1.0;
        }

        if (color != null && !color.trim().isEmpty()) {
            this.color = color.trim();
        } else {
            System.out.println(" Color inválido. Se establece 'blanco'");
            this.color = "blanco";
        }

        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            System.out.println(" Nombre inválido. Se establece 'Rectangulo'");
            this.nombre = "Rectangulo";
        }
    }

    // Constructor sin parámetros -> usa valores por defecto
    public Rectangulo() {
        this(1.0, 1.0, "blanco", "Rectangulo"); // this() llama al constructor principal
    }

    // Constructor con parámetros parciales: base y altura
    public Rectangulo(double base, double altura) {
        this(base, altura, "blanco", "Rectangulo"); // reutiliza validación del constructor principal
    }

    // Otro constructor parcial: base, altura y color
    public Rectangulo(double base, double altura, String color) {
        this(base, altura, color, "Rectangulo");
    }

    // Getters
    public double getBase() { return base; }
    public double getAltura() { return altura; }
    public String getColor() { return color; }
    public String getNombre() { return nombre; }

    // Setters con validación simple
    public void setBase(double base) {
        if (base > 0) this.base = base;
        else System.out.println(" Base debe ser > 0");
    }
    public void setAltura(double altura) {
        if (altura > 0) this.altura = altura;
        else System.out.println(" Altura debe ser > 0");
    }
    public void setColor(String color) {
        if (color != null && !color.trim().isEmpty()) this.color = color.trim();
        else System.out.println(" Color inválido");
    }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) this.nombre = nombre.trim();
        else System.out.println(" Nombre inválido");
    }

    // Métodos útiles
    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return String.format("%s { base=%.2f, altura=%.2f, color=%s, area=%.2f, perimetro=%.2f }",
                nombre, base, altura, color, area(), perimetro());
    }
}
