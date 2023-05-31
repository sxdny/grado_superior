tags:: #repaso_examen #sin #subnetting

# Repaso Examen Subnetting

[[actividadesRepaso_subnetting]]

## Clases de IPs

| Clase   | Rango                       |
| ------- | --------------------------- |
| Clase A | 0.0.0.0 - 127.255.255.255   |
| Clase B | 128.0.0.0 - 191.255.255.255 |
| Clase C | 192.0.0.0 - 223.255.255.255 |
| Clase D | 224.0.0.0 - 239.255.255.255 |
| Clase E | 240.0.0.0 - 255.255.255.255 |

## Rango de direcciones IP privadas.

- 10.0.0.0 -  10.255.255.255
- 172.16.0.0 - 172.31.255.255
- 192.168.0.0 - 192.168.255.255

## Realización de un ejercicio.

Teniendo en cuenta la siguiente IP: 192.168.1.0  / 24, determinar la cantidad de 4 subredes y determinar la cantidad de Host por subred. Crear 4 subredes con la IP 192.168.1.0.

1. Saber que la máscara `/24` nos dice que hay 3 octetos para la parte de red.

La máscara `/24` en decimal es: `255.255.255.0`.

Esto en binario es igual a: `11111111.11111111.11111111.00000000`.

2. Saber la siguiente fórmula:

$$\Huge 2^n - 2 \ge cantidad\; de \; subredes $$ 
En esta caso la  cantidad de subredes es `4`, por lo que la fórmula quedaría:

$$\Huge 2^n - 2 \ge 4 $$
Necesitaremos $n$ bits de host para superar (o igualar) la cantidad de subredes que nos solicitan. En este caso, el valor mínimo de $n$ es `3`.

$$\Huge2^3 - 2 = 6$$
$\Large n$ significa que vamos a usar $n$ bits de la parte de host. Por lo que la **nueva máscara de red** quedaría de la siguiente manera:

$$\Large 11111111.11111111.11111111.(111)00000$$
Esto en decimal es igual a:

$$\Huge 255.255.255.224$$

3. Determinar los saltos de red que tendrán nuestras subredes (calcular el rango de la subred 1, de la subred 2, etc)

Para hacerlo (en una dirección IP clase C) aplicaremos la siguiente fórmula:

$$\Huge256 - último \; octeto \; en \; decimal$$

Por lo que en este caso quedaría de la siguiente manera:

$$\Large256 - 224 = 32$$

Esto significa que los **rangos de red** irán de 32 en 32.

4. Determinar la cantidad de hosts por subred.

Lo calcularemos con la siguiente fórmula:

$$\Large 2^m - 2 = H$$
*La $H$ significa la cantidad de hosts.*
*La $m$ es la cantidad de bits disponibles que tenemos en la parte de host (los 0s)*

Por lo que la formula quedaría de la siguiente manera:

$$\Large 2^5 - 2 = 30$$

Esto significa que nuestras subredes tendrán $30$ equipos como máximo en cada una de ellas.

4. Hacer la tabla final de direcciones.

| Nº de red | Subred       | Primer IP utilizable | Ultima IP utilizable | Broadcast     |
| --------- | ------------ | -------------------- | -------------------- | ------------- |
| 1         | 192.168.1.0  | 192.168.1.1          | 192.168.1.30         | 192.168.1.31  |
| 2         | 192.168.1.32 | 192.168.1.33         | 192.168.1.62         | 192.168.1.63  |
| 3         | 192.168.1.64 | 192.168.1.65         | 192.168.1.94         | 192.168.1.95  |
| 4         | 192.168.1.96 | 192.168.1.97         | 192.168.1.126        | 192.168.1.127 |

Con esto, podremos contestar a cualquier de las preguntas que nos hagan.

32 que es el maximo de octetos - 10 que es lo que necesitamos =  22 (1s) y el resto a 0s

32 (importante)