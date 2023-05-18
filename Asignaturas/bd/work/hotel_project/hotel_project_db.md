#bd #hotel #project

# Hotel Project.

## Tables.

- **Clientes.** ID (autogenerada), nombre, apellidos, metodo_de_pago, nacionalidad, DNI, correo_electronico, nº teléfono.
- **Habitaciones.** ID (autogenerada), nombre, capacidad, JSON_caracteristicas
- **Empleados.** ID (autogenerada), nombre, apellidos, DNI, nombre_telefono, correo_electrónico,  cargo.
- **Servicios.** ID (autogenerada), nombre, tipo_servicio, ubicación, 
- **Reservas.** ID Reserva (autogenerada), ID Cliente, ID Habitación, data_entrada, data_salida, 

### Servicios posibles de una habitación de hotel.

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
