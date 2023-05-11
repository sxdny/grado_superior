package ej5;

import java.io.File;
import java.util.Scanner;

// eliminar todo independientemente del número de carpetas.

public class Programa {

    public static void main(String[] args) {

        // leer una carpeta y borrar todo lo que tiene adentro.

        System.out.println("Introduce la ruta de una carpeta:");
        Scanner sc = new Scanner(System.in);

        String ruta = sc.nextLine();

        File carpeta = new File(ruta);

        // borrar archivos y subcarpetas de la carpeta que le indicamos
        if (carpeta.exists() && carpeta.isDirectory()) {
            borrar(carpeta);
            System.out.println("Eliminao");
        }
        sc.close();

    }

    public static void borrar(File f) {
        if (f.isDirectory()) {
            for (File arch : f.listFiles()) {
                if (arch.isDirectory()) {
                    borrar(arch);
                }
                arch.delete();
            }   
        }
    }

}



