// Insertion Sort.
import java.util.Arrays;

public class ej7_2 {
  
  public static void main(String[] args) {
    
    int[] numeros = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
    int index = 0;
    int menor = 0;

    for (int i = 0; i < numeros.length; i++) {
      
      index = i;

      for (int j = 0; j < numeros.length; j++) {
        
        if (index > numeros[i]) {
            menor = numeros[i];
        }

      } 

      numeros[i] = menor;

    }

    System.out.println(Arrays.toString(numeros));

  }

}
