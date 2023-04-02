import java.util.Arrays;

public class ej7_7 {

    static int n = 8; // n = reinas en el tablero.
    public static void main(String[] args) {
        int[][] tablero = new int[n][n];
        if (!check(tablero, 0)) {
            System.out.println("Sin solucion.");
        }
        
    }

    private static boolean nQueens(int[][] tablero, int fila, int columna) {
        for (int i = 0; i < columna; i++) {
            if (tablero[fila][i] == 1) {
                return false;
            }
        }
        for (int i = fila, j = columna; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }
        for (int i = fila, j = columna; i < n && j >= 0; i++, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean check(int[][] tablero, int columna) {
        if (columna == n) {
            System.out.println("Solucion con tablero de " + n + "x" + n + "." );
            for (int[] fila : tablero) {
                System.out.println(Arrays.toString(fila));
            }
            System.out.println();
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (nQueens(tablero, i, columna)) {
                tablero[i][columna] = 1;
                if (check(tablero, columna + 1)) {
                    return true;
                }
                tablero[i][columna] = 0;
            }
        }
        
        return false;
    }

}