import java.util.Arrays;
import java.util.Scanner;
 
public class App {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce la lontidud de la matriz?");

		int longitud = scanner.nextInt();
		int[][] array = new int[longitud][longitud];
		int index = 0;

		System.out.println(Arrays.deepToString(array));

		scanner.close();
		
	}
}
