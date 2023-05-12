/*
 * Creeu un programa que llegeixi un text pel teclat corresponent a la ruta d’un fitxer existent
   al vostre ordinador, imprimir el nom del fitxer, la ruta de la carpeta i la ruta absoluta.
 */

package ej1;

import java.io.File;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Introduce la ruta de un archivo de texto:");

        Scanner sc = new Scanner(System.in);

        String ruta = sc.nextLine();

        File archivo = new File(ruta);

        System.out.println("Ruta absoluta" + archivo.getAbsolutePath()); 
        System.out.println("Nombre del archivo: " +  archivo.getName());
        System.out.println("Ruta de la carpeta: " + archivo.getParentFile());

        sc.close();
        
    }
}
