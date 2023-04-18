package work.tema10.ej2;

import java.io.File;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        System.out.println("Introduce la ruta de un archivo de texto:");
        Scanner sc = new Scanner(System.in);

        String ruta = sc.nextLine();

        File archivo = new File(ruta);

        System.out.println("Introduce el nuevo nombre, poniendo la ruta absoluta:");
        String ruta2 = sc.nextLine();

        File archivo2 = new File(ruta2);

        System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

        boolean resultado = archivo.renameTo(archivo2);

        if (resultado == true) {
            System.out.println("Archivo renombrado perfectamente.");
        }
        else {
            System.out.println("Error....");
        }

        System.out.println("Nombre del archivo: " + archivo.getAbsolutePath());
        
        sc.close();

    }

}
