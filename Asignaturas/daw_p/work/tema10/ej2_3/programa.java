import java.io.FileInputStream;
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

        FileReader fR = new FileReader(
                "C:/Users/ciclesgs.EAAULA111W-009/Documents/GitHub/Actividades-Grado-Superior/Asignaturas/daw_p/work/tema10/ej2_3/cadena.txt");

        int i;

        System.out.println("FileReader (2bytes)");
        // leer entero (de 2bytes por 2bytes)
        while ((i = fR.read()) != -1) {
            System.out.print((char) i);
        }

        System.out.println();

        // leer carácter por carácter (de 1 byte a 1 byte)
        FileInputStream fis = new FileInputStream(
                "C:/Users/ciclesgs.EAAULA111W-009/Documents/GitHub/Actividades-Grado-Superior/Asignaturas/daw_p/work/tema10/ej2_3/cadena.txt");

        System.out.println("FileInputStream (1byte)");
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }

    }
}
