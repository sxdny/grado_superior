// Bubble sort pero con do while (me parece mas lógico este).
import java.util.*;

public class ej7_41 {
    
    public static void main(String[] args) {
        
        int[] numeros = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
        int index = 0;

        do {
            
            for (int i = 0; i < numeros.length - index - 1; i++) {
                
                if (numeros[i] > numeros[i + 1]) {
                    
                    int menor = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = menor;
                }
            }

            index++;

        } while (index != numeros.length);

        System.out.println(Arrays.toString(numeros));

    }

}
