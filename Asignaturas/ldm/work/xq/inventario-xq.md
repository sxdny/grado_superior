tags:: #lenguaje_de_marcas #xq #inventario

# Inventario XQ

Recorrer un nodo que le especifiquemos dentro de la base de datos.

````xquery
for $x in base_de_datos
````

Ordena por x:

````xquery
order by nodo
````

Selecciona un atributo

````xquery
nodo/[@atributo]
---
nodo/@atributo
````

Para hacer algo dentro de un XML o de un HTML:

````xquery
<elemento>
{
	algo que queremos hacer
}
</elemento
````

Para meter todo dentro de una etiqueta xml:

````xquery
let := x ...
return
<etiqueta> ... </etiqueta>
````

Para insertar dentro de la base de datos:

````xquery
insert node
...
into ubicacion
````

Cambiar valor de un elemento de dentro de la base de datos:

````xquery
replace value of node ... with
````

Borrar un elemento de dentro de la base de datos:

````xquery
delete node ...
````

Podemos usar la función `/text()` para que nos devuelva el texto de dentro de una etiqueta.

````xquery
$x/text()
````

Buscar algo que contiene `x`:

````xquery
contains(nodo, lo que tiene que contener)
````

