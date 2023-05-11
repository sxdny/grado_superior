tags:: #php #base_de_datos

# Semana de PHP

1. Choose a domain. --> localhost
2. Build a basic webpage. index.php - form_cars_select.php db_cars_select.php

````php
<form action="db_cars_select.php" method="POST">
	<input types="text" name="color">
</form>
// capture custom info
$color = $_POST["color"]
$conn = mysqli_connect(myserver,myuserm,mypwd,mydb)
// execute the query
$sql = "SELECT * FROM cars WHERE $color"
$result = mysqli_query($conn,$sql)
// fetch and display
$cars = mysqli_fetch($result, MYSQLI_ASSOC) // MYSQLI_NUM para que el 'model' sea 2
// display
echo $ $cars[2]["model"]; // invisible to the customer
````

