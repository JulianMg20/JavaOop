## ✅ Criterio 2: Contrato equals() y hashCode() (10 puntos)
***📝 Explicación del contrato entre equals() y hashCode()***

En Java, los métodos ___equals()___ y ___hashCode()___ forman un 
contrato obligatorio que asegura el funcionamiento correcto de colecciones 
como HashMap, HashSet y Hashtable.

## 🔥 Reglas del contrato

**1. Si dos objetos son iguales según ___equals()___, deben tener el mismo ___hashCode()___**

```java
if (a.equals(b)) {
    a.hashCode() == b.hashCode(); // siempre verdadero
}

```

**2. Si dos objetos tienen hashCode diferente, no pueden ser iguales**

Si los __hashCode__ son distintos, los objetos deben considerarse diferentes.

**3. Si dos objetos tienen el mismo hashCode, pueden o no ser iguales

Esto se conoce como colisión.
El método __equals()__ será quien determine si realmente son iguales.

**4. hashCode() debe ser consistente**

Mientras los atributos usados en __equals()__ no cambien, el resultado de __hashCode()__ no debe cambiar.

**5. equals() debe cumplir las propiedades:**

- Reflexivo: x.equals(x) es true

- Simétrico: si x.equals(y) → y.equals(x)

- Transitivo: si x.equals(y) y y.equals(z) → x.equals(z)

- Consistente: siempre devuelve el mismo valor mientras no cambien los datos

- Comparar con null debe devolver false

**⭐ Importancia del contrato**

Si este contrato no se respeta:

- Un HashSet puede insertar duplicados.

- Un HashMap no podrá encontrar claves que sí están almacenadas.

- Aumentan las colisiones y baja el rendimiento en estructuras hash.

```java
public class Persona {
    private String nombre;
    private int edad;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona p = (Persona) o;
        return edad == p.edad && nombre.equals(p.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
```
**Pregunta:**

¿Qué ocurre si dos objetos son iguales según equals(), pero tienen hashCodes diferentes?

**Respuesta:**

Se viola el contrato entre equals() y hashCode().
Como consecuencia, estructuras como HashSet o HashMap no 
podrán identificar correctamente el objeto, causando duplicados o fallos al buscar claves existentes.