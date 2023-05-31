tags:: #repaso_examen #lenguaje_de_marcas #xq

# Repaso Examen Lenguaje de Marcas

## X Path

Tabla para el filtraje de datos:

| Formato normal      | Formato abreviado                                              |
| ------------------- | -------------------------------------------------------------- |
| Child::             | -                                                              |
| Atributo::          | @ (por si queremos filtrar "x" que tengan el atributo..) |
| Self-node::         | .                                                              |
| Parent-node::       | ..                                                             |
| Descendiente        | // (recorrerá hasta que se encuentre `x`)                                                             |
| [position()=numero] | [numero]                                                       |

## Ejemplos XQ de la presentación.

1. Seleccionar todos los discos con un precio menor de 10 euros de la colección de discos almacenadas en el documentos XML llamado `ejemplo3.xml`

Archivo `xml`:

````xml
<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet type="text/xsl" href="ejemplo3.xsl"?>
<coleccion>
	<cd>
		<titulo> Motomami </titulo>
		<artista> Rosalia </artista>
		<precio> 10.90 </precio>
	</cd>
	...
</coleccion>
````

Consulta XQuery:

````xquery
for $x in doc('ejemplo3.xml')/coleccion/cd
where $x/precio < 10
return $x/titulo
````

- el `for` recorre todos los elementos `cd`.
- el `$x` es donde se guardara cada `cd` seleccionado
- el `where $x/precio < 10` sirve para seleccionar solo los que cumplan el requisito
- el `return` retorna el valor que queremos obtener.

## Diferencia entre `for` y `let`.

El `for` lo utilizaremos para obtener un nodo completo. En cambio, el `let` lo utilizaremos para obtener una especia de archivo.xml. Se ve claro con los ejemplos de abajo.

Ejemplo con `for`:

````xquery
for $x in doc('ejemplo3.xml')/coleccion/cd/titulo
return
<titulos> {$x} </titulos>
````

Output:

````shell
<titulos><titulo>Motomami</titulo></titulos>
<titulos><titulo>Un Verano Sin Ti</titulo></titulos>
<titulos><titulo>La Sobremesa</titulo></titulos>
````

Ejemplo con el `let`:

````xquery
let $x := doc('ejemplo3.xml')/coleccion/cd/titulo
return
<titulos>{$x}</titulos>
````

Output:

````xml
<titulos>
	<titulo>Motomami</titulo>
	<titulo>Un Verano Sin Ti</titulo>
	<titulo>La Sobremesa</titulo>
</titulos>
````

## Ejemplos útiles de las actividades

Para filtrar por atributo:

````xquery
for $x at $pos in /bailes/baile
where $x/precio/[@cuota] = "mensual"
return concat("",$x/profesor)
````

Para retornar una lista de profesores con su baile:

````xquery
for $x at $pos in /bailes/baile
return concat($pos,". ","Profesor: ", $x/profesor, ", Baile: ", $x/nombre)
````

Retornar lista de profesores y bailes en formato XML:

````xquery
<profesores_y_Bailes>
{
 for $x in /bailes/baile
 return
 <baile>
   <nombre>{$x/nombre/text()}</nombre>
   <profesor>{$x/profesor/text()}</profesor>
 </baile> 
}
</profesores_y_Bailes>
````

Ordenar by  en xquery:

````xquery
for $x in /bailes/baile
order by $x/nombre
return $x/nombre
````

Ordenar pero con un `where` de moneda:

````xquery
for $x in /bailes/baile
order by $x/nombre
where $x/precio/[@moneda] = 'euro'
return $x/nombre
````

