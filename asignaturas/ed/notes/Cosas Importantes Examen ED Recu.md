tags:: #repaso_examen

# Cosas importantes para el examen de Recuperación de ED.

## Git.

Generar una ssh key:

````bash
ssh-keygen -t ed25519 -f nombre_clave
````

Luego la añadimos a la **cuenta de Github** y después en la terminal, en el mismo lugar donde está la clave ssh, usaremos el comando:

````shell
ssh-add nombre_archivo_clave
````

**No hacer con el archivo .pub.**

Luego, para comprobar que esto funciona:

````cmd
ssh -T git@github.com
Hi devsidney! You've successfully authenticated, but GitHub does not provide shell access.
````

## Diagrama de clases.

Para crear un objeto en un diagrama de clases, crearemos una tabla donde arriba pondremos el nombre del objeto, abajo de este los atributos y por último, los métodos que tiene este objeto.

Un ejemplo sería el siguiente:

![[exampleDiagram.svg]]

En este caso, la clase Persona es una superclase y de ella, pueden surgir otras subclases como Policia, Futbolista, Alumno, etc:

![[example2.svg]]

### Significado de los diferentes símbolos.

- +. Público. Todo el mundo puede acceder.
- -. Privado. Solo la misma clase puede acceder al atributo.
- '#'. Protegido. Solo puede acceder la misma clase o subclase. 
- ~. Paquete. Solo las clases que estén dentro del mismo paquete / misma carpeta pueden acceder.

### Relaciones.

- Herencia. Es la relación con un objeto más general con un objeto más específico, como puede ser Persona(general) y Alumno(específico).
- Agregación. Es cuando diferentes elementos forman uno solo, como cuando un grupo de instrumentos forman una orquesta. En esta relación, los instrumentos en este caso pueden existir sin la necesidad de la orquesta.
- Asociación. Es cuando un objeto tiene una relación con otro. Por ejemplo, puede haber una relación entre la clase Coche y Persona, porqué una persona puede o tener 1 o varios coches o no tener ninguno y un coche puede tener 1 o más propietarios.
- Composición. Es cuando los objetos que forman parte de la composición no pueden formar parte de otra. Por ejemplo, cuatro patas y una tabla pueden formar una mesa pero por sí solos no son nada.
- Dependencia. Es la relación que muestra la relación entre dos objetos.

Resumen de las diferentes relaciones de la más débil a la más fuerte:

![[Pasted image 20230325104423.png]]