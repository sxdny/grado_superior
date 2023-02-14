import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws IOException {
        
        // String del monigote.
        String[] monigote = {" __  ", "/  | ", "|  o ", "|  | ", "| -|-", "|  | ", "| / \\"};

        // Lista de palabras
        String[] diccionario = {"Contar", "Numero", "Jugar", "Leer", "Tirar", "Gafas", "Ivan", "Coche", "Raton", "Teclado", "Telefono", "Lectura", "Ordenador", "Computador", "Joan", "Ropa", "Juego", "Pantalla", "Diablo", "Pizarra", "Luz", "Electricidad", "Puerta", "Suelo", "Matar", "Cancion", "Musica", "Reproductor"};

        // Definimos la String palabra.
        String palabra = new String();

        // Cogemos un numero aleatorio entre la longitud de la array String diccionario.
        int nAleatorio = (int) Math.floor(Math.random() * (diccionario.length - 1 + 1) + 1);

        // Defino los guiones.
        String guess = "-";

        // Escogo una palabra aleatprio de la Array String diccionaroi con el numero aleatorio.
        palabra = diccionario[nAleatorio];

        // Defino la palabra que se irá desvelando a medida de que el usuario acierte.
        String[] guessPalabra = new String[palabra.length()];
        String palabraAdivinar = new String();

        // Construyo la palabra con el char "guess".
        for (int i = 0; i < palabra.length(); i++) {
            guessPalabra[i] = guess;
        }

        String[] arrayPalabra = palabra.split("");

        int correctas = 0;
        int incorrectas = 0;
            
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println();
            System.out.println("Adivinador palabra: " + Arrays.toString(guessPalabra));
            System.out.println("Solucion: " + palabra);
            System.out.println("Palabra en array: " + Arrays.toString(arrayPalabra));

            // User input.
            String userInput = sc.nextLine();

            System.out.println("Char del usuario: " + userInput);

            // Recorrer la palabra para comparar.
            for (int i = 0; i < arrayPalabra.length; i++) {
                if (Objects.equals(userInput, arrayPalabra[i])) {
                    guessPalabra[i] = userInput;
                    correctas++;
                }
                else {
                    incorrectas++;
                }
            }

            // Imprimit monigote.
            for (int i = 0; i < monigote.length; i++) {
                System.out.println(monigote[i]);
            }

        } while (correctas != arrayPalabra.length || incorrectas == monigote.length);
        
    }

}