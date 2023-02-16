## 1. WebApp 2 Database.

## 2. SQL VIEWS.

The views are used to show information from another tables. To hide some information from one table.

### Functions.

They have inputs and outputs. To call a function --> SELECT toPounds(weight_in_kg)

### Procedure.

Multiple functions, with inputs and outputs or not.

## 3. SQL TRIGGERS.

The triggers are defined at a table level. It will act on differente tables.

````sql
CREATE TRIGGER tr_table1_update
ON UPDATE
FOR EACH ROW

BEGIN

-- SQL code

END
````

## 4. DB.

| actors          | characters          | movies          | casting             |
| --------------- | ------------------- | --------------- | ------------------- |
| PK actor_id INT | PK character_id INT | PK movie_id INT | PK movie_id INT     |
|                 |                     |                 | PK character_id INT |
|                 |                     |                 | PK actor_id INT     |

## 5. "0" Exercise.

movie_title >> movies table
character_name >> characters table
actor_name >> actors table

> "The view has to be better than the original table". - Enrique

````sql
CREATE VIEW acting_view AS
SELECT movie_id, character_id, actor_id, salary, movie_title, character_name, actor_name
FROM acting
INNER JOIN movies ON acting.movie_id = movies.movie_id
INNER JOIN character ON acting.character_id = characters.character_id
INNER JOIN actor ON acting.actor_id = actors.actor_id

-- Then you call the VIEW

SELECT movie_title, character_name, actor_name
FORM acting_view
WHERE actor_id = 33; -- Por esto es importante implementarlo en la VIEW.
````

````sql
-- Improve actors table
CREATE VIEW actors_view AS
SELECT actor_id, actor_name, actor_birthdate, age(actor_birthdate) AS actor_age
FROM actors;
-- Name and age
SELECT actor_name, actor_age
FROM actors_view;
````