#bd #hotel #project

# Hotel Project.

## Tables.

- **Clientes.** ID (autogenerada), nombre, apellidos, metodo_de_pago, nacionalidad, DNI, correo_electronico, nº teléfono.
- **Habitaciones.** ID (autogenerada), nombre, capacidad, JSON_caracteristicas
- **Empleados.** ID (autogenerada), nombre, apellidos, DNI, nombre_telefono, correo_electrónico,  cargo.
- **Servicios.** ID (autogenerada), nombre, tipo_servicio, ubicación, 
- **Reservas.** ID Reserva (autogenerada), ID Cliente, ID Habitación, data_entrada, data_salida, 

## Servicios posibles de una habitación de hotel.

==JSON==
Algunos servicios que se podrián ofrecer en una habitación de hotel:

- TVs.
- Trona.
- Ventilador.
- Teléfono.
- Cocina (vitro, calentador de agua, etc).
- Baño (ducha, secador, etc)
- Productos limpieza (cubo, fregfona)
- Caja fuerte.
- WI-FI.
- Limpieza diaria.
- Cambio de sábanas y toallas.
- Calefacción.
- Electricidad (220W)
- Regalo.

## Creación de tablas en la base de datos.

### Tabla `Habitaciones`

````sql
CREATE TABLE habitaciones (
	id INT PRIMARY KEY AUTO INCREMENT,
	nombre varchar(255),
	descripcion longtext,
	capacidad int,
	tipo varchar(255),
	caracteristicas JSON,
	disponible boolean,
	precio decimal
);

CREATE TABLE cliente (
	id INT PRIMARY KEY AUTO INCREMENT,
	nombre varchar(255),
	DNI varchar(255),
	email varchar(255),
	telefono varchar(255),
	metodo_pago varchar(255)
)

CREATE TABLE empleados (
	id INT PRIMARY KEY AUTO INCREMENT,
	nombre varchar(255),
	apellidos varchar(255),
	DNI varchar(255),
	
)
````

## Trigger pizarra.

Ejemplo de trigger para la database `hotels`:

````sql
CREATE TRIGGER tr_reservas_historic
AFTER UPDATE ON reservas 
FOR EACH ROW 
BEGIN
	SET @reserva_id_rm = SELECT reserva_id FROM reserva WHERE NEW.available = false;
	IF NEW.available = false THEN
			INSERT INTO historic
			VALUES SELECT * FROM reservas WHERE reserva_id = @reserva_id_rm;
			DELETE * FROM reservas
			WHERE reserva_id = @reserva_id_rm;
	END IF;
END
````

## Event pizarra.

Ejemplo de `event` de la pizarra:

````sql
CREATE EVENT product_insert_event
ON SCHEDULE EVERY [ 1 DAY | 12 HOUR | 3 MIN ... ]
STARTS [ CURRENT_TIMESTAMP ] ENDS [ '2023-12-31' ]
DO 
	INSERT INTO production_table
	(product_id, units, insert_time)
	VALUES
	(DEFAULT, 500, NOW());
````

## Subquery

Ejemplo subquery de la pizarra:

````sql
SELECT car_id
	(SELECT COUNT(car_id)
	FROM reservations AS r1
	WHERE r2.car_id = r1.car_id)
	AS times_rented)
FROM reservations as r1;
````