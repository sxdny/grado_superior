package work.tema10.ej4;

import java.io.File;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        // leer una carpeta y borrar todo lo que tiene adentro.

        System.out.println("Introduce la ruta de una carpeta:");
        Scanner sc = new Scanner(System.in);

        String ruta = sc.nextLine();

        File carpeta = new File(ruta);

        // borrar archivos y subcarpetas de la carpeta que le indicamos
        for(File f1 : carpeta.listFiles()){
            // si el archivo es una carpeta, dentro hacemos otro for para borrar los archivos
            if (f1.isDirectory()) {
                for (File f2 : f1.listFiles()) {
                    f2.delete();
                }
            }
            f1.delete();
        }

        System.out.println("Archivos borrados.");

        sc.close();

    }

}
