<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rent a car</title>
</head>

<style>

</style>

<body>
    <?php
    // pasamos el contenido del HTML al PHP.
    $seats = $_POST['seats'];

    // realizamos la conexión a la base de datos
    $conn = mysqli_connect('localhost', 'root', '', 'rentacar');

    // hacemos la query
    $sql = "SELECT * FROM cars WHERE seats='$seats'";
    $result = mysqli_query($conn, $sql);
    $cars = mysqli_fetch_all($result, MYSQLI_ASSOC);

    mysqli_free_result($result);
    mysqli_close($conn);

    // imprimimos el resultado por pantalla de forma "bonita".
    foreach ($cars as $car) {
        echo $car['brand'] . ' - ' . $car['model'] . ' - ' . $car['price'];
        echo '<br>';
    }

    if ($cars == null) {
        print_r("<h2> Error </h2>");
        print_r("No existen coches disponibles...");
    }

    ?>
</body>

</html>