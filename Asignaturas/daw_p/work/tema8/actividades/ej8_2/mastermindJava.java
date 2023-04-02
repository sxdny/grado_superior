package ej8_2;

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class mastermindJava {
    /*
     * Se genera una combinación de colores aleatoria.
     * Después, al intentar adivinar, con las fichas negras 
     * dices cuantas estan correctas y con las blancas,
     * cuantas forman parte del código secreto, pero no
     * están correctamente puestas.
     */

    static Colores colores = new Colores();
    // Red, Green, Blue, Magenta, Yellow y Cyan.

    static Codigo codigo = new Codigo();
    // Codigo elegido aleaotiriamente.

    static String[] inputUsuario = new String[4];

    static boolean resuelto = false;
    static int intentos = 0;
    static Scanner sc = new Scanner(System.in);

    static int coloresPC = 0;
    static int coloresPI = 0;
    public static void main(String[] args) {
        
        /* Generar el código secreto. */
        codigo.generarCodigoAleatorio(codigo, colores);

        System.out.println("Codigo secreto: " +  codigo.toString());

        do {
            
            System.out.println("Introduce una serie de 4 colores:");

            try {

                for (int i = 0; i < inputUsuario.length; i++) {
                    inputUsuario[i] = sc.next();
                }

            } catch (InputMismatchException e) {
                System.out.println("No has introducido una letra...");;
            }

            
            try {
                // Colores en la misma posición.
                for (int i = 0; i < codigo.codigo.length; i++) {
                    if (inputUsuario[i].equals(codigo.codigo[i])) {
                        coloresPC++;
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.toString());
            }

            try {
                // Colores que están en la lista, pero en la posicion incorrecta.
                for (int i = 0; i < codigo.codigo.length; i++) {
                    for (int j = 0; j < codigo.codigo.length; j++) {
                        if (inputUsuario[i].equals(codigo.codigo[j])) {
                            if (inputUsuario[j].equals(codigo.codigo[j])) {
                            }
                            else {
                                coloresPI++;
                            }
                        }
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.toString());
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
