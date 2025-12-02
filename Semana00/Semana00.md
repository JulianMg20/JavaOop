## Semana 00: Fundamentos de Java
- [Cuestionario 1: Introducción a Java](#cuestionario-1-introducción-a-java)
- [Cuestionario 2: Tipos de Datos y Operadores](#cuestionario-2-tipos-de-datos-y-operadores)
- [Evaluación Escrita: Estructuras de Control](#evaluación-escrita-estructuras-de-control)


## Cuestionario 1: Introducción a Java 
***
**Historia de Java:**  Java nació en 1991 en Sun Microsystems dentro de un proyecto llamado Green Project.
El objetivo inicial era crear un lenguaje para dispositivos electrónicos (televisores, decodificadores, electrodomésticos). El creador principal fue James Gosling, junto con Mike Sheridan y Patrick Naughton.

**Evolución y versiones principales:** Java ha tenido muchas versiones, pero estas son las más históricas o relevantes:

#### Java 1.0 (1996)
Primera versión pública. Introdujo:
* Sintaxis similar a C++
* Applets para páginas web
* Portabilidad total gracias a la JVM

#### Java 1.2 (1998) – Java 2
Revolución del lenguaje. Se reorganiza la plataforma en:
* J2SE (Standard Edition)
* J2EE (Enterprise Edition)
* J2ME (Micro Edition)

#### Java 5 (2004)
Una de las mayores actualizaciones:
* Generics
* For-each
* Autoboxing
* Anotaciones
* Enumeraciones

#### Java 6 (2006)
Mejoras de rendimiento y compatibilidad con scripting (JSR 223).

#### Java 7 (2011)
Añadió:

* try-with-resources
* Nuevas APIs para manejo de archivos (NIO.2)

#### Java 8 (2014) – Versión más influyente
Introdujo:

* Expresiones Lambda
* Streams
* API de fecha y hora moderna (java.time)
* Métodos por defecto en interfaces

#### Java 9 (2017)
Principales cambios:
* Sistema de módulos (Project Jigsaw)
* Mejoras en la JVM

#### Java 11 (2018)
Primera versión LTS moderna.
Incluyó:

* Nuevo HttpClient
* Eliminación de JavaFX del JDK
* String API mejorada

#### Java 17 (2021) – LTS actual muy adoptado  
Añade:

* pattern matching
* sealed classes
* mejoras en rendimiento y GC

#### Java 21 (2023) – Última versión LTS
Incluye:
* Virtual Threads (Project Loom)
* Pattern Matching avanzado
* Sequenced Collections

**Características:**  Orientada Objetos, portable, seguro, multihilo, GC, amplio API.


**JDK,JRE,JVM** 
#### ¿Qué JDK es?
El kit de desarrollo para crear programas en Java.

* Función principal: 

Permitir desarrollar, compilar, ejecutar y depurar aplicaciones Java.

#### ¿Qué JRE es?
El entorno de ejecución de Java, todo lo necesario para correr programas Java.

* Función principal
Proporcionar el entorno donde los programas ya compilados pueden ejecutarse.

#### ¿Qué JVM es?
Es la Máquina Virtual de Java, un programa que ejecuta el bytecode generado por el compilador de Java.

* Función principal
Ejecutar programas Java.
Convertir el bytecode en instrucciones para el sistema operativo real.

| Componente | Contiene           | Función                  | ¿Para quién es?        |
|------------|---------------------|---------------------------|-------------------------|
| JVM        | Máquina virtual     | Ejecutar bytecode         | Cualquier ejecución Java |
| JRE        | JVM + librerías     | Correr programas          | Usuarios finales        |
| JDK        | JRE + herramientas  | Desarrollar y compilar    | Programadores           |



**Sintaxis básica**
- Existe las siguientes sintaxis como los comentarios, importación, definición clases, métodos, variables y tipos de datos.
```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }
}
```
## Cuestionario 2: Tipos de Datos y Operadores.

**Tipos primitivos**

| Tipo    | Tamaño   | Rango                                   |
|---------|----------|------------------------------------------|
| byte    | 8 bits   | -128 a 127                               |
| short   | 16 bits  | -32768 a 32767                           |
| int     | 32 bits  | −2,147,483,648 a 2,147,483,647           |
| long    | 64 bits  | −9.22e18 a 9.22e18 aprox.                |
| float   | 32 bits  | IEEE 754 (6–7 dígitos)                   |
| double  | 64 bits  | IEEE 754 (15–16 dígitos)                 |
| char    | 16 bits  | 0 a 65535 (Unicode)                      |
| boolean | —        | true / false                             |

* Que es byte: Guarda números enteros, sin decimales.
* Que es short:Entero (sin decimales)
* Que es int: int es el tipo de dato entero más usado en Java. Sirve para almacenar números enteros que no llevan decimales.
* Que es Long :Long es un tipo de dato primitivo en Java que permite almacenar números enteros muy grandes, más grandes que los que soporta int.
* Que es float:Es un tipo de dato primitivo en Java que sirve para almacenar números decimales, pero con una precisión limitada.
* Que es double:Es un tipo de dato primitivo en Java que se usa para almacenar números decimales con mucha más precisión que float.
* Que es char: Es un tipo de dato primitivo en Java que sirve para almacenar un solo carácter.
* Que es boolean: Es un tipo de dato primitivo en Java que se utiliza para representar valores lógicos, es decir, solo puede tener dos posibles valores.


**Operadores Aritmeticos**

| Operador | Nombre             | Ejemplo  | Resultado |
|----------|--------------------|----------|-----------|
| +        | Suma               | 5 + 3    | 8         |
| -        | Resta              | 10 - 4   | 6         |
| *        | Multiplicación     | 6 * 2    | 12        |
| /        | División           | 9 / 2    | 4 (int)   |
| %        | Módulo             | 10 % 3   | 1         |

**Operadores de Asignacion**

| Operador | Significado          | Equivalente        |
|----------|-----------------------|---------------------|
| =        | Asignación            | a = b               |
| +=       | Suma y asigna         | a += b  → a = a + b |
| -=       | Resta y asigna        | a -= b              |
| *=       | Multiplica y asigna   | a *= b              |
| /=       | Divide y asigna       | a /= b              |
| %=       | Módulo y asigna       | a %= b              |

**Operadores Lógicos**

| Operador | Nombre | Ejemplo           | Resultado |
|----------|--------|-------------------|-----------|
| &&       | AND    | true && false     | false     |
| \|\|     | OR     | true || false     | true      |
| !        | NOT    | !true             | false     |

**Operadores Relacionales**

| Operador | Significado      | Ejemplo |
|----------|-------------------|---------|
| ==       | Igual             | a == b  |
| !=       | Diferente         | a != b  |
| >        | Mayor que         | a > b   |
| <        | Menor que         | a < b   |
| >=       | Mayor o igual     | a >= b  |
| <=       | Menor o igual     | a <= b  |


**Casting:** Casting es el proceso de convertir un tipo de dato en otro.
En Java existen dos tipos de conversiones:

- Conversión Implícita: Java la hace automáticamente cuando conviertes un tipo pequeño a uno más grande.
> No hay pérdida de información.

> No necesitas escribir nada especial

- Conversión Explícita: La hace el programador manualmente, porque existe riesgo de pérdida de datos.
>Se usa cuando conviertes un tipo grande a uno más pequeño.

>Requiere escribir el tipo entre paréntesis.