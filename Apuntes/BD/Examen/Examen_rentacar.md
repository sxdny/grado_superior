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
````sql