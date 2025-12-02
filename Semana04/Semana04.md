# Semana 4

### 1.1 Cuestionario sobre Herencia, Extends y Super

****Preguntas de opción múltiple****


**1. ¿Qué significa que una clase extienda a otra en Java?**

[ ] A. Que copia todos los métodos privados de la clase padre.

[X] B. Que adquiere los atributos y métodos públicos y protegidos de la clase padre.

[ ] C. Que puede modificar el código fuente de la clase padre.

[ ] D. Que elimina la necesidad del uso de constructores.


**2. La relación “es-un” (is-a) describe:**

[ ]A. Una relación de composición.

[ ]B. Una relación donde una clase contiene objetos de otra.

[X]C. Una relación de herencia.

[ ]D. Una clase abstracta.


**3. ¿Cuál palabra clave se usa para aplicar herencia en Java?**

[ ]A. implements

[ ]B. inherit

[ ]C.override

[X]D.extends


**4. ¿Para qué se usa ___super()___ en un constructor?**

[ ]A. Para llamar a otro constructor de la misma clase

[X]B. Para llamar al constructor de la clase padre

[ ]C. Para definir variables privadas

[ ]D. Para sobreescribir métodos


**5. ¿Cuál es la diferencia principal entre ___this___ y ___super___?**

[ ]A. ___this___ accede a métodos propios y ___super___ a atributos estáticos.

[ ]B. ___this___ hace referencia a la clase padre y ___super___ a la clase hija.

[x]C. ___this___ hace referencia al objeto actual y ___super___ a la clase padre.

[ ]D. No existe diferencia, son equivalentes.}


**6. ¿Cuál modificador de acceso permite herencia pero
evita el acceso directo desde otras clases fuera del paquete?**

[ ]A. private

[X]B. protected

[ ]C. public

[ ]D. default sin palabra clave


**7. ¿Qué elementos no se heredan en Java?**


[ ]A. Métodos públicos

[ ]B. Atributos protegidos

[X]C. Métodos privados

[ ]C. Métodos privados


**8. ¿Cuál de las siguientes afirmaciones sobre la clase ___Object___ es correcta?

[ ]A. Es opcional extenderla explícitamente

[X]B. Es la clase raíz de Java y todas heredan de ella

[ ]C. Solo las clases que usan ___extends Object___ la heredan

[ ]D. No contiene métodos útiles


**9. ¿Cuál es una desventaja común del uso excesivo de herencia?**

[X]A. Genera acoplamiento fuerte entre clases

[ ]B. Hace que el código sea menos legible

[ ]C. Reduce la reutilización de código

[ ]D. Evita el uso de polimorfismo



**10. ¿Qué principio indica que una subclase debe poder reemplazar a su superclase sin afectar el programa?**

[X] A. Principio de sustitución de Liskov

[ ]B. Principio de abstracción

[ ]C. Principio de responsabilidad única

[ ]D. Encapsulación



**11. Una clase puede heredar de múltiples clases en Java.**

___Falso___

(Java no permite herencia múltiple de clases, solo mediante interfaces).

**12. El método super() debe ser la primera línea en un constructor si se usa.**

___Verdadero___

**13. Las subclases pueden acceder a atributos privados de la superclase.**

___Falso___

(Solo mediante getters/setters o métodos públicos/protegidos).

**14. La herencia promueve la reutilización de código.**

___Verdadero___

**15. Un método de la clase padre siempre puede ser sobreescrito por la subclase.**

___Falso___

(Métodos ___final___ no pueden ser sobreescritos).


**1.2 Preguntas Conceptuales Escritas**


**1. Explique con sus propias palabras qué es la herencia y para qué sirve**

___RTA:___ Es un mecanismo de POO que permite que una clase pueda recibir o heredar
atributos y métodos de otra clase. Sirve para reutilizar código, crear jerarquías lógicas y evitar repetir información.


**2. ¿Cuál es la diferencia entre ___super()___ y ___super.metodo()___?**
___RTA:___ ___SUPER():___ Llamar al Constructor del Padre **Ejemplo:** inicializar los atributos heredados antes
de los propios.

___super.metodo():___ Se sobrescribe en un método, pero se quiere usar la funcionalidad original.

___En resumen:___
___super()___ → llama al constructor de la clase padre.
___super.metodo()___ → llama a un método de la clase padre.


**3. Dibuje un diagrama de jerarquía con 3 niveles y explique las relaciones**
___RTA:___

             Animal
                |
             Mamifero
                |
              Perro

**Relaciones:**

- **Mamífero** hereda de Animal: significa que un mamífero es un animal, por lo que recibe características
  generales como respirar o alimentarse.


- **Perro** hereda de Mamífero: un perro es un mamífero, así que también recibe características como
  amamantar a sus crías o tener sangre caliente.

- Perro también hereda indirectamente de Animal: por la cadena de herencia.


Esta estructura refleja cómo una clase más específica va heredando características de clases más generales.


**4. ¿Por qué los atributos privados no son accesibles en las subclases?**

___RTA:___ Los atributos privados ___(private)___ están diseñados para proteger la información interna de
una clase. El principio de encapsulación dice que cada clase debe controlar su propio estado y no permitir
que otras clases lo modifiquen directamente.

Por eso, las subclases no pueden acceder a los atributos privados del padre:
solo pueden hacerlo mediante métodos públicos o protegidos (getters/setters).

Esto evita errores, protege los datos y obliga a que el acceso sea controlado.


**5. Dé un ejemplo del mundo real de una relación “es-un” y modélela con herencia**

Ejemplo del mundo real: Una Moto es un Vehículo.

Modelo en herencia (Java):

```java
class Vehiculo {
    String marca;
    int año;

    void mover() {
        // Lógica para mover el vehículo
    }
}

class Moto extends Vehiculo {
    int numeroAsientos;

    void tocarBocina() {
        // Lógica para tocar la bocina
    }
}
```
___Explicación:___

- Moto hereda de Vehiculo porque una moto es un tipo de vehículo.

- La clase Moto obtiene los atributos marca, año y el método mover().

- Además, agrega atributos y métodos propios, como numeroAsientos y tocarBocina().