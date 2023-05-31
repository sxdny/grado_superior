tags:: #repaso_examen #bd #📢 

# Examen corregido Base de Datos T3

## 1. SQL Commands

Number of times a car has been rented.

````sql
SELECT COUNT(car_id)
FROM reservations
GROUP BY car_id;
````

Output:

| car_id | COUNT(car_id) |
| ------ | ------------- |
| 1      | 34            |
| 3      | 3             |
| 2      | 4             |

Number of times a car has been rented AND the income

````sql
SELECT COUNT(car_id), SUM(subtotal)
FROM reservations_view
GROUP BY car_id;
````

Output:

| car_id | COUNT(car_id) | SUM(subtotal) |
| ------ | ------------- | ------------- |
| 1      | 34            | 5800          |
| 3      | 3             | 1040          |
| 2      | 4             | 343           |

Income generated per car during the last car season:

````sql
SELECT SUM(subtotal)
FROM reservations_view
WHERE date_in BETWEEN '2023-05-01' AND '2023-09-31'
GROUP BY car_id;
````

Income generated per car and moth during the last year:

````sql
SELECT SUM(subtotal)
FROM reservations_view
WHERE date_in BETWEEN '2022-01-01' AND '2022-12-31'
GROUP BY car_id, MONTH(date_in)
````

## 2. Procedure to check availability of cars.

```sql
-- Calculated variable
var_date_out = SELECT(DATE_ADD(var_date_in, INTERVAL var_numberOfDays DAY))
```

If cars available, INSERT new reservation.

````sql
SELECT car_id, brand, model, car_category
FROM cars
WHERE car_category = 'basic' AND car_id NOT IN
	(SELECT FROM reservations
	 WHERE date_in > var_date_out
	 AND DATE_ADD(date_in, INTERVALL var_number_of_days DAY) > var_date_in)
SELECT 'Sorry, no cars for this category.';
````

## 3. Solution to keep cars on track of damaged cars and scratched while rented.

1. Store damages in a relational table.

Table **damages**:

| reservation_number | damage_description                |
| ------------------ | --------------------------------- |
| 384                | Little scratch on left fron door. |

2. JSON file.

````json
{
	"scratches" : {
		"RR" : false,
		"BD-R" : false,
		"FD-R" : true,
		"FR" : true
	}
}
````

## 4. NUMERIC functions.

-

## 5. STRING functions.

-

## 6. DATE TIME functions.

-

## 7. JSON functions.

-

## 8. Hotel Managment System.

Rooms table

Status:

- Ready.
- Check_in.
- Check_out.

| room_id | room_status |
| ------- | ----------- |
| 27      | ready       |

Reservations table.

Status:

- Booked.
- Check-on.
- Check-out.
- (cancelled)

| reservation_number | reservation_status | room_id |
| ------------------ | ------------------ | ------- |
|                    | booked             | 27      |

Trigger:

Booked -> check-in -> check-out
Ready   -> check-in -> check-out -> (Ready) - Maid manual.

Para pasar de `checkout` a `ready` > Aplicacion con el movil qu hace un `UPDATE` de rooms y ponga el room_status a `ready`.

````sql
CREATE TRIGGER tr_change_status
FOR EACH ROW
BEGIN
IF OLD.reservation_status = 'booked' AND NEW.reservation_status = 'check-in'
	UPDATE rroms
	SET room_status = 'check-in'
	WHERE room_id = NEW.room_id;
END IF;
END
````

## 9. INSERT products inside shopping_cart.

**Question:** Simulate the customer's buying process.

**Solution:**

````sql
EVENT
PROCEDURE(var_lines, var_customer_id, var_product_id, var_qty)
INSERT INTO shopping_cart (customer_id, product_id, qty)
VALUES
(3, 4, 2);
````

> `random_numbers` rand() function (from 0 to 0.999) -> 0 included

````sql
SELECT customer_id... ORDER BY rand();
SELECT product_id... ORDER BY rand();
-- Hacer select del stock entre 1 al limite del stock
qty 1..5
````

> El `var_lines`es donde se guarda cuantas lineas se insertaran en el carrito por un solo pedido. From 1 to 10. Random too.

````sql
-- Obtiene un customer_id random
SELECT customer_id
FROM customers
WHERE customer_status = 1
ORDER BY [customer_id DESC ] -> RAND()
LIMIT 1;
````

## 10. Online Shop

Products table:

Optoin 1: **NO**

| products_id | product_name    | product_price |
| ----------- | --------------- | ------------- |
| 1           | t-shirt blue    | 10.00         |
| 2           | t-shirt red     |               |
| 3           | t-shirt white L |               |
| 4           | t-shirt white M |               |
| ...         | ...             | ...           |

**Option 2: NO**

| product_id | color |
| ---------- | ----- |
| 1          | white |
| 1          | blue  |
| 1          | red   |
| ...        |       |

Option 3:

| product_id | product_name | product_price | product_characteristics |
| ---------- | ------------ | ------------- | ----------------------- |
| 1           | t-shirt             | 10                | JSON file**                         |

JSON Design 1**:

````json
{
	"size" : ["XS", "S", "M", "L", "XL"],
	"fit" : ["slim", "regular", "loose"],
	"color" : ["blue", "red", "white", "black", "green"]
}
````

JSON Design 2:

````json
{
	"size" : {
		"xs" : 12.00,
		"s" : 11,
		"m": 10,
		"l" : 11,
		"xl" : 14
	},
	"fit" : {
		...
	},
	"color" : {
		...
	}
}
````

Consultar la información.

>[!todo]
>Hacer esto con el Hotel. Hacer una VIEW.

````SQL
SELECT product_id, product_name, pr oduct_prce, JSON_EXTRACT(product_characteristics, "$.size") AS size, JSON_EXTRACT() AS fit, JSON_EXTRACT() AS color
````
