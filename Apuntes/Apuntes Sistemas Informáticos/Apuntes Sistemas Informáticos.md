# 🗞 Repaso Examen SIN.

## 📞 Comandos Linux.

### Copiar archivos y directorios

Para copiar archivos o directorios usamos el comando cp:

```shell
cp nombre_archivo o directorio_vacio
```

Si queremos copiar un directorio que contenga archivos u otras carpetas:

```shell
cp -R nombre_directorio
```

El resto de opciones las podemos encontrar con:

```shell
man cp
```

### Mover archivos y directorios.

Para mover archivos o directorios usaremos el comando mv:

```shell
mv nombre_archivo_o_directorio directorio_destino
```

Las mayoria de opciones de este comando son iguales que las del comando cp, menos las opciones -R y -p, ya que no tienen sentido en este comando.

### Comprimir y descomprimir archivos o directorios.

Para esto, usaremos el comando tar junto a sus opciones dependiendo si queremos comprimir o descomprimir.

Para comprimir un archivo, usaremos el comando:

```shell
tar -cf nombre_del_archivo directorio_o_archivo_a_comprimir
```

Si queremos comprimir el archivo en formato gzip:

```shell
tar -cfz nombre_del_archivo directorio_o_archivo_a_comprimir
```

Y para descomprimir:

```shell
tar -xf nombre_del_archivo_a_descomprimir destino
```

### Permisos de directorios y archivos.

Para ver los autores / dueños de tanto archivos como directorios, usamos el comando:

```shell
ls -l
```

![[Pasted image 20230208104627.png]]

Para cambiarlo, usaremos el siguiente comando:

```shell
sudo chown nuevo_dueño archivo_o_directorio.
```

Si queremos que el cambio se aplique tambien a todos los archivos y directorio de dentro de una carpeta, usamos la opción -R.

```shell
sudo chown -R nuevo_dueño directorio
```

![[Pasted image 20230208104917.png]]

Para cambiar un archivo o directorio de grupo, usamos el comando:

```shell
sudo chgrp nuevo_grupo archivo_o_directorio
```

También está la opción -R:

```shell
sudo chgrp -R nuevo_grupo directorio
```

Para asignar permisos a archivos o directorios, usaremos el comando chmod (solo el usuario root o el usuario administrador tienes permiso para usar este comando):

```shell
sudo chmod [opciones] permisos archivo
```

Los 3 permisos que existen son los siguientes:

- **r / read**. Permite leer o abrir archivos o listar el contenido del directorio.
- **w / write**. Permite modificar los archivos o el directorio.
- **x / execució**. Permite ejecutar el archivo o abrir la carpeta.

Teniendo en cuenta esto, podemos asignar permisos de la siguiente manera:

```shell
sudo chmod [rwx / r-x / -w- / etc] archivo_o_directorio
```

También podemos usar número:

```shell
sudo chmod [777 / 755 / 644 / etc] archivo_o_directorio
```

Para restablecer los permisos a los valores predeterminados, usamos el comando umask:

```shell
sudo umask valor
```

### Creación de enlaces.

Para crear enlaces en Linux, usamos el comando:

```shell
ln [opciones] archivo destino
```


## ⬇ Instalar Docker.

### Preparar el repositorio.

Para instalar Docker en Ubuntu, tendremos primero que actualizar el sistema con el siguiente comando:

```shell
 sudo apt-get update
```

Luego, podemos instalar Docker:

```shell
 sudo apt-get install \
    ca-certificates \
    curl \
    gnupg \
    lsb-release
```

Después añadimos la GPG Key de Docker:

```shell
sudo mkdir -p /etc/apt/keyrings
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg
```

Y a continuación establecemos el repositorio:

```shell
echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu \
  $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
```

### Instalación Docker Engine.

Actualizamos el sistema:

```shell
sudo apt-get update
```

Instalamos la última versión.

```shell
sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
```

Con esto, Docker ya estára instalado, para verificarlo, usaremos el siguiente comando:

```shell
$ docker -v
Docker Version 20.10.22, builda 3a2c30b
```

![[Pasted image 20230207123921.png]]

## 👩‍💻 Comandos Docker.

### Descargar una imagen.

Para descargar una imagen usaremos el siguiente comando:

```shell
sudo docker pull nombre_de_la_imagen
```

Para encontrar imágenes, iremos al Docker Hub y buscamos la imagen que queremos instalar.

Por ejemplo, para instalar la de Ubuntu:

```shell
sudo docker pull ubuntu
```

![[Pasted image 20230207124101.png]]

Tambien podremos instalar otras versiones usando los tags. Si quiero instalar la version lunar de Ubuntu:

```shell
sudo docker pull ubuntu:lunar
```

Para ==ver las imagenes== que tenemos instaladas, usamos el comando:

```shell
sudo docker images
```

![[Pasted image 20230207124155.png]]

### Gestión de contenedores.

Para crear y ejecutar un nuevo **contendor**, usaremos el comando:

```shell
sudo docker run nombre_de_la_imagen
```

El comando run de docker viene con diferentes opciones:

- **--name**. Le asigna un nombre personalizado al contenedor.
- **-v.** Permite asociar un volumen / carpeta del ordenador host al contenedor.
- **-ti**. Inicia el contenedor con una terminal.

Ejemplos:

```shell
sudo docker run --name nombre_contenedor_nuevo nombre_de_la_imagen
```

![[Pasted image 20230207125742.png]]

```shell
sudo docker run -ti nombre_de_la_imagen
```

![[Pasted image 20230207130112.png]]

```shell
sudo docker run -v directorio_a_compartir nombre_de_la_imagen
```

![[Pasted image 20230207130617.png]]

Igual que podemos crear y ejecutar un contenedor, también lo podemos pausar o parar especificando el id del contenedor o el nombre:

```shell
sudo docker pause / unpause / stop id_del_contenedor o nombre_del_contenedor
```

![[Pasted image 20230207125126.png]]

### Listar contenedores.

Si queremos ==listar los contenedores==:

```shell
sudo docker ps
```

Para listar los contenedores **activos**, usamos la opción -a

```shell
sudo docker ps -a
```

![[Pasted image 20230207124555.png]]

### Eliminar contendores.

Para eliminar contenedores usamoe el comando:

```shell
sudo docker rm nombre_del_contenedor o id_contenedor
```

*El contenedor tiene que estar parado para poder eliminarlo.*

### Renombrar contendores.

Para renombrar un contenedor, usamos el comando `rename`:

```shell
sudo docker rename contenedor nuevo_nombre
```

## 🐳 Subir contenedores a Docker Hub.

Lo primero que tendremos que hacer, sera loguearnos a nuestra cuenta de Docker Hub con el siguiente comando:

```shell
sudo docker login
```

Para cerrar sesión:

```shell
sudo docker logout
```

Una vez hayamos iniciado sesión, listamos los contenedores para ver cuál de ellos queremos subir.

![[Pasted image 20230207141230.png]]

Cuando hayamos elegido el contenedor, usaremos la siguiente comanda para hacer un commit:

```shell
sudo docker commit nombre_contenedor usuario_docker_hub/nombre_nueva_imagen
```

![[Pasted image 20230207140134.png]]

Esto lo que hace es crear una nueva imagen a partir de nuestro contenedor:

![[Pasted image 20230207140419.png]]

Si queremos borrar una imagen / commit que hayamos creado:

```shell
sudo docker rmi nombre_imagen
```

![[Pasted image 20230207141115.png]]

Ahora solo nos faltaria hacer un push:

```shell
sudo docker push usuario_docker_hub/nombre_contenedor
```

![[Pasted image 20230207141152.png]]

Resultado:

![[Pasted image 20230207140452.png]]