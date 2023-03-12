import java.util.Arrays;
import java.util.Scanner;

public class mastermindJava {
    /*
     * Se genera una combinación de colores aleatoria.
     * Después, al intentar adivinar, con las fichas negras 
     * dices cuantas estan correctas y con las blancas,
     * cuantas forman parte del código secreto, pero no
     * están correctamente puestas.
     */

     static String[] colores = {"R", "G", "B", "M", "Y", "C"};
     // Red, Green, Blue, Magenta, Yellow y Cyan.

     static String[] codigoSecreto = new String[4];
     static String[] inputUsuario = new String[4];

     static boolean resuelto = false;
     static int intentos = 0;
     static Scanner sc = new Scanner(System.in);

     static int coloresPC = 0;
     static int coloresPI = 0;
    public static void main(String[] args) {
        
        /* Generar el código secreto. */
        for (int i = 0; i < codigoSecreto.length; i++) {
            int pick = (int) Math.floor(Math.random() * (colores.length - 1 + 1));
            codigoSecreto[i] = colores[pick];
        }

        do {
            
            System.out.println("Introduce una serie de 4 colores:");

            for (int i = 0; i < inputUsuario.length; i++) {
                inputUsuario[i] = sc.next();
            }

            // Colores en la misma posición.
            for (int i = 0; i < codigoSecreto.length; i++) {
                
                if (inputUsuario[i].equals(codigoSecreto[i])) {
                    coloresPC++;
                }
            }

            // Colores que están en la lista, pero no en la posicion incorrecta.
            for (int i = 0; i < codigoSecreto.length; i++) {
                for (int j = 0; j < codigoSecreto.length; j++) {
                    if (inputUsuario[i].equals(codigoSecreto[j])) {
                        if (inputUsuario[j].equals(codigoSecreto[j])) {
                            
                        }
                        else {
                            coloresPI++;
                        }
                    }
                }
            }

            if (coloresPC == 4) {
                resuelto = true;
            }

            System.out.println("Input del usuario: " + Arrays.toString(inputUsuario));
            System.out.println("[" + coloresPC + " , " + coloresPI + "]");

            coloresPC = 0;
            coloresPI = 0;

            intentos++;

        } while (resuelto == false && intentos != 16);

    }

}
