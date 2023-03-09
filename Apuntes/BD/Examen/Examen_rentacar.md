### 1. Create DB rentacar.

### 2. Improve it with views.

````sql
-- VIEW for the final user.
SELECT 
FROM reservations AS r
INNER JOIN car ON r.car_id = car.car_id,
INNER JOIN client ON r.client_id = client.client_id,
````

## SUBSTRACT function.

````sql
SUBSTRACT('Sidney', 1, 3); -- del 1 al 3.
SUBSTRACT('Sidney', -3) -- last 3 digits.
````

### Crear tablas en la base de datos rentacar.

````sql
-- Tabla de clientes.
CREATE TABLE clients (
	client_id INT NOT NULL AUTO_INCREMENT,
	client_forename VARCHAR(255),
	client_surname VARCHAR(255),
	client_email VARCHAR(255),
	client_phonenumber VARCHAR(255),
	PRIMARY KEY (client_id)
)

-- Tabla de coches.
CREATE TABLE cars (
	car_id INT NOT NULL AUTO_INCREMENT,
	car_name VARCHAR(255),
	car_type VARCHAR(255),
	car_seats INT,
	car_price DOUBLE(7,2),
	car_plate VARCHAR(15) NOT NULL,
	PRIMARY KEY(car_id)
)

-- Tabla de reservas
CREATE TABLE rentals (
	rental_id INT NOT NULL AUTO_INCREMENT,
	car_id INT NOT NULL,
	client_id INT NOT NULL,
	date_in DATE,
	date_out DATE,
	rental_prince DOUBLE(12,2),
	PRIMARY KEY(rental_id),
	FOREIGN KEY (car_id) REFERENCES cars (car_id),
	FOREIGN KEY (client_id) REFERENTES clients (client_id)
)
````

### Insert data inside the table.

````sql
-- Datos en la tabla cars.
INSERT INTO vehicles
VALUES
(DEFAULT, "Dodge Hellcat", "Coche", 5, 500.00, "2004SID"),
(DEFAULT, "Mercedes AMG Clase G", "Coche", 5, 750.00, "1783CJH"),
(DEFAULT, "Lamborghini Aventador", "Coche", 2, 900.00, "9973KPL"),
(DEFAULT, "Toyota Corolla", "Coche", 5, 120.00, "1919JKL"),
(DEFAULT, "Tesla Model S", "Coche", 5, 200.00, "0123TES"),
(DEFAULT, "SUV Peugeot 2008", "Coche", 5, 310.00, "6298PGO"),
(DEFAULT, "Aston Martin DB9", "Coche", 4, 570.00, "2004NFS"),
(DEFAULT, "Dodge Challenger", "Coche", 4, 490.00, "3800DDG"),
(DEFAULT, "Range Rover Defender", "Coche", 5, 340.00, "1111JJK"),
(DEFAULT, "Honda TR8", "Moto", 2, 120.00, "1234PPL"),
(DEFAULT, "Moyokami Thunder", "Moto", 2, 150.00, "0001PLP"),
(DEFAULT, "Retro v8", "Moto", 2, 145.00, "5555OOL"),
(DEFAULT, "Moto Vieja", "Moto", 2, 80.00, "4432UUJ"),
(DEFAULT, "Dodge Moto Thunder", "Moto", 2, 233.00, "2424AAA"),
(DEFAULT, "SRM Yung", "Moto", 2, 156.00, "7777VGT"),
(DEFAULT, "Bicicleta 1", "Bicicleta", 1, 30.00, NULL),
(DEFAULT, "Bicicleta Nueva", "Bicicleta", 1, 34.00, NULL),
(DEFAULT, "Trek Bycicle", "Bicicleta", 1, 31.00, NULL),
(DEFAULT, "Sniper Mountain", "Bicicleta", 1, 45.00, NULL),
(DEFAULT, "Toyota BUM Bycicle", "Bicicleta", 1, 67.00, NULL),
(DEFAULT, "Xiaomi Scooter", "Scooter", 1, 60.00, NULL),
(DEFAULT, "Samsung Scooter", "Scooter", 1, 67.00, NULL),
(DEFAULT, "Honda Scooter", "Scooter", 1, 55.00, NULL),
(DEFAULT, "Toyota Scooter", "Scooter", 1, 99.00, NULL),
(DEFAULT, "Ferrari Scooter v8", "Scooter", 1, 160.00, NULL),

-- Datos de la tabla clientes.
INSERT INTO clients
VALUES
(DEFAULT, "Sidney", "Silva Braz de Oliveira", "silvasidney721@tutanota.com", 633627368),
(DEFAULT, "Marcos", "Aurelios Tercer", "marcosaurelio@gmail.com", 622871255),
(DEFAULT, "Juana", "de Arco Centella", "juanadearcos@gmail.com", 677232397),
(DEFAULT, "Jordan", "Terrell Carter", "playboicartireal@gmail.com", 677659121),
(DEFAULT, "Kathlyn", "Natalia Souza Silva", "kathlynnatalia@gmail.com", 634287322),
(DEFAULT, "Sebastian", "Gomila Jindathajak", "sebasgomilas@gmail.com", 688333454),
(DEFAULT, "Paula", "Gimena Guzmán", "paula998gimena@gmail.com", 633446699),
(DEFAULT, "Carlota", "Villalonga Carreras", "carlotavillalonga@gmail.com", 633627368),
(DEFAULT, "Matheus", "Arcos Gomila", "matheusyt77@gmail.com", 624951010),
(DEFAULT, "Sidneya", "Braz Silva", "sidneyacrush@gmail.com", 655459812),
(DEFAULT, "Pau", "Sintes Corbal", "pausintes@gmail.com", 677654489),
(DEFAULT, "Paco", "Pons Miranda", "pacoponssql@gmail.com", 654113090),
(DEFAULT, "Ili", "Ilinois Ventura", "iliiliventura@gmail.com", 688912234),
(DEFAULT, "Sebastian", "Yatra PopEseCuele", "sebastanyayatra@gmail.com", 666334412),
(DEFAULT, "Yaya", "Traoré Babadú", "yayatraore@gmail.com", 611096234),
(DEFAULT, "Cristiano", "Ronaldo Santos", "realcr7@gmail.com", 677676767),
(DEFAULT, "Lionel", "Andrés Messi", "lionelmessi@gmail.com", 699999998),
(DEFAULT, "Thomas", "Gendell Junior", "thomasjunior@gmail.com", 699466690),
(DEFAULT, "Xin", "Thai Xu", "xinxuthai@cgmail.com", 644916755),
(DEFAULT, "Manuel", "Martillo Marcos", "triplemarcos@gmail.com", 655871212);

-- Datos de la tabla rentals.
INSERT INTO rentals
VALUES
(DEFAULT, 1, 4, '2023-03-09', '2023-03-15'),
(DEFAULT, 4, 12, '2023-03-14', '2023-03-17'),
(DEFAULT, 8, 4, '2023-03-09', '2023-03-13'),
(DEFAULT, 5, 7, '2023-03-20', '2023-04-01'),
(DEFAULT, 2, 3, '2023-03-29', '2023-04-25'),
(DEFAULT, 5, 9, '2023-04-10', '2023-04-15'),
(DEFAULT, 1, 4, '2023-04-12', '2023-04-21'),
(DEFAULT, 4, 12, '2023-04-19', '2023-04-28'),
(DEFAULT, 1, 3, '2023-04-30', '2023-05-14'),
(DEFAULT, 7, 7, '2023-05-16', '2023-05-25');
````

### Creación de VIEWS.

````sql
CREATE VIEW rentals_views AS
SELECT
````

### Ejemplo de PROCEDURES.

````sql
-- Función que calcula el total y lo pone en una variable (un poco inútil ponerlo en la variable.)

BEGIN
DECLARE var_price DOUBLE(12,2);
SET var_price = 0;

SELECT SUM(car_price) INTO var_price
FROM cars;

SELECT var_price AS precio;

END

-- Inner Join de rentals con cars
SELECT r.rental_id, r.client_id, r.car_id, r.date_in, r.date_out, 
FROM rentals AS r
INNER JOIN cars AS c
ON r.car_id =
````

### Ejemplo de INNER JOIN.

````sql
SELECT _column_name(s)_  
FROM _table1_  
INNER JOIN _table2  
_ON _table1.column_name_ = _table2.column_name_;
````

````sql
CREATE VIEW rentals_enchanced AS 
SELECT v.vehicle_name, c.client_forename, c.client_surname, DATEDIFF(r.date_out, r.date_in) AS days_of_rental, SUM (v.vehicle_price * DATEDIFF(r.date_out, r.date_in)) AS subtotal
FROM rentals AS r 
INNER JOIN vehicles AS v ON r
.vehicle_id = v.vehicle_id 
INNER JOIN clients AS c ON r.client_id = c.client_id;
````
[CREATE](http://127.0.0.1/phpmyadmin/url.php?url=https://dev.mysql.com/doc/refman/8.0/en/create-view.html) [VIEW](http://127.0.0.1/phpmyadmin/url.php?url=https://dev.mysql.com/doc/refman/8.0/en/create-view.html) rentals_enchanced AS [SELECT](http://127.0.0.1/phpmyadmin/url.php?url=https://dev.mysql.com/doc/refman/8.0/en/select.html) v.vehicle_name, c.client_forename, c.client_surname, DATEDIFF(r.date_in, r.date_out) AS days_of_rental, [SUM](http://127.0.0.1/phpmyadmin/url.php?url=https://dev.mysql.com/doc/refman/8.0/en/aggregate-functions.html%23function_sum)(v.vehicle_price * DATEDIFF(r.date_in, r.date_out)) AS subtotal FROM rentals AS r INNER JOIN vehicles AS v ON r.vehicle_id = v.vehicle_id INNER JOIN clients AS c ON r.client_id = c.client_id;