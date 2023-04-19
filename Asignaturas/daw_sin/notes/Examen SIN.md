# Examen SIN.

Repaso de comandos anteriores: [[Apuntes Sistemas Informáticos]]

## TODO

- [ ] Repasar lo de LVM. 

Primero hacer las particiones, depsués formateamos y finalmente, montamos.

*Ver comandos en la [teoria.](https://classroom.google.com/c/NDkxMzg5NDk4MTc5/m/NjA0NzYzNjA5MTMz/details).*

Para particionar:

````shell
fdisk
````

## LVM

1. Primero hacer la partición de `boot`.
2. Después hacer una partición `unformated` para el LVM.
3. Finalmente, hacer el particionado.

## Montar disco.

Primero creamos una carpeta en `/media` y después ejecutamos el comando:

```shell
sudo mount ruta_particion ruta_destino
```

Después editar el archivo `etc/fstab` para que se quede montado después del boot.

*Para recursos compartidos, ver el último comando del [archivo de repaso.](https://classroom.google.com/c/NDkxMzg5NDk4MTc5/m/NjA0NzYzNjA5MTMz/details)*

