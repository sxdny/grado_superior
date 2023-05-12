# Ejercicios subnetting

Sidney Silva Braz de Oliveira - 1º DAW

###### Ejercicio 18.

Donada aquesta IP de xarxa: 137.101.0.0, si necessitem 520 hosts per subxarxa: 

**a) Quants bits es manlleven?**

Nos llevamos **10 bits para la parte de host.**

$$
	\Large 2^{10} = 1024 - 2 = 1022
$$

**b) Quina és la màscara de subxarxa?** 

La máscara de subred es **255.255.0.0**

**c) Especifica els rangs d’adreces IP per a cada subxarxa a la següent taula. Fes-ho per les 8 primeres subxarxes a la taula (amb binari i decimal).** 

**d) Calcula el rang d’IPs en decimal i binari per a la subxarxa 21.** 

|                                        | **Binari**                          | **Decimal**   |
| -------------------------------------- | ----------------------------------- | ------------- |
| **Adreça IP xarxa inicial**            | 10001001.00000000.00000000.00000000 | 137.0.0.0     |
| **Màscara de subxarxa inicial**        | 11111111.11111111.00000000.0000000  | 255.255.0.0   |
| **Nova màscara de subxarxa.**          | 11111111.11111111.11111100.00000000 | 255.255.252.0 |
| **Subxarxa 1: adreça IP de subxarxa.** | 10001001.00000000.00000100.00000000 | 137.0.4.0     |
| **Subxarxa 1: adreça IP de difusió.**  | 10001001.00000000.00000111.11111111 | 137.0.7.255   |
| **Subxarxa 2: adreça IP de subxarxa.** | 10001001.00000000.00001000.00000000 | 137.0.8.0     |
| **Subxarxa 2: adreça IP de difusió.**  | 10001001.00000000.00001011.11111111 | 137.0.11.255  |
| **Subxarxa 3: adreça IP de subxarxa.** | 10001001.00000000.00001100.00000000 | 137.0.12.0    |
| **Subxarxa 3: adreça IP de difusió.**  | 10001001.00000000.00001111.11111111 | 137.0.15.255  |
| **Subxarxa 4: adreça IP de subxarxa.** | 10001001.00000000.00010000.00000000 | 137.0.16.0    |
| **Subxarxa 4: adreça IP de difusió.**  | 10001001.00000000.00010011.11111111 | 137.0.19.255  |
| **Subxarxa 5: adreça IP de subxarxa.** | 10001001.00000000.00010100.00000000 | 137.0.20.0    |
| **Subxarxa 5: adreça IP de difusió.**  | 10001001.00000000.00010111.11111111 | 137.0.23.255  |
| **Subxarxa 6: adreça IP de subxarxa.** | 10001001.00000000.00011100.00000000 | 137.0.24.0    |
| **Subxarxa 6: adreça IP de difusió.**  | 10001001.00000000.00011111.11111111 | 137.0.27.255  |
| **Subxarxa 7: adreça IP de subxarxa.** | 10001001.00000000.00100000.11111111 | 137.0.28.0    |
| **Subxarxa 7: adreça IP de difusió.**  | 10001001.00000000.00100011.11111111 | 137.0.31.255  |
| **Subxarxa 8: adreça IP de subxarxa.** | 10001001.00000000.00100100.00000000 | 137.0.32.0    |
| **Subxarxa 8: adreça IP de difusió.**  | 10001001.00000000.00100111.11111111 | 137.0.35.255  |
| **Subxarxa ==21==: adreça IP de subxarxa.** | 10001001.00000000.01010100.00000000 | 137.0.84.0    |
| **Subxarxa ==21==: adreça IP de difusió.**  | 10001001.00000000.01010111.11111111 | 137.0.87.255  |                                       |                                     |               |





