public class GeneradorDePrimos {
	
	private static boolean[] esPrimos;
	
	public static int[] generarPrimos(int max) {
		if (max >= 2) {

			// Declaraciones
			int dim = max + 1; // Tamaño del array
			esPrimos = new boolean[dim];

			inicializarCandidatos(max);

			eliminarMultiplos(esPrimos);

			return rellenarPrimos(esPrimos);
		} else { // max < 2
			return new int[0]; // Vector vacío
		}
	}

	private static void inicializarCandidatos(int max) {

		esPrimos = new boolean[max + 1];
		
		// Inicializar el array
		for (int i = 0; i < esPrimos.length; i++)
			esPrimos[i] = true;

		// Eliminar el 0 y el 1, que no son primos
		esPrimos[0] = esPrimos[1] = false;
	}

	private static void eliminarMultiplos(boolean[] esPrimo) {		
		
		for (int i = 2; i < Math.sqrt(esPrimo.length) + 1; i++) {
			if (esPrimo[i]) {
				eliminarMultiplosDe(esPrimo, i);
			}
		}
	}

	private static void eliminarMultiplosDe(boolean[] esPrimo, int i) {
	 
		for (int j = 2 * i; j < esPrimo.length; j += i)
			esPrimo[j] = false;
	}

	private static int[] rellenarPrimos(boolean[] esPrimo) {
		
		int[] primos = new int[calcularNumPrimos(esPrimo)];
		for (int i = 0, j = 0; i < esPrimo.length; i++) {
			if (esPrimo[i])
				primos[j++] = i;
		}
		
		return primos;
	}

	private static int calcularNumPrimos(boolean[] esPrimo) {
		
		int cuenta = 0;
		
		for (int i = 0; i < esPrimo.length; i++) {
			if (esPrimo[i])
				cuenta++;
		}
		return cuenta;
	}
}