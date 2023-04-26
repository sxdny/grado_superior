import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 4. Duplica el fitxer cadena.txt creat anteriorment al fitxer cadena_copia.txt.
 */

public class programa {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C:/Users/ciclesgs.EAAULA111W-009/Documents/GitHub/Actividades-Grado-Superior/Asignaturas/daw_p/work/tema10/ej2_3/cadena.txt");

        FileWriter fileWriter = new FileWriter("C:/Users/ciclesgs.EAAULA111W-009/Documents/GitHub/Actividades-Grado-Superior/Asignaturas/daw_p/work/tema10/ej2_4/cadena_copia.txt");

        // primero leemos el archivo y después escribimos en otro.

        // leemos el archivo
        int i;
        while ((i = fileReader.read()) != -1) {
           // escribimos dentro del "fileWriter"
            fileWriter.write((char)i);
        }

        fileWriter.flush();
        fileWriter.close();

    }
}
