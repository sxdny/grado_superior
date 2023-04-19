package ej6;

import java.io.File;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        System.out.println("Introduce la ruta de una carpeta:");
        Scanner sc = new Scanner(System.in);

        String ruta = sc.nextLine();

        File carpeta = new File(ruta);

        System.out.println("Introduce primero una extension y despues otra por la que quieres reemplazarla. (SEPARADAS POR UN ESPACIO)");
        String ui = sc.nextLine();

        String[] extensiones = ui.split(" ");

        String ext1 = extensiones[0];
        String ext2 = extensiones[1];

        for (File files : carpeta.listFiles()) {
            
            if (files.getName() == ext1) {
                
                

            }

        }

        
        sc.close();

    }

}
