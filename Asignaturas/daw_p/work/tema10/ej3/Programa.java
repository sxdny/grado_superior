package work.tema10.ej3;

import java.io.File;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        // leer una carpeta y borrar todo lo que tiene adentro.

        System.out.println("Introduce la ruta de una carpeta:");
        Scanner sc = new Scanner(System.in);

        String ruta = sc.nextLine();

        File carpeta = new File(ruta);

        for(File f1 : carpeta.listFiles()){
            f1.delete();
        }

        System.out.println("Archivos borrados.");

        sc.close();

    }

}
