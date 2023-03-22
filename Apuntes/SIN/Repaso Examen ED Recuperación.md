# 👩‍💻 Tema 1: Arquitectura de ordenadores.

## 🖋 Cheat sheet de LaTeX.

### Imagen 1:

![[Pasted image 20230316180716.png]]

### Imagen 2:

![[Pasted image 20230316180734.png]]

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

$$\Huge10011101(base2)$$

Luego el número se divide de izquierda a derecha. El primer $1$ de la derecha, tendrá una posición de $0$, luego el siguiente 0 tendrá una posición de $1$ y así hasta el último $1$, que su posición tendrá un valor de $7$.

Teniendo en cuenta esto, cada número se multiplicará por $2$ elevado a su posición. Este sería su resultado (ahora multiplicando de derecha a izquierda):

$$\Large1 \times 2^7 + 0 \times 2^6 + 0 \times 2^5 + 1 \times 2^4 + 1 \times 2^3 + 1 \times 2^2 + 0 \times 2^1 + 1 \times 2^0$$

*Podemos quitar los ceros para que sea más visible:*

$$\Large(1 \times 128) + (1 \times 16) + (1 \times 8) + (1 \times 4) + 1 = 157(base10)$$

#### De base 16 a base 10.

Realizeremos el mismo procedimiento que pasar de base 2 a base 10 pero reemplazamos el $2^n$ por $10^n$

Ejemplo:
$$\Huge3AD(base16)$$ $$\Huge3 \times 16^2 + 10 \times 16^1 + 13 \times 16^0$$
$$\Large(3 \times 256) + (10 \times 16) + (13 \times 1) = 768 + 160 + 13 = 941(base10) $$

#### De base x a base 10.

En general, siempre seguiremos el mismo método para pasar de cualquier base a base 10. Haremos el mismo procedimento que los 2 casos anteriores, multiplicando $base * posicion$. Si queremos pasar de base 4 a base 10, haremos $x * 4^n$ hasta que $n$ sea 0 y así en todos los casos.

Importante recordar que si tenemos números decimales en el número que queremos pasar a base 10 (como por ejemplo el $100010.10$) se hace un $base * -posicion$. En este caso, el 1 de la parte decimal se multiplicaria por $2^{-1}$ y el 0 por $2^{-2}$ . Se entiende muy fácilmente.

### Convertir a base 7.

#### De base 10 a base 7.

En este caso, cono la base destino (base 7) es más pequeña, lo que tendremos que hacer será dividir el número en base 10 entre 7, ya que en este caso lo estamos pasando a base 10 y luego almacenamos los restos para que cuando ya no se pueda dividir más( que el número en base 10 sea más pequeño que el 7 en este caso), los cojemos del último al primero y así, formaremos el número en base 7.

Ejemplo:
$$\Huge317_{base10}$$
$$\Large 317 / 7 = 45 + 2 ➡ 45 / 7 = 6 + 3 ➡ + 6 $$
Arriba, el + ==2== y el + ==3== representan los restos de las divisiones, 317 / 7 = 45 y 45 / 7 = 6 y el ==6==, como es menor que 7, lo cojeremos como último número.

Para formar el número, iremos cojiendo los números del último (6) al primero (2). El resultado seria:
$$\Huge637_{base7}$$
Si tenemos un número con una parte fraccionaria (número con decimales), en vez de dividir, multiplicaremos. Por ejemplo, si le añadimos una parte fraccionaria al anterior número:
$$\Huge317.25_{base10}$$
El procedimiento sería el mismo para la parte decimal (317), pero después para multiplicar, cojoremos la parte fraccionaria con un 0. delante (0.25) y lo iremos multiplicando:
$$\Large0.25 \times 2 = 0.50 + 0 \to 0.50 \times 2 = 1.00 + 1 \to 0$$
En este caso, los números que cojeremos para formar el resultado final serán las partes decimales de los números resultado (del resultado de 0.25 x 2, que es 0.50, cojeremos el 0), después el 0.50 lo multiplicaremos otra vez por 2 y como resultado nos dará 1.00. Finalemente cojeremos la parte decimal del resultado, que es el 1, y *como al cojer la parte decimal del número, este se sustituye por un 0*, nos quedaría un 0.00 (hemos terminado).

Tenemos que tener en cuenta de que como mucho cojeremos 5 - 7 números decimales y si se repiten, los marcamos con su respectivo signo. También tendremos que *sumar* la parte decimal con la parte fraccionaria.

### Convertir a base 16.

#### De base 10 a base 16.

Para hacerlo, seguiremos el mismo procedimiento de antes (dividiremos en la parte decimal y en la parte fraccionaria, multiplicaremos).

Es ==importante== convertir los números de base 10 a base 16, tanto en la parte decimal como en la parte fraccionaria. El 10 -> A, el 11 -> B, etc.

### Convertir a base diferente a 10.

#### De base b a b.

Cuando ninguna de las bases son 10, ni la a convertir ni la destino, usaremos la base 10 como base intermedia. Así usaremos ambos métodos anteriores, el TFN y el método de la división entera.

Ejemplo:
$$\Huge232.1_{base4} ➡ _{base6}$$
Lo primero que tendremos que hacer, será pasar el 232.1 a base 10. Para ello, haremos el siguiente procedimento:
$$\Large232.1_{base10} = 2 \times 4^2 + 3 \times 4^1 + 2 \times 4^0 + 1 \times 4^{-1}$$
$$\Large 2 \times 16 + 3 \times 4 + 2 \times 1 + 1 \times 0.25 = 46.25{base10}$$
Ahora que lo tenemos en base 10, lo pasamos a base 6, con el método de división entera:
$$\Large46 / 6 = 7 + 4 ➡ 7 / 6 = 1 + 1 ➡ + 1 = 114_{base6}$$
$$\Large(0.25 \times 6 =  1.5 = 0.5 + 1) ➡ (0.5 \times 6 = 3 = 0 + 3) = 0.13_{base6}$$
$$\Large114_{base6} + 0.13_{base6} = 114.12_{base6}$$
Y así de fácil podremos convertir una base que no sea 10 a otra que tampoco sea 10.

### Convertir de base $b$ a $b^n$.

El cambio de base $b$ a $b^n$ es directo porqué un dígito en base $b^n$ se corresponde a $n$ dígitos en base $b$.

#### De base 2 a base 16.

Si queremos pasar de base 2 a base 16, solo tendremos que separar los diferentes dígitos del número en base 2 en grupos de 4. Ejemplo:
$$\Large10010110.01101101_{base2}$$
$$\Large1001|0110|.|0110|1101$$
Si convertimos los diferentes grupos en números hexadecimales, quedaria de la siguiente manera:
$$1001 = 9 + 0110 = 6 + 0110 = 6 + 1101 = 13 \to D$$
El resultado seria el siguiente:
$$\Huge96.6D_{base16}$$
Es importante tener en cuenta de que si faltasen espacios al separar los dígitos en grupos de 4, añadiriamos 0s para que queden todos iguales.

#### De base 2 a base 8.

El proceso es exactamente igual que el anterior, pero en vez de separar en grupos de ==4==, lo separamos en grupos de ==3==.

#### De base 16 o 8 a base 2.

Si queremos pasar un números de base 16 o base 8 a base 2, lo único que tendremos que hacer será hacer el método inverso. Ejemplo:
$$\Huge E1B2.4F_{base16} \to  _{base2}$$
$$E = 1110 + 1 = 0001 + B = 1011 + 2 = 0010 + 4 = 0100 + F = 1111$$
El resultado final seria el siguiente:
$$\Large1110000110110010.01001111_{base2}$$

## ➕ Suma y resta en binario.

### Suma.

#### Resultado de las sumas en binario.

0 + 0 = 0 y no me llevo ninguna.
0 + 1 = 1 y no me llevo ninguna.
1 + 0 = 1 y no me llevo ninguna.
1 + 1 = 0 y me llevo 1.

==Importante== siempre realizar las operaciones de arriba a abajo.

### Resta.

#### Resultado de las restas en binario.

0 - 0 = 0 y no llevo ninguna.
0 - 1 = 1 y me llevo 1.
1 - 0 = 1 y no me llevo ninguna.
1 - 1 = 0 y no me llevo ninguna.

## 💻 Representació de nombres en un computador.

### Números naturales.

Son los números sin parte fraccionaria y sin signo (son los números 1, 2, 3, 4, 5, 6...)

### Números enteros.

Son los números que contienen signos y NO tienen parte fraccionaria (son los -5, -4, -3, -2, -1, 0, +1, +2, +3...)

### Representación en Signo Magnitud.

En el signo magnitud, el bit más significativo será el encargado de almacenar el signo y el resto codifica la magnitud. Un 1 en el dígito más significativo representará el signo - (negativo) y el número 0, representará el signo + (positivo).

Por ejemplo, si tenemos el siguiente número:
$$\Huge101001_{base2}$$
Sabemos que es un número negativo, porqué el primer dígito de este es el número 1 y la magnitud es 01001, que en $\Large_{base10}$ es 9.

#### De base 10 a Signo Magnitud.

Para representar, por ejemplo, el $-12_{base10}$ en **signo magnitud**, con 6 dígitos y $\Large_{base2}$, seguiremos los siguientes pasos:

1. Tenemos que pasar  la magnitud $12_{(10}$  a base 2:
$$\Large 12_{(10} \to 1100_{(2}$$
2. Después le añadimos dos 0s, porqué el número en base 2 no llega a los 6 dígitos:
$$\Large 001100_{(2}$$
3. Finalmente, ponemos el bit más significativo a 1 (el primer dígito de la izquierda):
$$\Large 101100_{(SM2}$$
Si tenemos el número $+12$, en el paso `2`, no hará falta cambiar el signo, ya que al convertirlo ya será positivo:
$$\Large 12_{(10} \to 001100_{(SM2}$$

### Representación en Complemento a 2.

Los números positivos en CA2 se codifican de la misma manera que en el signo magnitud, el bit más signiticativo es 0 y el resto contiene la magnitud.

La codificación con un número negativo $-X$ en Ca2 és el resultado ==en binario== de la operación: ==La $\Large n$ significará en cuantos bits queremos codificar el número.== 
$$\Large 2^n - X$$
La $X$ es el valor absoluto de $X$. El valor absoluto de un número es cambiarle el signo de negativo a positivo (siempre será positivo o 0).

Ejemplo, el número $-11010_{(2}$ el es la $X$:
$$\Large 2^6 - |X| = 1000000_{(2} - 11010_{(2} = 100110_{(Ca2}$$ 
### Cambio de signo en Complemento a 2.

Para hacer el cambio de signo de un nombre en Ca2, seguiremos los siguientes pasos:

1. Hacer el complemento bit a bit de la codificación en Ca2.
2. Sumar 1 bit al menos significativo de la codificación (al número de más a la derecha).

Ejemplo:

Para hacer el cambio de signo del valor númerico $11000110_{(2}$ seguiremos los 2 siguientes pasos:

1. Cambiar unos por ceros y ceros por unos en el valor inicial:
$$\Large 11000110_{(Ca2} \to 00111001_{(Ca2}$$
2. Le sumamos un más 1 al complemento bit a bit.
$$\Large 00111001_{(2} + 1 = 00111010_{(Ca2}$$

### Magnitud dels nombres en Complement a 2.

En esta caso, se aplicará el TFN para saber la magnitud decimal de un nombre positivo codificado en Ca2:
$$\Large0101_{(2} = 0 \times 2^3 + 1 \times 2^2 + 0 \times 2^1 + 1 \times 2^0 = +5_{(10}$$

## 🔌 Puertas lógicas.

Las operaciones booleanas són:

1. **Negación o NOT**. Niega el valor de una variable $x$.
2. **Multiplicación lógica o AND.** Multiplica el valor de una variable con otra.
3. **Suma lógica o OR**. Suma el valor de una variable con otra.
4. **NAND.** Es la negación de AND.
5. **NOR.** Es la negación de OR.
6. **O exclusiva o XOR**. Si las dos variables son iguales, el valor será 0 y si son diferentes,  el valor será 1.

Cada una de las operaciones booleanas tienen su respectivo signo. Para verlos, consulte este [enlace](https://es.wikipedia.org/wiki/Puerta_l%C3%B3gica) 





