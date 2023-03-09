// Selection Sort
import java.util.Arrays;

public class ej7_3 {
  
  public static void main(String[] args) {
    
    int[] numeros = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
    int posicion = 0;

    for (int i = 0; i < numeros.length - 1; i++) {

      posicion = i; // 0

      for (int j = i + 1; j < numeros.length; j++) {

        if (numeros[j] < numeros[posicion]) {

          posicion = j;

        }
        
      }

      int temp = numeros[posicion];
      numeros[posicion] =  numeros[i];
      numeros[i] = temp;

    }
    
    System.out.println(Arrays.toString(numeros));

  }

}
