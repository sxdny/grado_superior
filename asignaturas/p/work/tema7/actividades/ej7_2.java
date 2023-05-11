// Insertion Sort.
import java.util.Arrays;

public class ej7_2 {

  public static void main(String[] args) {

    int[] numeros = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
    int index = 0;

    for (int i = 1; i < numeros.length; i++) {
      
      index = numeros[i];

      int j = i - 1;

      while (j >= 0 && numeros[j] > index) {

        numeros[j + 1] = numeros[j];
        j--;

      }

      numeros[j + 1] = index;

    }

    System.out.println(Arrays.toString(numeros));

  }

}
