## 1.1 Cuestionario: Conceptos de Clase y Objeto

**1. ¿Qué es una clase en Java?**

A. Un valor almacenado en memoria

B. Un plano o plantilla para crear objetos

C. Una variable especial

D. Un método dentro de un objeto

**2. ¿Cuál de los siguientes NO es un pilar de la POO?**

A. Herencia

B. Polimorfismo

C. Recursividad

D. Encapsulamiento

**3. El operador new en Java se utiliza para…**

A. Crear un nuevo paquete

B. Eliminar objetos de memoria

C. Instanciar un objeto

D. Declarar una variable

**4. ¿Cuál es la función de los atributos en una clase?**

A. Realizar operaciones

B. Almacenar datos del objeto

C. Crear nuevas clases

D. Convertir un objeto en otro


**5. Explica con tus palabras qué es un atributo.**

**6. ¿Qué es un método en Java y qué propósito cumple dentro de una clase?**

**7. ¿Por qué es importante el encapsulamiento en POO?**

**8. Explica la diferencia entre clase y objeto usando un ejemplo propio.**

**9. Describe cómo funciona la herencia en Java y menciona un caso en el que sería útil implementarla.**


**10. Crea un ejemplo simple de una clase Java llamada Vehiculo que incluya:**

Dos atributos

Un constructor

Un método

Una breve explicación de su funcionamiento

Escribe el código y describe su funcionamiento.


## 1.2 Evaluación: Encapsulación y Modificadores

**1. Explica con tus palabras qué sucede si no se controla el acceso a los atributos de un objeto.**

**2. Que es romper el encapsulamiento en POO y cómo se puede evitar?**

**3. Analiza el siguiente código e identifica 2 errores de encapsulación:**
```java
public class Persona {
public String nombre;
public int edad;

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
```
**4. Observa el siguiente código y explica qué principio de POO se viola y cómo corregirlo:**

```java

public class Cuenta {
    public double saldo;

    public void retirar(double valor) {
        saldo = saldo - valor;
    }
}
```

