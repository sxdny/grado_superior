import java.io.FileReader;
import java.io.IOException;

/*
 * 2. A partir del fitxer creat anteriorment llegiex el fitxer i mostra el resultat per consola.
 */

public class ej2_2 {
    public static void main(String[] args) throws IOException {
        
        // archivo a leer
        FileReader fileReader = new FileReader("C:/array.txt");

        int i;

        // leer el contenido del archivo hasta que no haya nada más para leer.
        while((i = fileReader.read()) != -1) {
            System.out.print((char)i);
        }

        fileReader.close();
    }
}
