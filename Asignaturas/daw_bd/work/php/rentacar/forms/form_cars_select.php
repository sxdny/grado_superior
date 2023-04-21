<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Rent a car | Cars SELECT</title>
  <link rel="stylesheet" href="../style.css?v=<?php echo time(); ?>">
</head>

<body>
  <header>
    <h1>RENT A CAR | CARS</h1>
    <h2>Filtre para obtener coches.</h2>
  </header>

  <div class="square">
    <form action="../querys/db_cars_select.php" method="POST">
      <!-- Asientos: -->
      <label for="">
        <h3>Asientos del coche:</h3>
      </label>
      <select name="seats" id="">
        <option value="select">Seleccione un número de asientos</option>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
      </select>

      <!-- Marca:
      <label for="">
        <h3>Indique una de las marcas disponibles:</h3>
      </label>
      <select name="brands" id="">
        <option value="lamborghini">Lamborghini</option>
      </select>
      <br>
      <input type="submit"> -->

      <label for="">
        <h3>Indique que marcas de coche le interesa:</h3>
      </label>
      <ul>
        <li>
          <input type="checkbox" id="myCheckbox1" name="lamborghini" />
          <label for="myCheckbox1"> <img src="../images/lamborghini_logo.jpg"> </label>
        </li>
        <li>

          <input type="checkbox" id="myCheckbox2" />
          <label for="myCheckbox2"><img
              src="../images/dodge_logo.jpg" /></label>
        </li>
        <li>

          <input type="checkbox" id="myCheckbox3" />
          <label for="myCheckbox3"><img
              src="../images/lexus_logo.jpg" /></label>
        </li>
        <li>

          <input type="checkbox" id="myCheckbox4" />
          <label for="myCheckbox4"><img
              src="../images/audi_logo.png" /></label>
        </li>
      </ul>
    </form>
  </div>

</body>

</html>