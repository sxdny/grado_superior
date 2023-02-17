import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
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

        // Escogo una palabra aleatprio de la Array String diccionario con el número aleatorio.
        palabra = diccionario[nAleatorio];

        // Defino la palabra que se irá desvelando a medida de que el usuario acierte las letras.
        String[] guessPalabra = new String[palabra.length()];

        // Construyo la palabra con el char "guess".
        for (int i = 0; i < palabra.length(); i++) {
            guessPalabra[i] = guess;
        }

        String[] arrayPalabra = palabra.split("");
        String errores = new String();

        int correctas = 0;
        int incorrectas = 0;
        int l = arrayPalabra.length;
            
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println();
            System.out.println("Palabra a descubrir: " + Arrays.toString(guessPalabra));
            System.out.println("Solucion: " + palabra);
            System.out.println("Numero de errores: " + incorrectas);
            System.out.println("Letras erroneas: " + errores);

            String userInput = sc.nextLine();

            // Recorrer la palabra para comparar.
            for (int i = 0; i < arrayPalabra.length; i++) {
                if (Objects.equals(userInput, arrayPalabra[i])) {
                    guessPalabra[i] = userInput;
                    correctas++;   
                }
            }

            if (correctas >= 1) {
                
            }
            else {
                errores = errores + " " + userInput;
                incorrectas++;
            }

            // Imprimir el monigote.
            for (int i = 0; i < incorrectas; i++) {
                System.out.println(monigote[i]);
            }

        } while (correctas != l && incorrectas < monigote.length);

        int index = 0;
        
        for (int i = 0; i < arrayPalabra.length; i++) {
            if (Objects.equals(guessPalabra[i], arrayPalabra[i])) {
                index++;
            }
        }

        if (index == arrayPalabra.length) {
            System.out.println("JUEGO COMPLETADO");
            System.out.println("Palabra final: " + Arrays.toString(guessPalabra));
        }
        else {
            System.out.println("HAS FALLADO.");
            System.out.println("La solucion era: " + palabra);
        }

        correctas = 0;
        
    sc.close();
    
    }

}