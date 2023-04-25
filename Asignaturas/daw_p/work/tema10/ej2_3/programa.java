import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * 3. Crear el fitxer cadena.txt amb el contingut de la cadena "Hola, aquest es un exemple per a
    escriure en un arxiu.". Fes dues versions una processi la cadena d’una vegada i una caràcter
    per caràcter.
 */

public class programa {
    private static final Path Path = null;

    public static void main(String[] args) throws IOException {

        FileReader fR = new FileReader("C:/Users/ciclesgs.EAAULA111W-009/Documents/GitHub/Actividades-Grado-Superior/Asignaturas/daw_p/work/tema10/ej2_3/cadena.txt");

        int i;
        
        System.out.println("Leer carácter por carácter.");
        // leer carácter por carácter.
        while((i = fR.read()) != -1) {
            System.out.println((char)i);
        }

        System.out.println();

        //leer de una sola vez
        System.out.println("Leer de una sola vez:");
        Path filePath = java.nio.file.Path.of("C:/Users/ciclesgs.EAAULA111W-009/Documents/GitHub/Actividades-Grado-Superior/Asignaturas/daw_p/work/tema10/ej2_3/cadena.txt");
        String content = Files.readString(filePath , Charset.defaultCharset());

        System.out.println(content);

        
        

    }
}
