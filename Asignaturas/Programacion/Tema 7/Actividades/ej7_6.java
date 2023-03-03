import java.io.*; // Todos los paquetes necesarios.
import java.util.*;  // swap()

public class ej7_6 {
    
    public static void main(String[] args) {
        
        int[] numeros = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
        // Ejecutar el programa.

    }

    public static void quicksort(int[] numeros, int izquierda, int derecha) {

        if (izquierda < derecha) {
            
        }

    }

    public static int dividir(int[] numeros, int izquierda, int derecha) {

        // Es mejor usar un pivote aleatorio que elegir el primero o el último.
        int pivot = (int) Math.floor(Math.random() * (numeros.length - 1 + 1) + 1);
        int i = izquierda - 1;

        for (int j = izquierda; j < derecha; j++) {
            
            if (numeros[j] <= pivot) {
                
                i++;
                
            }

        }

        return i + 1;

    }

    public static void cambiar(int[] numeros, int izquierda, int derecha) {

    }

}
