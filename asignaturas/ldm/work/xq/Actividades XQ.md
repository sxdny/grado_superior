# Actividad 1 - XQuery

Sidney Sliva 1º DAW

1. **Preparar el entorno para hacer el ejercicio. Una vez instalado el programa BaseX, debéis copiar el archivo BDbaile.xml en la carpeta raíz de BaseX.**

![[Pasted image 20230510205844.png]]
*Archivo en el directorio raíz del BaseX.*

2. **Cread una nueva BD a partir de BDbailes.xml**

![[Pasted image 20230510205734.png]]

![[Pasted image 20230510205748.png]]
*Base de datos importada.*

3. **Realizar las siguientes consultas, por cada consulta debéis pegar una captura de la sentencia y del resultado.**

**a) Bailes que se realizan en la sala número 1. Hazlo para que el resultado aparezca con las etiquetas XML y otra vez con forma de listado.**

###### Con las etiquetas XML.

Código:

````xquery
for $x in /bailes/baile
where $x/sala = 1
return $x/nombre
````

Output:

![[Pasted image 20230510211108.png]]

###### Sin etiquetas XML (forma de listado)

Código:

````xquery
for $x at $pos in /bailes/baile
where $x/sala = 1
return concat($pos,". ", $x/nombre)
````

Output:

![[Pasted image 20230512140432.png]]

**b) Indicar los bailes que se imparten en la sala 2, cuyo precio sea menor a 35 euros y se pague en dólares.**

Código:

````xquery
for $x in /bailes/baile
where $x/sala = 2 and $x/precio < 35 and $x/precio/@moneda='dolares'
return concat("Nombre del baile: ", $x/nombre)
````

Output:

![[Pasted image 20230512141254.png]]

**c) Nombre de los profesores que dan clase con cuotas mensuales.**

Código:

````xquery
for $x in /bailes/baile
where $x/precio/@cuota='mensual'
return concat("Profesor: ", $x/profesor)
````

Output:

![[Pasted image 20230512141634.png]]

**d) Haz un listado de cada profesor con su baile, en formato listado y
formato XML**

