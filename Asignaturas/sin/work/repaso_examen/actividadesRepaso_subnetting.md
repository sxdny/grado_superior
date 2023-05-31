tags: #repaso_examen #sin #subnetting #actividades_repaso

# Actividades Repaso

**1. Cuál de las siguientes es una IP valida para una red LAN? Razona tu respuesta:**

- 10.216.15.8
- 172.16.10.2
- 192.168.15.2

La IP válida en este caso será la `192.168.15.2` ya que al ser de clase C, no se podrán conectar más de 256 equipos.

**2. Indica cuantos dispositivos se pueden conectar en cada una de las redes que tienen la siguiente máscara. Razona tu respuesta:**

- 255.255.255.0
- 255.255.0.0
- 255.0.0.0

Para calcularlo. utilizaremos la siguiente fórmula:

$$\Huge 2^n - 2 = x$$
Ahora, teniendo en cuenta la fórmula, contaremos cuántos bits tenemos disponibles:

- En la primera (`255.255.255.0`) tenemos disponibles para host `8` bits, ya que el último octeto está a 0. Por lo que si aplicamos la fórmula, nos dará como resultado que podremos conectar `254` dispositivos.
- En la segunda, tendremos 16 bits disponibles para host, por lo que el resultado sería: `65.634` dispositivos.
- Finalmente, el resultado de la tercera es: `16.777.214` dispositivos.

**3. Indica cuantas redes diferentes se pueden crear según cada una de las siguientes máscaras anteriores. Razona tu respuesta.**

Para saberlo, usaremos la siguientes fórmula:

$$\Huge 2^{(bits \; en \; red)}$$
Por lo que:

- En la primera máscara, podremos crear $2^{24}$ (que son los bits de red) que es igual a: `16.777.216` redes diferentes.
- En la segunda $2^{16}$ que es igual a: `65.636` redes diferentes.
- En la tercera $2^8 = 256$ redes diferentes.

**4. Teniendo en cuenta la IP del router y del servidor DNS, realiza la configuración de red de tres ordenadores a los que pertenecen:**

- IP router: 192.168.1.1
- Servidor DNS: 192.168.1.3

|                        | Ordenador 1   | Ordenador 2   | Ordenador  3  |
| ---------------------- | ------------- | ------------- | ------------- |
| IP                     | 192.168.1.2   | 192.168.1.3   | 192.168.1.4   |
| Máscara                | 255.255.255.0 | 255.255.255.0 | 255.255.255.0 |
| Puerta de enlace       | 192.168.1.1   | 192.168.1.1   | 192.168.1.1   |
| DNS                    | 192.168.1.3   | 192.168.1.3   | 192.168.1.3   |
| Dirección de red       | 192.168.1.0   | 192.168.1.0   | 192.168.1.0   |
| Dirección de broadcast | 192.168.1.255 | 192.168.1.255 | 192.168.1.255 |

**5. Indica si las siguientes IPs son validas y en caso de que lo sean, decir a que clase de red pertenecen, que máscara de red utilizarías y si se trata de una IP pública o privada.**

| IP             | Clase de red | Red Privada / Pública | Máscara de subred |
| -------------- | ------------ | --------------------- | ----------------- |
| 251.258.23.35  | -            | -                     | -                 |
| 47.25.36.14    | A            | Pública               | 255.0.0.0         |
| 3.21.25.41     | A            | Pública               | 255.0.0.0         |
| 125.369.65.21  | -            | -                     | -                 |
| 45.69.68.24    | A            | Pública               | 255.0.0.0         |
| 192.168.0.1    | C            | Privada               | 255.255.255.0     |
| 11.25.36.54    | A            | Pública               | 255.0.0.0         |
| 192.168.24.58  | C            | Privada               | 255.255.255.0     |
| 210.25.36.84   | C            | Pública               | 255.255.255.0     |
| 177.100.18.4   | B            | Pública               | 255.255.0.0       |
| 119.18.45.0    | A            | Pública               | 255.0.0.0         |
| 223.23.223.109 | C            | Pública               | 255.255.255.0     |
| 10.10.250.1    | A            | Privada               | 255.0.0.0         |
| 126.123.23.2   | C            | Pública               | 255.255.255.0     |
| 220.90.130.1   | C            | Pública               | 255.255.255.0     |

7. Hi ha 3 ordinadors anomentats, Host 1, Host 2 y Host 3 con las siguientes direcciones IP:

- 23.200.18.122
- 21.200.18.123
- 23.183.100.15

Este es bastante facilito culito de culito.

10. Un ordinador que pertany a la xarxa 200.200.200.192 / 27 (adreça de xarxa i màscara de xarxa en format barra, respectivament) té la següent taula d'enrutament:

![[Pasted image 20230528212140.png]]

Pasamos la IP de red a binario.

11001000.11001000.11001000.11111000

Después pasamos la máscara de red a binario.

11111111.11111111.11111111.11111000

Hacemos la operación AND:

11001000.11001000.11001000.1111100 = 200.200.200.248 (primera IP)

Para saber la de broadcast, pasamos los 0s de la parte de hosts a 1.

11001000.11001000.11001000.11111111 = 200.200.200.255

El rango de esta será: 200.200.200.249 - 200.200.200.254 (SI QUE ENTRA)

---

Pasamos la IP de red a binario

11001000.11001000.11001000.0100000

Pasamos la mascara a binario

11111111.111111111.11111111.11000000

Hacemos la operación AND:

11001000.11001000.11001000.01000000 = 200.200.200.64 (primera IP disponibles)

Ip de broadcast:

11001000.11001000.11001000.01111111 = 200.200.200. 127 (IP de broadcast)

Rango de ips disponibles: 200.200.200.65 - 200.200.200.126 (la segunda IP no entra aqui tampoco)

18. Dada la IP 137.101.0.0, si necesitamos 520 hosts para subred..

- Cuantos b  its nos llevamos?

$$\Huge 2^n - 2 = 2^{10} - 2 = 1022$$

En este caso, nos llevaremos 10 bits.

|                                   | Binari | Decimal       |
| --------------------------------- | ------ | ------------- |
| Direccion IP red inicial          |        | 137.101.0.0   |
| Marcara de subred inicial         |        | 255.255.0.0   |
| Nueva mascara de subred           |        | 255.255.252.0 |
| Subred 1 (direccion de red)       |        | 137.101.0.0   |
| Subred 1 (direccion de broadcast) |        | 137.101.3.255 |
| Subred 2 (direccion de red)       |        | 137.101.4.000 |
| Subred 2 (direccion de broadcast) |        | 137.101.7.255 |

Nueva mascara de subred = 32 - 10 = 22 (bits a 1) -> 11111111.11111111.11111100.00000000 = 255.255.252.0

Para saber la subred 1 -> 255 - 252 (ultimo octecto menos el primero de la nueva mascara de subred) -> 3