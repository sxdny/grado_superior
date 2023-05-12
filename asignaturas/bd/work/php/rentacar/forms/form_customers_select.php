<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Rent a car | Customers SELECT</title>
  <link rel="stylesheet" href="../style.css?v=<?php echo time(); ?>">
</head>

<body>
  <header>
    <h1>RENT A CAR | CUSTOMERS</h1>
    <h3>CLIENTS</h3>
  </header>

  <div class="square">
    <form action="../querys/db_customers_select.php" method="POST">
      <label for="">
        <h4>Inserte su client_id:</h4>
      </label>
      <input type="text" name="client_id" id="">

      <!-- TODO hacer mas cosa -->
      <br>
      <input type="submit">
    </form>
  </div>

</body>

</html>