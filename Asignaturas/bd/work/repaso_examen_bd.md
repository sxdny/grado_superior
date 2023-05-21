#repaso_examen #base_de_datos #summary

# Theorical Databases Exam Summary

Important things to remember for the databases 3T therorical exam.

## Data Types

Most common data types:

- INT
- DECIMAL
- DOUBLE
- LONGTEXT
- VARCHAR
- JSON DATATYPE
- DATE
- TIME
- DATETIME
- TIMESTAMP

## Important statements

### CREATE TABLE

Basis syntax:

````sql
CREATE TABLE table_name (
	column1 datatype,
	column2 datatype,
	...
);
````

Create table from another table (useful to copy the same columns from another table):

````sql
CREATE TABLE new_table_name_ AS  
    SELECT column1, column2,...  
    FROM existing_table_name  
    WHERE ...;
````

---

Create table with `PRIMARY KEY`:

````sql
CREATE TABLE table_name (
	column datatype NOT NULL AUTO INCREMENT PRIMARY KEY
)
````

You can also do:

````sql
CREATE TABLE table_name (
	column datatype NOT NULL AUTO INCREMENT
	PRIMARY KEY (column) -- Better organization
)
````

---

For creating a table with `FOREIGN KEYS`:

````sql
CREATE TABLE table_name (
	column datatype FOREIGN KEY REFERENCES another_table_name(another_column)
	...
)
````

You can also do:

````sql
CREATE TABLE table_name (
	column datatype
	FOREIGN KEY (column) REFERENCES another_table_name(another_column)
)
````

## CREATE TRIGGER

Basis syntax:

````sql
CREATE TRIGER trigger_name
[ AFTER | BEFORE ] -> [ INSERT | UPDATE | DELETE] ON table_name
[ FOR EACH ROW ]
COMMAND
````

- El `AFTER | BEFORE -> INSERT | UPDATE | DELETE` será el cambio que queremos capturar. Por ejemplo podría ser después de que un usuario se dé de alta, hacer esto. En SQL seria: `AFTER INSERT` on users hacer...
- *En `COMMAND` va el código, puede ser algo simple o algo complejo. Si haremos algo complejo con varias líneas, usaremos `BEGIN` y `END`.*
- *El `FOR EACH ROW` puede o no estar. Si lo usamos, buscará  el cambio en todas las filas de la tabla.*

Trigger example for the `hotels` database (from the whiteboard):

````sql
CREATE TRIGGER tr_reservas_historic
AFTER UPDATE ON reservas 
FOR EACH ROW 
BEGIN
	-- Variable declaration
	SET @reserva_id_rm = SELECT reserva_id FROM reserva WHERE NEW.available = false AND OLD.available = false;
	
	-- Actual command
	IF NEW.available = false AND OLD.available = true THEN
			INSERT INTO historic
			VALUES SELECT * FROM reservas WHERE reserva_id = @reserva_id_rm;
			DELETE FROM reservas
			WHERE reserva_id = @reserva_id_rm;
	END IF;
END
````

## CREATE EVENT

Basic syntax:

````sql
CREATE EVENT event_name
ON SCHEDULE schedule
DO ...
````

`schedule` options:

- `AT TIME_STAMP`. Execute the event at a certain time ==only 1 time==.
- `EVERY interval`. For example: `EVERY 1 DAY` or `EVERY 3 MIN`.
	- The intervals can be `HOURS`, `MINUTES`, `WEEKS`, etc.
- `STARTS timestamp END timestamp`. Duration of the event.

Event that will execute ==only once==, 1 hour after the creation of the event:

````sql
CREATE EVENT event
ON SCHEDULE AT CURRENT_TIMESTAMP + INTERVAL 1 HOUR
DO ...
````

Event that will start executtin *next week* and it will be *triggered* every 1 hour for *a week.*

````sql
CREATE EVENT event
ON SCHEDULE EVERY 1 HOUR -- shedule
STARTS CURRENT_TIMESTAMP + INTERVAL 1 MONTH -- next month
ENDS CURRENT_TIMESTAMP + INTERVAL 1 MONTH + INTERVAL 1 WEEK -- next month, 1 week later
DO...
````

Event example from the whiteboard:

````sql
CREATE EVENT product_insert_event
ON SCHEDULE EVERY 1 DAY -- schedule
STARTS '2023-05-21' ENDS '2023-12-31' -- interval
DO
	INSERT INTO production_table
	(product_id, units, insert_time)
	VALUES
	(DEFAULT, 500, NOW())
````

## SUBQUERY

Subquery example from the whiteboard:

````sql
SELECT car_id
	( SELECT COUNT(car_id)
	FROM reservations AS r1
	WHERE r2.car_id = r1.car_id
	AS times_rented)
FROM reservations as r1;
````

## CREATE PROCEDURE

## CREATE FUNCTION


