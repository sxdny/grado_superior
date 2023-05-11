<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Rent a car | Reservations SELECT</title>
  <link rel="stylesheet" href="../style.css?v=<?php echo time(); ?>">

</head>

<body>
  <header>
    <h1>RENT A CAR | RESERVATIONS</h1>
    <h3>RESERVATIONS</h3>
  </header>

  <div class="square">
    <form action="../querys/db_reservations_select.php" method="POST">
      <label for="">
        <h2>Consulte sus reservas</h2>
        <p>Introduzca el client_id para obtener todas sus reservas.
        </p>
      </label>
      <!-- <p>Fecha de inicio:</p>
      <input type="date" name="date_in" id="">
      <p>Fecha final:</p>
      <input type="date" name="date_out" id=""> -->
      <input type="text" name="client_id" id="">

      <!-- TODO hacer mas cosa -->
      <br>
      <br>
      <input type="submit">
    </form>
  </div>

</body>

</html>