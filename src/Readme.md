Práctica 1
-
----
Este programa en Java te permite contar cuántas veces una letra específica, introducida por el usuario, aparece en un 
texto proporcionado. Esto se realiza mediante Procesos

La clase CharCounter es la encargada de contar el número de letras, que
recibe mediante los argumentos, hay en el texto, que tambien recibe mediante los
argumentos.

Mediante ProcessLauncher ejecutamos la clase CharCounter,con argumentos
que le pasamos en Main al llamar a initVowelCounter.

En Utils tenemos dos métodos, el primero para que lea el texto línea
a línea y las guarde en un array hasta que no haya más texto. Y el segundo
se encarga de leer los archivos creados con la cantidad de letras escritos
y los devuelve en forma de entero.

Y Main, pregunta al usuario que letra quiere contar en el texto lore_ipsum,
 haciendo uso de las anteriores clases y sus métodos, le muestra al usuario
la cantidad de las letras que el ususario introdujo existen en el texto.