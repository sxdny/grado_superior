Examen Base de datos (2 horas sin papel, NO Internet).

> NO POPSQL, use command line.

+ **FUNCTIONS.** age()
+ **PROCEDURES.**castingActors().
+ **TABLES**. casting and acting tables.
+ **VIEWS.** 

````sql
SELECT * FROM actors
WHERE actor_weight = var_character_weight
AND age(actor_birthdate) = var_character_age;

--

SELECT *
FROM actors_view
WHERE actor_weight = var_character_weight
AND actor_age = var_character_age;
````