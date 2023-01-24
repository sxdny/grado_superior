
> Abajo el video de BroCode para seguir tomando apuntes:

[MySQL Full Course 🗄️ (2023)](https://www.youtube.com/watch?v=5OdVJbNCSso&ab_channel=BroCode)

# Comandos básicos.

## CREATE DATABASE. Creación de una base de datos.

Comandos que usaremos para crear o borrar bases de datos.

```sql
CREATE DATABASE database_name;
// Para CREAR una base de datos.

DROP DATABASE database_name;
// Para BORRAR una base de datos.
```

## CREATE TABLE. Crear tablas.

Comandos que usaremos para **crear** tablas, **borrar** tablas o ****************alterar**************** los valores dentro de esta tabla:

```sql
// Para crear una tabla:
CREATE TABLE table_name (
		column1 DATATYPE,
		column2 DATATYPE,
		column3 DATATYPE
);
// La última columna de la tabla SIEMPRE va sin coma al final.

// Para renombrar una tabla:
RENAME TABLE table_name TO newTable_name;

// Para borrar una tabla:
DROP TABLE table_name;
```

```sql
// Para añadir, borra o alterar columnas de nuestra tabla usamos ALTER TABLE.
// Podemos usar este comando para varias cosas.

// Para añadir columnas a una tabla:
ALTER TABLE table_name
ADD newColumn DATATYPE;

// Para borrar columnas de una tabla:
ALTER TABLE table_name
DROP COLUMN column_name;

// Para alterar el nombre de una columna:
ALTER TABLE table_name
RENAME COLUMN column_name TO newColumn_name;

// Para alterar el tipo de dato de una columna:
ALTER TABLE table_name
ALTER COLUMN column_name NEWDATATYPE;
```

## INSERT INTO. Insertar información en una tabla.

Para insertar información dentro de una tabla usaremos el comando **********************INSERT INTO**********************.

```sql
// Para insertar información:

// Insertar información en columnas especificadas:
INSERT INTO table_name
	(column1, column2, column3)
VALUES
	(value1, value2, value3);
// Para insertar correctamente la información, tanto las columnas como los valores
// deben estar alineados.

// Insertar información en TODAS las columnas:
INSERT INTO table_name
VALUES (value1, value2, value3, ...);
```

## SELECT. Consultar información de una tabla.

Para consultar o seleccionar información de una tabla, usaremos el comando **********SELECT.**********

```sql
// Para consultar información específica de una tabla:
SELECT column1, column2, ...
FROM table_name;

// Para consultar TODA la información de una tabla:
SELECT * FROM table_name;

// Para consultar información que NO SE REPITA:
SELECT DISTINCT column_name FROM table_name
```

### SELECT: WHERE. Condiciones.

También podemos consultar solo la información que cumpla con unas condiciones, usando **********WHERE**********.

```sql
// Esta es la sintáxis principal:
SELECT column1, column2, ...
FROM table_name
WHERE condition;

// Si queremos seleccionar todaslas tablas donde el pais sea "España":
SELECT * FROM country
WHERE country_name = "España";

// Si queremos seleccionar a todas las personas que tengan una edad de 20 años:
SELECT * FROM people
WHERE age = 20;

// Podemos usar varios operadores en el WHERE. Aquí van todos:

// 1. IGUAL.
WHERE country_name = "España";
// 2. MAYOR QUE.
WHERE age > 20
// 3. MENOR QUE.
WHERE age < 18;;
// 4. MAYOR O IGUAL QUE.
WHERE age >= 20
// 5. MENOR O IGUAL QUE.
WHERE age <= 17;;
// 6. NO IGUAL.
WHERE country_name <> "Argentina";
o
WHERE country_name != "Argentina";
// 7. ENTRE.
WHERE age BETWEEN 20 AND 50;

// También podemos usar los operados AND, OR y NOT de varias maneras:

// Por ejemplo para seleccionar columnas que cumplan 2 condiciones.
SELECT column1, column2, ...
FROM table_name
WHERE condition1 AND condition2;

// Para seleccionar columnas que cumpla almenos 1 de estas condiciones:
SELECT column1, column2, ...
FROM table_name
WHERE condition1 OR condition2;

// Para seleccionar columnas que NO cumplan una condicion:
SELECT column1, column2, ...
FROM table_name
WHERE NOT condition1;

SELECT column1, column2, ...
FROM table_name
WHERE NOT condition1 AND NOT condition2;
```

### SELECT: AS, SUBQUERY Y Count().

Podemos **contar la información y “guardarla” en una “nueva tabla”**. Por ejemplo. digamos que queremos contar cuantos países hay en total en nuestra tabla. Usaremos los siguientes comandos:

```sql
SELECT Count(*) AS DistinctCountries
FROM (SELECT DISTINCT Country FROM Customers);
```

Fijémonos primero en la ******************subquery****************** que hay después del FROM. Lo que estamos haciendo es seleccionar los diferentes paéses que hay en la tabla de *Customers*. Una vez tenemos esa información, usamos el ****************************SELECT Count(*)**************************** para contar cuantos hay y así mostrar la información obtenida en una ****************************tabla temporal**************************** llamada ************************DistinctCountries************************.

### SELECT: ORDER BY. Ordenar el resultado.

Podemos usar el **********************ORDER BY********************** para ordenar el resultado de la información que solicitamos. Los podemos hacer de forma **********************ascendente********************** y **********************descendente:**********************

```sql
// Sintáxis principal:
SELECT column1, column2, ...
FROM table_name
ORDER BY column1, column2, ... ASC | DESC;

// Un ejemplo si queremos ordenar solo una columna:
SELECT * FROM Customers
ORDER BY Country;

// Por defecto se ordenará de forma ASCENDENTE, pero eso lo podemos cambiar:
SELECT * FROM Customers
ORDER BY Country DESC;

// También podemos ordenar por varias columnas:
SELECT * FROM Customers
ORDER BY Country, CustomerName;

// Y podemos hacer que cada columna se ordene de forma diferente:
SELECT * FROM Customers
ORDER BY Country ASC, CustomerName DESC;
```

### SELECT: DISTINCT. Obtener resultados diferentes.

Usaremos el ****************DISTINCT**************** para evitar valores repetidos al realizar una consulta a la base de datos.

```sql
// Sintáxis principal:
SELECT DISTINCT column1, column2, ...
FROM table_name;
```

### SELECT: Funciones.

### SELECT: LIMIT. Limitar el contenido que vamos a obtener.

Usaremos el LIMIT para limitar cuanto contenido queremos obtener al hacer una consulta.

```sql
// Sintáxis principal:
SELECT column_name(s)
FROM table_name
WHERE condition
LIMIT number;
```

## NULL VALUES. Como operar con ellos.

Una celda que contenga un valor ********NULL********, no existe nada. Para operar con ellos no podremos usar operadores sino que usaremos los siguientes términos:

```sql
// Sintáxis principal.
SELECT column_names
FROM table_name
WHERE column_name IS NULL | IS NOT NULL;

// Por ejemplo, si queremos seleccionar todas las celdas de una tabla
// donde x columna no sea NULL:
SELECT * FROM table_name
WHERE column1 IS NOT NULL;
```

## UPDATE. Modificar contenido existente de una tabla.

```sql
// Sintáxis principal:
UPDATE table_name
SET column1 = value1, column2 = value2, ...
WHERE condition;

// !¡!¡ El WHERE es importante porque sino cambiaremos todas las celdas !¡!¡
```

## DELETE. Borra contenido existente de una tabla.

```sql
// Sintáxis principal:
DELETE FROM table_name WHERE condition;

// !¡!¡ El WHERE es importante porque sino borraremos el contenido
// de todas las celdas !¡!¡
```

## INSERT INTO. Introducir información dentro de la tabla.

Con el comando INSERT INTO podemos introducir información / registros dentro de nuestra tabla de la base de datos:

```sql
// Sintáxis principal:

// En columnas específicas:
INSERT INTO table_name
	(column1, column2, column3, ...)
VALUES
	(value1, value2, value3, ...);

// En todas las columnas:
INSERT INTO table_name
VALUES (value1, value2, value3, ...);
```