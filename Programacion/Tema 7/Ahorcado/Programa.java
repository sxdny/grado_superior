import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Programa {

    public static void main(String[] args) {
        
        // String del monigote.
        String[] monigote = {" __  ", "/  | ", "|  o ", "|  | ", "| -|-", "|  | ", "| /|\\"};

        // Lista de palabras
        String[] diccionario = {"Contar", "Numero", "Jugar", "Leer", "Tirar", "Gafas", "Ivan", "Coche", "Raton", "Teclado", "Telefono", "Lectura", "Ordenador", "Computador", "Joan", "Ropa", "Juego", "Pantalla", "Diablo", "Pizarra", "Luz", "Electricidad", "Puerta", "Suelo", "Matar", "Cancion", "Musica", "Reproductor"};

        // Definimos la String palabra.
        String palabra = new String();

        // Cogemos un numero aleatorio entre la longitud de la array String diccionario.
        int nAleatorio = (int) Math.floor(Math.random() * (diccionario.length - 1 + 1) + 1);

        // Defino los guiones.
        char guess = '-';

        // Defino la palabra que se irá desvelando a medida de que el usuario acierte.
        String guessPalabra = new String();

        // Escogo una palabra aleatprio de la Array String diccionaroi con el numero aleatorio.
        palabra = diccionario[nAleatorio];

        // Construyo la palabra con el char "guess".
        for (int i = 0; i < palabra.length(); i++) {
            guessPalabra = guessPalabra + guess;
        }
            
        // Mensajes del sistema
        // Palabra aletaoria: System.out.println("Palabra aleatorio: " + palabra);
        
        String userInput = new String();
        String palabraUsuario = new String();
        Scanner sc = new Scanner(System.in);

        do {
            
            System.out.println("Adivinador palabra: " + guessPalabra);
            userInput = sc.nextLine();

        } while (palabraUsuario != palabra);
        
        // Imprimimos el monigote (prueba)
        // for (int i = 0; i < monigote.length; i++) {
        //     System.out.println(monigote[i]);


        // Sys.out.printinl("");:;
        String new= STRING
        // }

        

    }

}