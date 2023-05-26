public class Criba {
    /**
     * Generar números primos de 1 a max
     * 
     * @param max es el valor máximo
     * @return Vector de números primos
     */ 
    public static int[] generarPrimos(int max) {

        int VALOR_MINIMO = 2;

        if (max >= VALOR_MINIMO) {

            // Declaraciones
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[dim];

            // Rellenar el vector de números primos
            int[] primos = new int[contarPrimos(dim, esPrimo)];
            for (int i = 0, j = 0; i < dim; i++) {
                if (esPrimo[i])
                    primos[j++] = i;
            }

            return primos;

        } else { // max < 2
            return new int[0]; // Vector vacío
        }
    }

    public static boolean[] inicializarArray(int dim, boolean[] esPrimo) {
        
        // Inicializar el array
        for (int i = 0; i < dim; i++)
            esPrimo[i] = true;

        // Eliminar el 0 y el 1, que no son primos
        esPrimo[0] = esPrimo[1] = false;

        return esPrimo;
    }

    public static int contarPrimos(int dim, boolean[] esPrimo) {
        int cuenta = 0;
        for (int i = 0; i < dim; i++) {
            if (esPrimo[i])
                cuenta++;
        }
        return cuenta;
    }

    public static void criba(int dim, boolean[] esPrimo) {
        // Criba
        for (int i = 2; i < Math.sqrt(dim) + 1; i++) {
            if (esPrimo[i]) {
                // Eliminar los múltiplos de i
                for (int j = 2 * i; j < dim; j += i)
                    esPrimo[j] = false;
            }
        }
    }
}