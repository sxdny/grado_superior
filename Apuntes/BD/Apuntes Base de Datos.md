[Enlaçe a Repasomenorca.](https://repasomenorca.es/)

+ **FUNCTIONS.** age()
+ **PROCEDURES.**castingActors().
+ **TABLES**. casting and acting tables.
+ **VIEWS.** 

````sql
SELECT * FROM actors
WHERE actor_weight = var_character_weight
AND age(actor_birthdate) = var_character_age;

--

SELECT *
FROM actors_view
WHERE actor_weight = var_character_weight
AND actor_age = var_character_age;

-- TRIGGERS

DROP TRIGGER IF EXISTS tr_ins_char;
DROP TRIGGER IF EXISTS tr_up_char;

CREATE TRIGGER tr_inr_char
BEFORE INSERT ON characters
FOR EACH ROW -- for multiple rows
-- code that we want to run
SET NEW.character_name = UPPER(NEW.character_name); -- new data that is going to be inserted

-- OLD the old data of the table.

CREATE TRIGGER tr_up_char
BEFORE UPDATE ON characters
FOR EACH ROW
SET NEW.character_name = LOW / LOWER(NEW.character_name);

-- WHEN DELETING, the NEW.x is NOT AVAILABLE, only the OLD one.
-- WHEN UPDATING, both NEW.x and OLD.x are available.
-- WHEN INSERTING, only NEW.x is available, because there's no OLD data.
````

## 📋 Create these two tables on the Procedure:

### Casting table.

Casting trigger:

````sql
CREATE TRIGGER tr_inr_ishired
AFTER UPDATE ON casting
FOR EACH ROW
--
IF NEW.is_hired = 1 THEN
	INSERT INTO acting
	SELECT * FROM casting
	WHERE is_hired = 1;

````

Trigger function in this table.

| movie_id | character_id | actor_id | expected_salary | casting_order | is_hired | agreed_salary |
| -------- | ------------ | -------- | --------------- | ------------- | -------- | ------------- |
| 17       | 3            | 6        | 1.0             | 3             | FALSE    | NULL          |
| 17       | 3            | 11       | 1.5             | 1             | TRUE     |               |
| 17       | 3            | 12       | 3.0             | 2             | FALSE    | NULL          |

### Acting table.

When **is_hired** == 1, insert that actor in actin table:

| movie_Id | character_Id | actor_id | paid_salary |
| -------- | ------------ | -------- | ----------- |
| 17       | 3            | 11       | 1.0         |

## 📓 2023-02-20

### Aggregate functions SUM(), COUNT() AVG() combined with the GROUP BY.

**actors_view**
* height, weight, age.
**characters**
* height, weight, age.
**casting**
* expected_salary, negotiated_salary.
**acting**
* payed_salary

[W3Schools | GROUP BY](https://www.w3schools.com/sql/sql_groupby.asp)

The `GROUP BY` statement is often used with aggregate functions (`COUNT()`, `MAX()`, `MIN()`, `SUM()`, `AVG()`) to group the result-set by one or more columns.

Average actor_age from VIEW:

````sql
SELECT FLOOR(AVG(actor_age)) AS average_actor_age FROM actors_view
````

> The `GROUP BY` is used like a ==for each==.

Salary difference between expected_salary and agreed-salary:

````sql
SELECT (SUM(expected_salary) - SUM(agreed_salary)) AS salary_difference
FROM casting
GROUP BY actor_id
````

## 📓 2023-02-21

> Pedir lo que necesito a la tabla.

- [ ] Hacer casting view.
- [ ] Hacer el expected_salary del casting_view.

### Casting view.

| movie_id | character_id | actor_id | ==expected_salary== | casting_position | is_hired | agreed_salary |
| -------- | ------------ | -------- | ------------------- | ---------------- | -------- | ------------- |
| 30       | 2            | 11       | 1.5                 | 2                | 0        | NULL          |
| 30       | 2            | 22       | 2.5                 | 1                | 1        | 3.0           |
| 30       | 2            | 28       | 3.0                 | 3                | 0        | NULL          |


La casting_view tiene 4 columnas extras:
- movie_title.
- character_name.
- actor_name.
- expected_salary.

expected_salary:

````sql
SELECT AVG(payed_salary)
FROM acting_view
WHERE actor_id = casting.actor_id
AND released_year >= YEAR(CURRENT_DATE()) - 5
````

## 📓 2023-03-02

### Reservations View.

Total income since the company started (reversations table):

````sql
SELECT SUM(subtotal)
FROM reservations_view;
````

Reservations view:
| reservation_number | customer_id | car_id | date_in    | date_out   | unit_price | subtotal (calculated column) |
| ------------------ | ----------- | ------ | ---------- | ---------- | ---------- | ---------------------------- |
| 1341               | 2           | 8      | 2023-03-02 | 2023-03-05 | 80         | 160                          |

subtotal --> calculated column (qty * price)

Total income in last season between May 1 and Oct 1.

````sql
SELECT SUM(subtotal)
FROM reservations_view
WHERE date_out BETWEEN 2022-05-01 AND 2022-09-30 -- include both days.
````

Total income, **per car**:

````sql
SELECT car_id, SUM(subtotal)
FROM reservations_view
GROUP BY car_id;
````

Total income, **per month**:

````sql
SELECT MONTH(date_out) AS month, SUM(subtotal) AS subtotal
FROM reservations_view
GROUP BY MONTH(date_out);
````

Total income, **per car category:**

==Add car_category to the reservations_view and then do the query:==
| reservation_number | customer_id | car_id | date_in    | date_out   | unit_price | subtotal (calculated column) | car_model |
| ------------------ | ----------- | ------ | ---------- | ---------- | ---------- | ---------------------------- | --------- |
| 1341               | 2           | 8      | 2023-03-02 | 2023-03-05 | 80         | 160                          |  Sport |         |

````sql
SELECT car_catagory, SUM (subtotal)
FROM reservations_view
GROUP BY car_category;
````

Total income, **per year:**

````sql
SELECT YEAR(date_out), SUM(subtotal)
FROM reservations_view
GROUP BY YEAR(date_out);
````

**GROUP BY YEAR** and **GROUP BY MONTH**.

## 📓 2023-03-03

### Get cars between 2 dates.

List of available cars between 2 specific dates.

````sql
SELECT *
FROM cars
WHERE car_id NOT IN (SELECT car_id
FROM reservations
WHERE date_in < '2023-03-07' AND date_out > '2023-03-01');
-- Sustituir las dates con variables para hacer una procedure.
````

### For the weekend.

* List with the top 3 cars. (income generated in the last season)
* Find the most succesful car_category. (income generated in the last season)

## 📓 2023-03-10

### 🖊 Corrección examen rentavehicle.

#### 1. Create the tables of the rentavehicle database..

1. vehicles table.
2. customers table.
3. reservations table.
4. invoices table (later on the exam)

#### 2. Fill the database (INSERT INTO).

````sql
-- 10 cars, 10 motorbikes, 10 bicycles, 10 scooters.
INSERT INTO vehicles (-,-,-,-) VALUES
(-,-,-,-,-),
(-,-,-,-,-),
(-,-,-,-,-),
(-,-,-,-,-);
````

#### 3. Fill reservations TABLE

````sql
INSERT INTO reservations (-,-,-,-,-) VALUES
(-,-,-,-,-),
(-,-,-,-,-);
````

#### 4. Create VIEW reservations_enchanced.

````sql
CREATE VIEW reservations_enchanced AS
SELECT ...
FROM reservations
INNER JOIN customers ...
INNER JOIN vehicles ...
````

#### 5. Returned trigger in reservations table

Add is_returned to reservations and then create the trigger.

#### 6. Subcategories.

With 2 tables:

- subcategories table.
- vehicles_subcategories table.

| vehicle_id | subcategory_id |
| ---------- | -------------- |
| 1          | 2              |
| 1          | 4              |
| 2          | 3              |
| 3          | 8              |

#### 7. Fill in the invoices table.

## 📓 2023-03-13 && 2023-03-14

### 🖊 Diagramas entidad relación.

#### Entidades:

* Clients
* Productes
* Proveidors
* Magatzems
* Transportistas
* Personal
* Categorias
* Adreça.
* Contactes.
* Carrito.
* Carrito linea
* Comanda. ---> Estat (atributo)
* Incidència.
* Comanda linea.
* Envio.
* Albaran.
* Factura.
* Envio.

### 🛒 Atributos y entidades online shopping:

#### Atributos:

Concepto de CAP y LINEA en el ejemplo de la factura. Arriba de la factura está la información del cliente y después en una tabla, está toda la información, precios de los productos.

##### CLIENT.

UUID para cliente_id (Idenficador único universal)
*Se recomienda NO usar el DNI como PK de la tabla.*

* Nom y cognoms (junts).
* DNI.
* Email.
* Adreça.
* Teléfon mòbil.
* Id cliente.
* Descompte.
* Observacions.
* Forma de pagament.

##### PROVEIDOR.

Casi los mismos que cliente

##### MAGATZEM.

* Adreça.
* Teléfon.
* M2 (metros cuadrados).

##### PRODUCTO.

* Id del producto.
* Nom.
* Preu.
* Categoria.
* Llarg
* Grossor.
* Ample.
* Pes.

##### CARRET.
* Id.
* Data.
* Client.

##### CARRET_LN.
* Id linea.
* Producte.
* Qty.
* Preu.
* Import.
* Magatzem.
* Estat.

### 🚗 Atributos y entidades concessionario:

#### Entidades:

* Coches.
* Clientes.
* Magatzem.
* Venta.
* Taller.
* Venta_ln.
* Empleat
* Marca.
* Model.

#### Atributos:

**Coches.** Id coche, nombre, modelo, tipo, precio, asientos, num_bastidor, matricula, data_fecha:fabricacion, estat (si esta rallado, de segunda mano, etc), imatges.
**Cliente**. Id cliente, nombre, apellidos, DNI, adreça, telefono, métodoDePage.
**Magatzem**. Id magatzem, adreça, capacitat, coche.
**Venta**. idventa, cliente, preu.
**Venta_ln**. Fecha, precio, cantidad.
**Taller.** Id_taller, 
**Empleat.**
**Marca.**
**Model.** n_asientos, preu, data_llançament, cilindrada, potencia, tipo_combustible


## 📓 2023-03-15

### 🅰Relacions.

#### Cardinalitat.

##### 1:1

A cada ocurrència de la primera entitat li correspon una i només una ocurrència de la segona i viceversa (una a una).

Estadoo 1 <- tiene ->  1 Capital.

##### 1:N

A cada ocurrència de la primera entitat li poden correspondre més d'una ocurrència de la segona i cada ocurréncia de la segona li correspon no més d'una de la primera. (1 a moltes)

##### N:M

A cada ocurrència de la primera entitat li poden correspondre més d'una ocurrència de la segons i veceversa (moltes a moltes)

CARRET N <-- té --> M PRODUCTE

Esta cardinalitat es descomposa en dues relacions **1.N** durant del disseny lògic.

## 📓 2023-03-17

### Concesionario de Vehículo.

*Clic derecho --> Insertar nuevo diagrama...*
![[Diagrama Concesionario.svg]]

Enlace para Mermaid cheat sheet: [aquí](https://jojozhuang.github.io/tutorial/mermaid-cheat-sheet/)

*Mirar las fotos del ==Whatsapp*==

* **VEHICLES.**
	* Model
	* Marca
	* PVP
	* Num_bastidor.

* **VENDA.**
	* Nombre. Fac/1
	* Cliente. Joan Pons Pons
	* Data_omissió. 17-03-2023
	* Observacions. -

Tablas "humanas", poner la clave foránea o en la tabla VENDA o en la tabla VEHICLE:

**VENDA.**
| Nombre | Cliente   | Data       | Observacions | ==Vehicle== |
| ------ | --------- | ---------- | ------------ | ----------- |
| FAC/1  | Joan Pons | 17-03-2023 | -            | ABC         |
| FAC/1  | Joan Pons | 17-03-2023 | -            | CBA         |
| FAC/2  | Joan Pons | 17-3-2023  | -            | 123         |

**VEHICLE.**
| Num_bastidor | Model  | Marca | PVP   | ==Venda== |
| ------------ | ------ | ----- | ----- | ----- |
| ABC          | Corsa  | Opel  | 20000 | FAC/1 |
| CBA          | Corsa  | Opel  | 18000 |       |
| 123          | Fiesta | Ford  | 21000 | FAC/2 |

Solucion más eficiente:

````mermaid
graph LR;  
    VEHICLE-- Conexion N - M ---VENDA
````

Utilizando esta solución, las tablas anteriores ==subrayadas==, se pueden eliminar. Para nombrar la tabla podemos usar: Tabla_tabla (donde hay conexión).

**VENDA_VEHICLES**
| Nombre | Num_bastidor |
| ------ | ------------ |
| FAC/1  | ABC          |
| FAC/1  | CBA          |
| FAC/2  | 123          |

También, podremos borrar la 2ª fila de la tabla **VENDA.**

### Tienda Online.

````mermaid
graph LR;  
    MARCA-- Conexion N - M ---MODELO
````

