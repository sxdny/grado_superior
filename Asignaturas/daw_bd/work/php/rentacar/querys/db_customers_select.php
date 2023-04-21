<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rent a car | Customers SELECT</title>
</head>

<style>

</style>

<body>
    <?php
    // pasamos el contenido del HTML al PHP.
    $client_id = $_POST['client_id'];

    // realizamos la conexión a la base de datos
    $conn = mysqli_connect('localhost', 'root', '', 'rentacar');

    // hacemos la query
    $sql = "SELECT * FROM clients WHERE client_id='$client_id'";
    $result = mysqli_query($conn, $sql);
    $user_info = mysqli_fetch_all($result, MYSQLI_ASSOC);

    mysqli_free_result($result);
    mysqli_close($conn);

    if ($user_info == null) {
        print_r("<h2> Error </h2>");
        print_r("No existe una cuenta de usuario con el ID que ha indicado.");
    } else {
        // imprimimos el resultado por pantalla de forma "bonita".
        print_r('<h1> Tu perfil: </h1>');
        print_r($user_info);
    }
    ?>
</body>

</html>