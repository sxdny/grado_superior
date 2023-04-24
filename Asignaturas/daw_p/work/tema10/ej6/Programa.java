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

        for ( File file : carpeta.listFiles()) {
            
            String nombreFile = file.getName();
            String[] partesFile = nombreFile.split("\\."); // separo la extension del archivo.
            String newExtension =  "." + partesFile[1]; // le pongo un "."

            char[] pF = newExtension.toCharArray();
            char[] pExt1 = ext1.toCharArray();
            

            int contador = 0;

            for (int i = 0; i < 4; i++) {
                
                if (pF[i] == pExt1[i]) {
                    contador++;
                }

            }

            if (contador == 4) {
                File renamer = new File(ruta + "\\" + partesFile[0] + ext2);
                file.renameTo(renamer);
            }
        }
        sc.close();

        System.out.println("Archivos cambiados correctamente.");

    }

}
