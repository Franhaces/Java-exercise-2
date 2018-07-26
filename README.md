# Práctica de funciones
Ejercicios Java 

## Objetivos


-	Modularizar correctamente los programas. 
-	Crear y utilizar funciones.
-	Depurar y comentar los programas.
-	Controlar y gestionar errores en Java.


#### Actividad 1
## *PRÁCTICA DE FUNCIONES*


##### **Crea los distintos .java dentro de un package de nombre actividad03. Comenta <br />  cada función indicando qué hacen y qué parámetros reciben y retornan (si reciben y <br />  retornan alguno)**


1. **Ejercicio01.java**: crea una función  int pideEntero (String pregunta)  que reciba un texto <br />  por parámetro. La función ha de mostrar el texto pasado como parámetro, pedir un <br />  número por consola (si el usuario no introduce un número se ha de volver a pedirlo <br />  repitiendo el proceso hasta que el usuario introduzca un valor numérico) y retornar el <br />  número introducido como un entero.

2. **Ejercicio01.java:** añade una función de nombre pideDouble, que retorne un número <br />  entero, reciba una String como parámetro  y con el funcionamiento parecido a la <br />  función  pideEntero() pero que en vez de retornar un entero retorne un double.

3. **Ejercicio01.java:** añade el código que muestre por consola un  menú con las siguientes <br />  opciones (y programa cada opción en una función aparte)  teniendo en cuenta que:
    * a. Se debe pedir al usuario el número de opción del menú a ejecutar mediante la   <b/ >  función pideEntero() creada anteriormente. 
    * b. Si se pide un double, se debe pedir mediante la función double pideDouble( <b/ >    String pregunta). <br/ >
    
    **Las opciones del menú serán**
   * 1.	Calcula el mayor de 3 números: debe llamar a una función que pida 3 números <b/ >   (del tipo double) al usuario y muestre cuál de ellos es el mayor.
   * 2.	Calcula el día de la semana: debe pedir un número de día al usuario y calcular el <b/ >   nombre del día de la semana correspondiente (1 lunes, 2 martes...)
   * 3.	Supera el 50: debe pedir un número del tipo double hasta que el usuario <b/ >   introduzca un valor superior a 50. En tal caso muestra un mensaje indicando los <b/ >   intentos realizados y el último valor indicado.
   * 4.	Salir: debe terminar el programa. Si el usuario selecciona cualquier otra opción, <b/ >   se debe realizar la opción seleccionada o mostrar un mensaje de error si la <b/ >   opción es incorrecta, y una vez finalizada la opción volver a mostrar el menú.
