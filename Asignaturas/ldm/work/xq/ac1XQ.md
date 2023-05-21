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

Código:

````xquery
<bailes> {
for $x in /bailes/baile
return
  <baile>
        {$x/profesor}
        {$x/nombre}
  </baile>     
}
</bailes>
````

Output:

![[Pasted image 20230517100845.png]]

````xml
<bailes>
    <baile>
        <profesor xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Roberto Garcia</profesor>
        <nombre xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Tango </nombre>
    </baile>
    <baile>
        <profesor xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Miriam Gutiérreza</profesor>
        <nombre xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Cha-cha-cha </nombre>
    </baile>
    <baile>
        <profesor xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Laura Mendiola</profesor>
        <nombre xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Rock </nombre>
    </baile>
    <baile>
        <profesor xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Jesús Lozano</profesor>
        <nombre xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Merengue </nombre>
    </baile>
    <baile>
        <profesor xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Jesús Lozano</profesor>
        <nombre xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Salsa </nombre>
    </baile>
    <baile>
        <profesor xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Miriam Gutierrez</profesor>
        <nombre xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">Pasodoble </nombre>
    </baile>
</bailes>
````

**e) Haz un listado ordenado por nombre de los bailes.**

Código:

````xquery
for $x in /bailes/baile
order by $x/nombre
return concat("- ", $x/nombre)
````

Output:

![[Pasted image 20230517101605.png]]

**f) Listado ordenado por nombre de los bailes que se paguen en euros.**

Código:

````xquery
for $x in /bailes/baile
order by $x/nombre
where $x/precio/@moneda = 'euro'
return concat("- ", $x/nombre)
````

Output:

![[Pasted image 20230517101847.png]]

**g) Bailes que tengan menos de 20 plazas y se paguen en dólares.**

Código:

````xquery
for $x in /bailes/baile
order by $x/nombre
where $x/precio/@moneda = 'dolares' and $x/plazas < 20
return concat("- ", $x/nombre)
````

Output:

![[Pasted image 20230517102120.png]]

**h) Insertar un nodo baile (id: 7, nombre: Reggaeton, cuota: mensual, moneda: euro, precio: 82, plazas:9, comienzo: 09/06/2012, professor: Esteban Quito i sala:1)**

Código:

````xquery
insert node
<baile id="7">
<nombre>Reggaeton</nombre>
 <precio cuota="mensual" moneda="euro">82</precio>
 <plazas>9</plazas>
 <comienzo>9/06/2012</comienzo>
 <profesor>Esteban Quito</profesor>
 <sala>1</sala>
</baile>
  into /bailes
````

Output:

![[Pasted image 20230517144711.png]]

**i) Modificar el precio del nuevo nodo a 96 euros.**

Código:

````xquery
for $x in /bailes/baile[@id=7]
return replace value of node $x/precio with 96
````

Output:

![[Pasted image 20230517230620.png]]

**j) Eliminar el nodo creado a partir de su identificador.**

Código:

````xquery
delete node /bailes/baile[@id=7]
````

Output:

![[Pasted image 20230517230641.png]]

4. **Realizar la consulta XQuery cuyo resultado sea una tabla HTML que nos muestre el nombre del baile, el profesor que lo imparte y número de plazas ofertadas.**

Código:

````xquery
<body>
  <h1>Bailes ofertados</h1>
  <table border="1">
  <tr>
    <th>Nombre baile</th>
    <th>Nombre profesor</th>
    <th>Plazas ofertadas</th>
  </tr>
  <tr>
  {
    for $x in /bailes/baile
    return
    <tr>
      <td>{$x/nombre}</td>
      <td>{$x/profesor}</td>
      <td>{$x/plazas}</td>
    </tr>
  }
  </tr>
  </table>
</body>
````

Output:

![[Pasted image 20230517231240.png]]




