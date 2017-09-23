# Práctica de Software Colaborativo
## Descripción del proyecto
Se parte de un proyecto ya desarrollado, y se pretende realizar una ampliación del mismo.

En la actualidad, el proyecto consta de cuatro clases:
* **Point**, maneja coordenadas de dos dimensiones, ofreciendo diversas funcionalidades
* **User**, almacena un identificador, el nombre y apellido, controlando el formato del mismo y mostrando diferentes representaciones
* **DecimalCollection**, maneja una colección de valores decimales de tipo double
* **Fraction**, maneja fracciones matemáticas

**Es responsabilidad del arquitecto realizar los test de cada clase en su versión inicial**

#### Las posibles ampliaciones podrían ser las siguientes:

##### Point
* Aumentar a una tercera coordenada
* Limitar los límites posibles: 0..100, -10..+10 ...
* Poder modificar las coordenadas

##### User
* Presentar el nombre en mayúsculas 
* Incluir métodos con otras formas de presentar el nombre completo
* Permitir nombres compuestos, separados por blancos y controlar las mayúsculas y minúsculas

##### DecimalCollection
* Incluir métodos como *menor*, *multiplicar*, *tamaño*, *media*...

##### Fraction
* Incluir métodos como *isPropia*, *isImpropia*. Las fracciones propias son aquellas cuyo numerador es menor que el denominador, y las fracciones impropias el resto
* Incluir el método *isEquivalente*. Dos fracciones son equivalentes cuando el producto de extremos es igual al producto de medios
* Incluir métodos para comparar fracciones: *mayor*, *menor*
* Incluir métodos para *sumar*, *restar*, *multiplicar* o *dividir* fracciones

Se pueden realizar otras, pero cuidado!!! es responsabilidad del `Arquitecto` finalizar la ampliación del proyecto **:-o**.

#### Features
Las mejoras se publicarán con un formato a elección del `Arquitecto`, y deberá describirlo en la Wiki. Deberán tener plazos temporales.

*No olvidéis, si con tanto cambio se produce* **descontrol y pánico!!!** *enfocar un* **commit estable**, *hacer* **reset** *mediante el menú contextual y marcar* **Hard**

## Pasos a seguir
### Fase 1. Integrantes de los proyectos
Sorteo para asignar a cada `Arquitecto` su equipo de tres `Programadores`. Incluir en la plataforma los datos menos el repositorio.

### Fase 2. Preparar proyecto en el repositorio
El `Arquitecto` deberá preparar el proyecto en su cuenta de GitHub.

1. Se llamará ***IWVG.SwC.Arquitecto***
1. Creará el proyecto en local y lo subirá a Git, no subir los ficheros de configuración de Eclipse!!!. En el primer commit incluir en el mensaje el nombre del arquitecto
1. Organizará la forma de gestionar el proyecto: creará etiquetas, establecerá el formato de las mejoras... 
1. Deberá añadir los test de cada clase y comprobar su buen funcionamiento
1. Actualizará el repositorio remoto
1. Configurará el proyecto para trabajar con Travis CI
1. Publicará en la plataforma de la ***moodle.upm*** los datos del proyecto, en el apartado GitHubs de la asignatura
1. Añadirá como colaboradores del proyecto a su la lista de `Programadores`


### Fase 3. Preparar proyectos en equipos locales
Los `Programadores` importarán este proyecto en sus equipos.

### Fase 4. Planificación de la ampliación por parte de Arquitecto
El `Arquitecto` establecerá **UNA** ampliación para las clases Point, User y DecimalCollection, y **TRES** ampliaciones para Fraction, una para cada `programador`. Cada ampliación de clase debe ir acompañada con sus ampliaciones de test y su explicación en la wiki.

### Fase 5. Crear tickets
1. El `Arquitecto` mandará `tickets` para implementar las mejoras. Procurará que sea equitativo el trabajo de los `programadores`
1. El `Programador` realizará los `tickets` con agilidad y corrección. Una vez que termine, deberá pasar los test, y si no hay errores, realizar la fusión con la rama `develop`. Finalmente cerrará el `ticket`

### Fase 6. Comprobación final del proyecto
1. El `Arquitecto` comprobará el buen funcionamiento de la ampliación. Si tuviera errores, creará nuevos tickets.
1. Finaliza la ampliación, creando una `release-1.0` para liberar.

## Evaluación
La nota que se obtiene en este ejercicio es de 7 puntos por el rol de `Arquitecto` y 3 puntos por el rol de `Programador`.
El `Arquitecto` deberá dar una nota entre 0..1 a cada uno de los programadores. Se indicará en la entrega de la práctica.
Se valorará el uso adecuado de las ramas, el uso de los tickets, de la wiki, la coordinación...

### Suerte chic@s!!!
