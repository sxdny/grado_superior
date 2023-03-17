import java.util.InputMismatchException;
import java.util.Scanner;

public class ej8_1 {
    
    /*
        Escriure una classe que pugui llançar diversos tipus d’excepcions. Per exemple
        (InputMismatchException, IndexOutOfBoundsException, ArithmeticException) i capturar-lo
        donant una informació de quin ha estat l’error trobat.
    */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // InputMismatchException
        try {
            System.out.println("Introduzca un numero para sumarle +2.");
            int a = sc.nextInt();
            a = a + 2;
            System.out.println("Resultado: " + a);

        } catch (InputMismatchException e) {
            System.out.println("Error InputMismatchException.");
        }

        try {
            int ar[] = { 1, 2, 3, 4, 5 };

            for (int i = 0; i <= ar.length; i++) {
                System.out.println(ar[i]);
            }
                
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error IndexOutOfBounds");
        }
    }

}
