<h1 align="center">Actividad DHCP</h1>

<p align="center">Actividad Instalación DHCP, configuración, etc</p>

---

## Instalación del servicio DHCP.

Para instalar el servicio DHCP en nuestro servidor Windows Server 2022, primero tendremos que abrir el `Administrador del Servidor`. Lo podremos abrir desde la barra de búsqueda o desde el Panel principal.

![[Pasted image 20230522155024.png]]
*Abrimos la aplicación desde la barra de búsqueda.*

Una vez lo tengamos abierto, nos dirigiremos a la parte superior derecha del panel y haremos clic sobre `Administrar` > `Agregar roles y características.`

![[Pasted image 20230522155149.png]]
*Agregar roles y características.*

Cuando lo hayamos abierto, nos aparecerá una ventana como esta:

![[Pasted image 20230522155242.png]]

Aquí, dejaremos marcada la opción `Instalación basada en características o en redes` y le daremos a `Siguiente`. Haremos lo mismo con la siguiente ventana que nos aparezca.

![[Pasted image 20230522160024.png]]

En la proxima ventana, buscaremos la casilla donde ponga `Servidor DHCP` y la marcaremos. Al hacerlo, nos aparecerá una ventana; en ella, haremos clic en `Agregar características` y le daremos a `Siguiente`.

![[Pasted image 20230522160229.png]]
*Casilla `Servidor DHCP` y ventana de `Agregar características`.*

![[Pasted image 20230522160354.png]]
*Botón `Siguiente`*.

A continuación, nos aparecerá otra ventana. En este, dejaremos todo tal como está y le daremos a `Siguiente`.

![[Pasted image 20230522160503.png]]

Haremos lo mismo con la siguiente ventana:

![[Pasted image 20230522160634.png]]

Finalmente, nos aparecerá una última ventana, donde solo nos quedará darle a `Instalar`.

![[Pasted image 20230522160745.png]]

Esperamos que se instalae el servicio y le daremos a `Cerrar`.

![[Pasted image 20230522161158.png]]

---

## Configuración prévia del servicio DHCP.

Cuando hayamos finalizado la instalación del sercio DHCP en nuestro servidor, nos aparecerá una alerta en el icono de notificaciones. Haremos clic sobre él y le daremos al botón de `Completar configuración de DHCP`.

![[Pasted image 20230522161503.png]]

Nos aparecerá la siguiente ventana. Le daremos a `Siguiente`.

![[Pasted image 20230522161541.png]]

En la siguiente ventana, dejaremos marcada la casilla `Usar las credenciales del siguiente usuario` y revisaremos que el usuaroi que nos detecta es un usuario Administrador del Servidor. Si no es así lo cambiaremos. En mi caso, lo dejaré igual.

Después, le daremos a `Confirmar`.

![[Pasted image 20230522161612.png]]

Una vez hecho esto, nos saldrá una ventana indicandonos que se han creado los grupos de seguridad y se ha autorizado el servidor DHCP. La daremos a `Cerrar` y así **ya tendremos configurado nuestro servidor DHCP.**

![[Pasted image 20230522161849.png]]

---

## Configuración del servicio DHCP.

Para empezar a usar nuestro servidio DHCP, nos dirigiremos al panel superior derecho del `Administrador del servidor` y haremos clic sobre `Herramientas` > `DHCP`.

![[Pasted image 20230522162230.png]]

Nos tendrá que salir una ventana como esta:

![[Pasted image 20230522162334.png]]

Ahora, abriremos el desplegable donde pone el nombre de nuestro servidor, hacemos clic sobre `IPv4` hacemos **clic derecho en este** y le damos a `Ámbito nuevo`.

![[Pasted image 20230522162536.png]]

En la próxima ventana le daremos a `Siguiente`.

![[Pasted image 20230522162836.png]]

A continuación, en la siguiente ventana proporcionaremos un **nombre** y una **descripción** para nuestro ámbito. Una vez hecho esto, le daremos a `Siguiente`.

![[Pasted image 20230522163030.png]]

En la siguiente ventana, introduciremos el intervalo de direcciones IP para nuestro ámbito. En mi caso, será desde la IP `192.168.1.150` hasta la `192.168.1.200`. Dejaremos el apartado de `Opciones de configuración que se propagan al cliente DHCP` igual y le damos a `Siguiente`.

![[Pasted image 20230522163421.png]]

En la próxima ventana, definiremos el rango de direcciones que queramos **excluir** (deben ser consecutivas). En mi caso, no excluiré ninguna IP y le daremos a `Siguiente`.

![[Pasted image 20230522163733.png]]

Nos saldrá otra ventana donde definiremos el tiempo que queremos que durén nuestras IPs en las máquinas clientes. En mi caso, lo dejaré todo igual y le damos a `Siguiente`.

![[Pasted image 20230522163844.png]]

En la siguiente ventana, dejaremos marcada la casilla `Configurar estas opciones ahora` para configurar las opciones DHCP del ámbito que estamos creando.

![[Pasted image 20230522164201.png]]

En la próxima ventana, introduciremos nuestra **ip de servidor** para establecerla como **puerta de enlaçe predeterminada** y le damos a `Agregar`. Cuando lo hayamos hecho, le daremos a `Siguiente`.

![[Pasted image 20230522164314.png]]

A continuación, dejaremos el **nombre de dominio** igual y después haremos clic sobre nuestra IP y la "subiremos" arriba de todo de todos los DNS que tengamos, para que sea la **siempre la primera opción.** Una vez hecho esto, le damos a `Siguiente`.

![[Pasted image 20230522164600.png]]

Después, en la siguiente ventana, podremos configurar un servidor **WINS**. En mi caso, como no tengo ninguno, lo dejaré todo tál como está y le daré a `Siguiente`.

![[Pasted image 20230522164740.png]]

Finalmente, en la siguiente ventana, dejaremos marcada la casilla `Activar este ámbito ahora` y le daremos a `Siguiente`.

En la siguiente ventana le daremos a `Finalizar`.

![[Pasted image 20230522164847.png]]

![[Pasted image 20230522164918.png]]

Con todo esto, nuestro servidor DHCP ya estará listo para proporcionar IPs a los clientes del servidor.

---

## Configuración del cliente para servidor DHCP.

En nuestra máquina cliente, abrimos la aplicación `Panel de control` para poder configurar la red.

![[Pasted image 20230522165319.png]]

![[Pasted image 20230522165340.png]]

Buscamos el icono `Redes e Internet`.

![[Pasted image 20230522165247.png]]

Entramos al apartado `Centro de redes y recursos compartidos.`

![[Pasted image 20230522165420.png]]

Una vez dentro, haremos clic sobre el botón `Ethernet (x)` del apartado de red que queramos configurar.

![[Pasted image 20230522165650.png]]

Dentro, le damos a `Propiedades.`

![[Pasted image 20230522165624.png]]

A continuación, puede que nos aparezca una ventana donde tengamos que introducir un usuario Administrador. Introduciremos las credenciales del usuario Administrador del servidor y le daremos a `Si`.

![[Pasted image 20230522165807.png]]

Buscamos la casilla de `Protocolo de Internet versión 4 (TCP/IPv4)`, le damos clic en ella y le damos a `Propiedades`.

![[Pasted image 20230522165936.png]]

En la siguiente ventana, marcaremos la casilla `Obtener una dirección IP automáticamente` y más abajo, en la casilla `Usar las siguientes direcciones de servidor DNS:` pondremos la IP del servidor.

![[Pasted image 20230522170248.png]]

Cuando hayamos hecho esto, solo nos quedará darle a `Aceptar` y ya tendremos nuestro cliente dentro del servidor DHCP.

![[Pasted image 20230522170441.png]]

---

## Reservar IPs en el servidor DHCP.

Para reservar IPs específicas a clientes, en el `Administrador del servidor`,  iremos a `Herramientas` > `DHCP`.

![[Pasted image 20230522170921.png]]

Una vez dentro, nos dirigiremos a `(nombre servidor) > IPv4 > Ámbito > Reservas`, le daremos clic derecho y haremos clic sobre `Reserva nueva..`

![[Pasted image 20230522171008.png]]

Antes, averiguaremos cuál es la dirección MAC de nuestro cliente. Para ello iremos a `Configuración > Redes e Internet > Adaptador red que queramos configurar`

![[Pasted image 20230522171406.png]]

Dentro, en el apartado **Propiedades** veremos nuestra dirección MAC.

![[Pasted image 20230522171542.png]]

De vuelta el Windows Server, rellenamos las casillas con un nombre de la reserva, dirección IP que queramos asignarle, la dirección MAC, una descripción y en `Tipos compatibles`, lo dejamos como está. Al finalizar, le damos a `Agregar` y después `Cerra`.

![[Pasted image 20230522171727.png]]

Ahora, si volvemos a nuestro cliente, veremos que se le asigna la IP que le hemos reservado correctamente.

![[Pasted image 20230522171948.png]]

---

## Exclusión de IPs en nuestro servidor DHCP.

Para excluir direcciones IPs en nuestro servidor DHCP, lo primero que tendremos que hacer, será ir al `Administrador del servidor > DHCP`.

![[Pasted image 20230522172631.png]]

Después nos dirigiremos a `(nombres del servidor) > Ámbito > Conjunto de direccoines`, le damos clic derecho y hacemos clic en `Nuevo intervalo de exclusión`.

![[Pasted image 20230522172812.png]]

Finalmente, en la siguiente ventana rellenamos las casillas con la dirección inicial y la final a excluir y le damos a `Agregar` y `Cerrar`.

![[Pasted image 20230522172906.png]]

Comprobamos que el cliente no coje una IP que está exclusiva.

![[Pasted image 20230522173339.png]]

---

## Asignación de una IP fija a cliente dentro de un rango de direcciones excluido.

Creamos una **nueva** reserva dentro del rango de direcciones excluidas.

![[Pasted image 20230522173554.png]]

Al hacerlo, si actualizamos la ip del cliente con `ipconfig /release` y `ipconfig /renew`, pasa lo siguiente.

![[Pasted image 20230522173731.png]]

Se le asigna una de las direcciones excluidas igualmente al cliente.

---

## Asignación de una IP fija a cliente dentro de un rango de direcciones NO excluido.

Creamos una nueva reserva con una IP fuera del rango excluido del ámbito.

![[Pasted image 20230522174140.png]]

Comprobación en el cliente.

![[Pasted image 20230522174239.png]]

La IP se asigna correctamente.

---

<p align="center">Sidney Silva Braz de Oliveira - 1º DAW</p>
<p align="center">ED  U7- Actividad DHCP</p>