import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 5. Emmagatzema la cadena "Hola, aquest es un exemple per a escriure en un arxiu." en un
      stream en memòria, després llegeix l’stream creat anteriorment i mostra el contingut per la
      consola.
 */

public class ej2_5 {
    
    public static void main(String[] args) throws IOException {
        
        FileOutputStream fos = new FileOutputStream("C:/Users/ciclesgs.EAAULA111W-009/Documents/GitHub/Actividades-Grado-Superior/Asignaturas/daw_p/work/tema10/ej2_5/archivo.txt");
        String textoAescribir = new String("Hola, aquest es un exemple per escriure en un arxiu.");

        // escribir en el archivo
        fos.write(textoAescribir.getBytes());

        // mostrar por pantalla con FileInputStream
        FileInputStream fis = new FileInputStream("C:/Users/ciclesgs.EAAULA111W-009/Documents/GitHub/Actividades-Grado-Superior/Asignaturas/daw_p/work/tema10/ej2_5/archivo.txt");
        
        int i;
        while((i = fis.read()) != -1) {
            System.out.print((char)i);
        }

        // flush
        fos.flush();
        fos.close();

    }

}
