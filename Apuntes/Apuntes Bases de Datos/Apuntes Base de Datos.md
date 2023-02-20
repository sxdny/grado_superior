[Enlaçe a Repasomenorca.](https://repasomenorca.es/)

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

-- TRIGGERS

DROP TRIGGER IF EXISTS tr_ins_char;
DROP TRIGGER IF EXISTS tr_up_char;

CREATE TRIGGER tr_inr_char
BEFORE INSERT ON characters
FOR EACH ROW -- for multiple rows
-- code that we want to run
SET NEW.character_name = UPPER(NEW.character_name); -- new data that is going to be inserted

-- OLD the old data of the table.

CREATE TRIGGER tr_up_char
BEFORE UPDATE ON characters
FOR EACH ROW
SET NEW.character_name = LOWE(NEW.character_name);

-- WHEN DELETING, the NEW.x is NOT AVAILABLE, only the OLD one.
-- WHEN UPDATING, both NEW.x and OLD.x are available.
-- WHEN INSERTING, only NEW.x is available, because there's no OLD data.
````

## Create these two tables on the Procedure:

### Casting table.

Casting trigger:

````sql
CREATE TRIGGER tr_inr_ishired
AFTER UPDATE ON casting
FOR EACH ROW
--
IF NEW.is_hired = 1 THEN
	INSERT INTO acting
	SELECT * FROM casting
	WHERE is_hired = 1;

````

Trigger function in this table.

| movie_id | character_id | actor_id | expected_salary | casting_order | is_hired | agreed_salary |
| -------- | ------------ | -------- | --------------- | ------------- | -------- | ------------- |
| 17       | 3            | 6        | 1.0             | 3             | FALSE    | NULL          |
| 17       | 3            | 11       | 1.5             | 1             | TRUE     |               |
| 17       | 3            | 12       | 3.0             | 2             | FALSE    | NULL          |

### Acting table.

When **is_hired** == 1, insert that actor in actin table:

| movie_Id | character_Id | actor_id | paid_salary |
| -------- | ------------ | -------- | ----------- |
| 17       | 3            | 11       | 1.0         |

## 📓 2023-02-20

### 1. Aggregate functions SUM(), COUNT() AVG() combined with the GROUP BY.

**actors_view**
* height, weight, age.
**characters**
* height, weight, age.
**casting**
* expected_salary, negotiated_salary.
**acting**
* payed_salary

[W3Schools | GROUP BY](https://www.w3schools.com/sql/sql_groupby.asp)

The `GROUP BY` statement is often used with aggregate functions (`COUNT()`, `MAX()`, `MIN()`, `SUM()`, `AVG()`) to group the result-set by one or more columns.

Average actor_age from VIEW:

````sql
SELECT FLOOR(AVG(actor_age)) AS average_actor_age FROM actors_view
````

> The `GROUP BY` is used like a For each.

Salary difference between expected_salary and agreed-salary:

````sql
SELECT (SUM(expected_salary) - SUM(agreed_salary)) AS salary_difference
FROM casting
GROUP BY actor_id
````
