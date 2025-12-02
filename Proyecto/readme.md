## Actividad 1: Identificación de Objetos (Ejercicio 01)
Identifica **5 objetos principales** que existen en una escuela de música

* __Objeto: Instrumento Musical.__
    - __¿Qué es?:__ Un instrumento utilizado en las clases de música
    - __Características:__ nombre, tipo (cuerda, viento, percusión), marca, estado, número de serie.
    - __Comportamientos:__ registrar instrumento, verificar disponibilidad, asignar a estudiante.

* __Objeto: Aula o salon.__
    - __¿Que es?:__ Espacio o ámbito educativo para referirse específicamente a un espacio donde se imparten clases.
    - __Caracteristicas:__ Espacio iluminado , un tablero,disposición de  sillas o pupitres.
    - __Comportamientos:__ Estado limpio, espacio seguro, disponbiblidad.

* __Objeto: Profesor o maestro.__
    - __¿Que es?:__ Persona que enseña materias y proporcina herramientas necesarias para comprender la infomacion que se le este compartiendo.
    - __Características:__ nombre, identficacion, especilizacion, experiencia.
    - __Comportamientos:__ Evaluar, planificar actividades, tomar asistencia.

* __Objeto: Alumno o estudiante.__
    - __¿Que es?:__ Persona a la cual se la una actividad para que adquira unas instrusiones de manera sistemtica.
    - __Caracteristcas:__ Aprender, dedicacion y esfuerzo, pensamientos criticos y estratigicos.
    - __comportamientos:__ Puntualidad y responsabilidad, compromiso, practicar las actividades, presentar actividades o evaluciones.

* __Objeto: Actividades o clases.__
    - __¿Que es?:__ Una acción o conjunto de tareas que una persona realiza en que una clase es una leccion
    - __Caracteristcas:__ Conexcion con el conocimiento, planificar los objetivos, motivacion para los estudiantes.
    - __comportamientos:__ Inicio de las actividades, finalizacion de la actividad, resgistro de ellas misma, tareas de ellas misma.

* __Objeto: Programa Academico.__
    - __¿Que es?:__ Plan de estudio estructurado que organiza las asignaturas, contenidos, competencias y metodologías para formar a un estudiant
    - __Caracteristcas:__ Objetivos, contenidos, metodología de enseñanza, evaluación y recursos didácticos.
    - __comportamientos:__ Duracion, modulos o niveles, asignaturas, lecciones.


## Actividad 2: Comparación de Paradigmas (Ejercicio 02)

**- Investiga las diferencias entre programación estructurada y POO**

|  Programación Estructurada  |      Poo      |
| -------------              |:-------------:|
| Trata los datos como objetos con atributos y métodos            | Es un tipo de programación imperativa    |
|Suele constar de módulos bien estructurados y separados                 |Al aplicarse a los objetos estos también pueden ser heredados por otros objetos.     |
| Los programas se dividen en pequeños programas o funciones                 | Los programas se dividen en objetos o entidades.      |
| Su objetivo principal es mejorar y aumentar la calidad, la claridad y el tiempo de desarrollo de los programas informáticos.    | Su objetivo principal es mejorar y aumentar tanto la calidad como la productividad del análisis y diseño de sistemas.     |
| Da más importancia al código. | Da más importancia a los datos.    |
| Es un subconjunto de la programación procedimental.      | Se basa en el concepto de objetos que contienen datos y código.     |

**- Escribe un ejemplo conceptual de cómo se manejaría la información de un instrumento musical en:**

1. **Programación estructurada** (usando variables sueltas y funciones)
     ```java
    // Variables sueltas
    String name = "Guitarra Acústica";
    String type = "Cuerda";
    String brand = "Yamaha";

    // Función suelta
    void showInfo() {
    System.out.println("Instrumento: " + name);
    System.out.println("Tipo: " + type);
    System.out.println("Marca: " + brand);
    }```

2. **Programación orientada a objetos** (usando una clase)

   ```java
   public class MusicalInstrument {
       String name ;
       String type ;
       String brand ;
   }

   public MusicalInstrument(String name, String type, String brand) {
       this.name = Guitarra;
       this.type = Cuerda;
       this.brand = fender;
   }

   public void showInfo() {
       System.out.println("Instrumento: " + name);
       System.out.println("Tipo: " + type);
       System.out.println("Marca: " + brand);
   } 
   ```