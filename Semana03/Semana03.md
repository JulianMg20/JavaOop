## 1.1 Preguntas Escritas sobre

***Evaluación escrita con preguntas conceptuales***

**1. Clases y Objetos**

- Explique la diferencia entre una clase y una instancia.


- ¿Por qué se dice que los objetos representan entidades del mundo real?


- ¿Qué sucede en memoria cuando se crea un objeto con ___new___?


**2. Encapsulación**

- ¿Qué problema resuelve la encapsulación dentro del diseño de software?


- ¿Qué riesgos existen si se exponen atributos públicos sin control?

**3. Herencia**

- Defina qué es la herencia y mencione una ventaja y una desventaja de usarla.


- ¿Qué significa que una clase sea "superclase" y otra "subclase"?


- ¿Por qué se recomienda evitar la herencia múltiple en algunos lenguajes?


**4. Polimorfismo**

- Explique qué es el polimorfismo y dé un ejemplo conceptual.


- ¿Por qué el polimorfismo facilita la extensibilidad del código?


**5. Abstracción**

- ¿Qué es la abstracción y cómo se aplica al diseño de clases?


- Explique la diferencia entre una clase abstracta y una interfaz.

**6. Modificadores de acceso**

- ¿Por qué es útil el modificador ___private___ en atributos?

- Dé un caso práctico donde el modificador ___protected___ es necesario.


***1.2 Cuestionario sobre Buenas Prácticas***

**1. ¿Cuál es la visibilidad recomendada para los atributos de una clase según buenas prácticas de encapsulación?**

a) public

***b) private***

c) protected

d) default

**2. ¿Por qué es una mala práctica declarar atributos como public?**

a) Ocupa más memoria

b) Impide crear objetos

***c) Permite modificar el estado del objeto sin control***

d) No permite usar métodos

**3. ¿Cuál es la forma correcta de nombrar un getter para un atributo llamado edad?**

a) getedad()

b) obtenerEdad()

***c) getEdad()***

d) edad()

**4. ¿Cuál es la forma correcta de nombrar un setter para el atributo nombre?**

a) nombre()

b) setnombre()

***c) setNombre()***

d) establecerNombre()

**5. ¿Cuál es la finalidad principal de los setters?**

a) Crear nuevos objetos

b) Cambiar visibilidad del atributo

***c) Modificar atributos con posible validación***

d) Convertir tipos de datos

**6. ¿En qué caso es NECESARIO usar la palabra clave this?**

a) Cuando el método es estático

***b) Cuando un parámetro tiene el mismo nombre que un atributo***

c) Siempre que se accede a un atributo

d) En métodos privados

**7. ¿Para qué sirve el método this() dentro de un constructor?**

***a) Llamar a otro constructor de la misma clase***

b) Llamar a un constructor de otra clase

c) Hacer referencia al objeto actual

d) Destruir el objeto

**8. ¿Qué buena práctica debe seguir un setter al modificar un atributo?**

a) Modificar el atributo sin condiciones

b) Imprimir un mensaje en consola

***c) Validar el valor antes de asignarlo***

d) Convertir el atributo en público

**9. ¿Cuál es un ejemplo correcto de validación en un setter?**

a) if (valor < 0) this.valor = valor;

b) this.valor = valor;

***c) if (valor >= 0) this.valor = valor;***

d) return valor;

**10. ¿Qué describe mejor el objetivo de la encapsulación?**

a) Ocultar métodos innecesarios

***b) Proteger los datos y controlar su acceso***

c) Crear objetos más rápidos

d) Usar menos memoria