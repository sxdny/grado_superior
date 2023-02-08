import java.util.Arrays;

public class Programa {

    public static void main(String[] args) {
        
        // String del monigote.
        String[] monigote = {" __  ", "/  | ", "|  o ", "|  | ", "| -|-", "|  | ", "| /|\\"};

        // Lista de palabras
        String[] diccionario = {"Contar", "Numero", "Jugar", "Leer", "Tirar", "Gafas", "Ivan", "Coche", "Raton", "Teclado", "Telefono", "Lectura", "Ordenador", "Computador", "Joan", "Ropa", "Juego", "Pantalla", "Diablo", "Pizarra", "Luz", "Electricidad", "Puerta", "Suelo", "Matar", "Cancion", "Musica", "Reproductor"};

        String palabra = new String();

        int nAleatorio = (int) Math.floor(Math.random() * (diccionario.length - 1 + 1) + 1);

        char guess = '-';

        String guessPalabra = new String();

        palabra = diccionario[nAleatorio];

        for (int i = 0; i < palabra.length(); i++) {
            guessPalabra = guessPalabra + guess;
        }
            
        System.out.println("Palabra aleatorio: " + palabra);
        System.out.println("Adivinador palabra: " + guessPalabra);

        // Imprimimos el monigote (prueba)
        // for (int i = 0; i < monigote.length; i++) {
        //     System.out.println(monigote[i]);
        // }

    }

}