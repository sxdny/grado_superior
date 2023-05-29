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