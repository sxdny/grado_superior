import java.util.Arrays;

public class prueba {
    
    static int[] numeros = {1, 1, 2, 3, 4, 4, 5, 6};

    public static void main(String[] args) {
        
        for (int i = 1; i < numeros.length; i++) { // 1
            if (numeros[i] == numeros[i - 1]) {
                numeros[i] = 0;
            }
        }
        

        System.out.println(Arrays.toString(numeros));

    }

}
