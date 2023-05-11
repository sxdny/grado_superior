tags:: #repaso_examen 

# Diseño de una Base de Datos.

## El ciclo de vida.

El ciclo de vida define y gestiona las diferentes etapas del desarrollo de un sistema de información.

Primeros pasaremos por la fase de **Planificación**, después la de **Análisis**, seguidamente con la de **Diseños**, la de **Implementación** y finalmente la de **Mantenimiento**. El orden no importa e incluso algunos pasos se saltan o se puede volver atrás de una fase anterior.

![[Pasted image 20230330091355.png]]

## Fases del diseño conceptual.

La fase de diseño conceptual en una base de datos es cuando elaboramos un diagrama Entidad / Relación para definir las diferentes entidades de nuestra base de datos y las relaciones que pueden haber entre ellas.

Un ejemplo seria el siguiente:

![[Diagrama Concesionario.svg]]

### ¡¡Cosas a tener en cuenta!!

1. Marcar correctamente los atributos.
2. Cuando existe una relación, marcarla con un rombo y ponerle un nombre a la relación (normalmente con un verbo)
3. Que se entienda el diagrama (no pasar lineas arriba de otra, etc).

## La normalización.

La normalización en una base de datos se usa para facilitar la manipulación de la base de datos y para minimizar la duplicidad de los diferentes datos. Puede resultar en crear más tablas.

La normalización **crea** nuevas tablas.

El objetivo principal es eliminar las redundancias (datos duplicados) y minimizar la gestión de la coherencia de los datos.

### Motivos para normalizar el diseño.

La normalización te obliga a entender completamente cada uno de los atributos que se tienen que representar en la base de datos.

Un esquema normalizado es robusto y suele tener muy pocas redundancias y produce bases e datos con esquemas flexibles que se pueden extender con facilidad.

### Proceso de normalización.

#### 1. Primera forma normal.

Una tabla está en primera forma normal si todos los atributos de la tabla son valores atómicos (valores que ya NO se pueden dividir).

Esta parte del proceso consta en coger una tabla totalmente desnormalizada y separar los atributos de la tabla hasta que no se puedan dividir más. Por ejemplo, si unos de los campos de la tabla incluye la dirección entera (calle, numero, ciudad, CP, etc) todo en un solo atributo, podemos dividirlo y crear otros campos (comp calle, numero_calle, ciudad, etc)

Ejemplo:

| DNI    | Nom  | Cognom | Adreça | Adreça | CP  | Matricula | Marca | Model | Potencia | Data | Preu |
| ------ | ---- | ------ | ------ | ------ | --- | --------- | ----- | ----- | -------- | ---- | ---- |
| 414444 | Joan | Pons   |        |        |     |           |       |       |          |      |      |

#### 2. Segunda forma normal.

Una tabla está en segundo forma normal si está en 1fn y si cada atributo que no forma parte de la clave primária, depende de la clave primaria. Que hay claves primarias y el resto de datos, dependen de las claves primarias.

En esta fase, se cogen los atributos que se puedan poner en otras tablas para reducir el tamaño. En el ejemplo anterior tenemos matricula, marca, modelo, etc. Todos estos atributos se pueden colocar en una nueva tabla llamada Coches:

| Matricula | Marca | Model | Potencia |
| --------- | ----- | ----- | -------- |

#### 3. Tercera forma normal.

Una tabla está en tercera forma normal si está en 2fn y si cada atributo que no sea clave primária, dependa de la clave primaria.

Finalmente en esta fase, haremos que dependan de la clave primária.

Ejemplo:

| CP  | Ciutat |
| --- | ------ |

En el cliente, dependemos solo de CP:
| DNI | Nom | Cognom | Adreça | ==CP== |
| --- | --- | ------ | ------ | ------ |

Después, en cuanto al modelo, tendriamos la siguiente tabla:
| Modelo | Marca | Potencia |
| ------ | ----- | -------- |

Y después para coche:
| Matricula | Model |
| --------- | ----- |


## La desnormalización.

La desmornalización deshace algunos cambios que se han hecho en la fase de normalización, mejora el rendimiento de la base de datos y racionaliza las consultas.

La desnormalización junta tablas.

#### Casos típicos de normalización.

1. Cuando sabemos que algo solo puede tener / pertenecer a 1 cosa (relacion 1:1).
2. Cuando sabemos, por ejemplo, que una universidad solo puede tener 3 vicerectores. Cuando sabemos a ciencia cierta que halgo solo puede tener como maximo esas 3 cosas.


