// Selection Sort
import java.util.Arrays;

public class ej7_3 {
  
  public static void main(String[] args) {
    
    int[] numeros = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
    int menor = 0;

    for (int j = 0; j < numeros.length; j++) {

      menor = j;
      
      for (int i = j; i < numeros.length; i++) {
      
        if (numeros[menor] > numeros[j]) {
          menor = numeros[j];
        }
        
      }

      numeros[j] = menor;

    }
    
    System.out.println(Arrays.toString(numeros));

  }

}
