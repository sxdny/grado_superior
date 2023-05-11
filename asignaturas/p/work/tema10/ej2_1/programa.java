import java.io.FileWriter;

/*
 * Donat l’array {10, 50, 30, 22, 10, 155} grava’l a un fitxer anomenat array.txt, fes servir un
   flux de dades.
 */

public class programa {
    public static void main(String[] args) {
        
        int[] numeros = {10, 50, 30, 22, 10, 155};

        try {
            
            FileWriter file = new FileWriter("C:/array.txt");

            for (int i = 0; i < numeros.length; i++) {
                file.write(numeros[i] + " ");
            }

            file.flush();
            file.close();

        } catch (Exception e) {
            System.out.println("Ha habido un error...");
            System.out.println(e.toString());
        }

    }
}
