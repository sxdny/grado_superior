import java.util.*;

public class OrdenarArray {

    public static void main(String[] args) {

        int opcion = 0;
        int longitudArray = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de la array de numeros:");
        longitudArray = sc.nextInt();

        int[] numeros = new int[longitudArray];

        System.out.println("Introduce 1 a 1 los numeros dentro de la array de numeros:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numeros));

        do {

            System.out.println("Seleccione uno de los siguientes métodos:");
            System.out.println("1. Insertion Sort.");
            System.out.println("2. Selection Sort.");
            System.out.println("3. Bubble Sort.");
            System.out.println("4. Salir del programa");

            opcion = sc.nextInt();

            if (opcion == 1) {
                insertionSort(numeros);
            }

            if (opcion == 2) {
                selectionSort(numeros);
            }

            if (opcion == 3) {
                bubbleSort(numeros);
            }

            if (opcion >= 5 || opcion < 0) {
                System.out.println("Nos has elegido una opcion valida...");
            }

        } while (opcion != 4);

        sc.close();
    }

    public static void insertionSort(int[] numeros) {

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

    public static void selectionSort(int[] numeros) {

        int menor = 0;

        for (int i = 0; i < numeros.length - 1; i++) {

            menor = i;

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < numeros[menor]) {

                    menor = j;

                }

            }

            int temp = numeros[menor];
            numeros[menor] = numeros[i];
            numeros[i] = temp;

        }

        System.out.println(Arrays.toString(numeros));
    }

    public static void bubbleSort(int[] numeros) {

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
