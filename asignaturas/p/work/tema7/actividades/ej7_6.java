import java.util.Arrays;

public class ej7_6 {
    
    public static void main(String[] args) {
        
        int[] numeros = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
        
        quicksort(numeros, 0, numeros.length - 1);

        System.out.println("Array de números ordenada: " + Arrays.toString(numeros));

    }

    public static void quicksort(int arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = dividir(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }

    public static int dividir(int[] numeros, int izquierda, int derecha) {

        // Es mejor usar un pivote aleatorio que elegir el primero o el último.
        // Esto elegirá un número aleatorio del 0 a n. (n = numeros.lenght)
        int pivot = (int) Math.floor(Math.random() * (numeros.length - 1 + 1));
    
        while (true) {

            while (numeros[izquierda] < pivot) {
                izquierda++;
            }

            while (numeros[derecha] > pivot) {
                derecha--;
            }

            if (izquierda >= derecha) {
                return derecha;
            } 
            else {
                // Hacemos el cambio.
                int cambio = numeros[izquierda];
                numeros[izquierda] = numeros[derecha];
                numeros[derecha] = cambio;

                izquierda++;
                derecha--;
            }
        }

    }

    public static void cambiar(int[] numeros, int izquierda, int derecha) {

    }

}
