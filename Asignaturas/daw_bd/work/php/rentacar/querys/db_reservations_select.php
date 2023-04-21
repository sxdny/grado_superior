<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rent a car | Reservations SELECT</title>
</head>

<style>

</style>

<body>
    <?php
    // pasamos el contenido del HTML al PHP.
    // $date_in = $_POST['date_in'];
    // $date_out = $_POST['date_out'];
    $client_id = $_POST['client_id'];

    // realizamos la conexión a la base de datos
    $conn = mysqli_connect('localhost', 'root', '', 'rentacar');

    // hacemos la query
    $sql = "SELECT * FROM reservation WHERE client_id = '$client_id'";
    $result = mysqli_query($conn, $sql);
    $reservation_info = mysqli_fetch_all($result, MYSQLI_ASSOC);

    mysqli_free_result($result);
    mysqli_close($conn);

    // imprimimos el resultado por pantalla de forma "bonita".
    print_r ('<h1> Reservas: </h1>');
    print_r ($reservation_info);

    ?>
</body>

</html>