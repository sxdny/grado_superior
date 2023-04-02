// Bubble Sort
import java.util.Arrays;

public class ej7_4 {

    public static void main(String[] args) {

        int[] numeros = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };

        // Cuantas veces recorro la array.
        for (int i = 0; i < numeros.length; i++) {

            // Recorremos la array.
            for (int j = 0; j < numeros.length - i - 1; j++) {

                // Comparamos un valor con el siguiente.
                if (numeros[j] > numeros[j + 1]) {
                    // Si es mayor, los intercambiamos.
                    int menor = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = menor;
                }   
            }
        }

        System.out.println(Arrays.toString(numeros));

    }

}