# 👩‍💻 Tema 1: Arquitectura de ordenadores.

## 🔢 Sistemas de Numeración.

| Base 10 o Sistema Decimal | Base 16 o Sistema Hexadecimal | Base 8 o Sistema Octal | Base 2 o Sistema Binario |
| ------------------------- | ----------------------------- | ---------------------- | ------------------------ |
| 0                         | 0                             | 1                      | 0                        |
| 1                         | 1                             | 2                      | 1                        |
| 2                         | 2                             | 3                      |                          |
| 3                         | 3                             | 4                      |                          |
| 4                         | 4                             | 5                      |                          |
| 5                         | 5                             | 6                      |                          |
| 6                         | 6                             | 7                      |                          |
| 7                         | 7                             |                        |                          |
| 8                         | 8                             |                        |                          |
| 9                         | 9                             |                        |                          |
|                           | A                             |                        |                          |
|                           | B                             |                        |                          |
|                           | C                             |                        |                          |
|                           | D                             |                        |                          |
|                           | E                             |                        |                          |
|                           | F                             |                        |                          |

En el ==Sistema Hexadecimal==, a partir de la letra A tiene un valor de 10, la letra B un valor de 11 y así hasta llegar a la letra F, la cuál tiene un valor de 15.

### Convertir a base 10.

#### De base 2 a base 10.

Para ello multiplicaremos los números de izquierda a derecha por $2^ n$, donde $n$ és el número de posiciones que contiene el número.

Por ejemplo, tenemos el siguiente número:

$$10011101(base2)$$

Luego el número se divide de izquierda a derecha. El primer $1$ de la derecha, tendrá una posición de $0$, luego el siguiente 0 tendrá una posición de $1$ y así hasta el último $1$, que su posición tendrá un valor de $7$.

Teniendo en cuenta esto, cada número se multiplicará por $2$ elevado a su posición. Este sería su resultado (ahora multiplicando de derecha a izquierda):

$$1 * 2^7 + 0 * 2^6 + 0 * 2^5 + 1 * 2^4 + 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0$$

*Podemos quitar los ceros para que sea más visible:*

$$(1 * 128) + (1 * 16) + (1 * 8) + (1 * 4) + 1 = 157(base10)$$

#### De base 16 a base 10.

Realizeremos el mismo procedimiento que pasar de base 2 a base 10 pero reemplazamos el $2^n$ por $10^n$

Ejemplo:
$$3AD(base16)$$ $$3 * 16^2 + 10 * 16^1 + 13 * 16^0$$
$$(3 * 256) + (10 * 16) + (13 * 1) = 768 + 160 + 13 = 941(base10) $$

#### De base x a base 10.

En general, siempre seguiremos el mismo método para pasar de cualquier base a base 10. Haremos el mismo procedimento que los 2 casos anteriores, multiplicando $base * posicion$. Si queremos pasar de base 4 a base 10, haremos $x * 4^n$ hasta que $n$ sea 0 y así en todos los casos.

Importante recordar que si tenemos números decimales en el número que queremos pasar a base 10 (como por ejemplo el $100010.10$) se hace un $base * -posicion$. En este caso, el 1 de la parte decimal se multiplicaria por $2^{-1}$ y el 0 por $2^{-2}$ . Se entiende muy fácilmente.

### Convertir a base 7.

#### De base 10 a base 7.

En este caso, cono la base destino (base 7) es más pequeña, lo que tendremos que hacer será dividir el número en base 10 entre 7, ya que en este caso lo estamos pasando a base 10 y luego almacenamos los restos para que cuando ya no se pueda dividir más( que el número en base 10 sea más pequeño que el 7 en este caso), los cojemos del último al primero y así, formaremos el número en base 7.

Ejemplo:
$$317_{base10}$$
$$317 / 7 = 45 + 2 ➡ 45 / 7 = 6 + 3 ➡ + 6 $$
Arriba, el + ==2== y el + ==3== representan los restos de las divisiones, 317 / 7 = 45 y 45 / 7 = 6 y el ==6==, como es menor que 7, lo cojeremos como último número.

Para formar el número, iremos cojiendo los números del último (6) al primero (2). El resultado seria:
$$637_{base7}$$
Si tenemos un número con una parte fraccionaria (número con decimales), en vez de dividir, multiplicaremos. Por ejemplo, si le añadimos una parte fraccionaria al anterior número:
$$317.25_{base10}$$
El procedimiento sería el mismo para la parte decimal (317), pero después para multiplicar, cojoremos la parte fraccionaria con un 0. delante (0.25) y lo iremos multiplicando:
$$0.25 * 2 = 0.50 + 0 ➡ 0.50 * 2 = 1.00 + 1 ➡ 0$$
En este caso, los números que cojeremos para formar el resultado final serán las partes decimales de los números resultado (del resultado de 0.25 x 2, que es 0.50, cojeremos el 0), después el 0.50 lo multiplicaremos otra vez por 2 y como resultado nos dará 1.00. Finalemente cojeremos la parte decimal del resultado, que es el 1, y *como al cojer la parte decimal del número, este se sustituye por un 0*, nos quedaría un 0.00 (hemos terminado).

Tenemos que tener en cuenta de que como mucho cojeremos 5 - 7 números decimales y si se repiten, los marcamos con su respectivo signo. También tendremos que *sumar* la parte decimal con la parte fraccionaria.

### Convertir a base 16.

#### De base 10 a base 16.

Para hacerlo, seguiremos el mismo procedimiento de antes (dividiremos en la parte decimal y en la parte fraccionaria, multiplicaremos).

Es ==importante== convertir los números de base 10 a base 16, tanto en la parte decimal como en la parte fraccionaria. El 10 -> A, el 11 -> B, etc.

### Convertir a base diferente a 10.

#### De base b a b.

Cuando ninguna de las bases son 10, ni la a convertir como la destino, usaremos la base 10 como base intermedia. Así usaremos ambos métodos anteriores, el TFN y el método de la división entera.

Ejemplo:
$$232.1_{base4} ➡ _{base6}$$
Lo primero que tendremos que hacer, será pasar el 232.1 a base 10. Para ello, haremos el siguiente procedimento:
$$232.1_{base10} = 2 * 4^2 + 3 * 4^1 + 2 * 4^0 + 1 * 4^{-1}$$
$$2 *16 + 3 * 4 + 2 * 1 + 1 * 0.25 = 46.25{base10}$$
Ahora que lo tenemos en base 10, lo pasamos a base 6, con el método de división entera:
$$46 / 6 = 7 + 4 ➡ 7 / 6 = 1 + 1 ➡ + 1 = 114_{base6}$$
$$(0.25 * 6 =  1.5 = 0.5 + 1) ➡ (0.5 * 6 = 3 = 0 + 3) = 0.13_{base6}$$
$$114_{base6} + 0.13_{base6} = 114.12_{base6}$$
Y así de fácil podremos convertir una base que no sea 10 a otra que tampoco sea 10.

### Convertir de base $b$ a $b^n$.



