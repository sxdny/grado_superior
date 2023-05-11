import java.io.*;
import java.util.Scanner;

public class ej8_3 {

    static String[] t = new String[] {"2131", "asasdasd", "asdfasdf"};
    static int n = 67;
    static String srt = null;
    
    public static void main(String[] args) {  
        n = t.length;

        errorNullPointerException(srt);

        verificaLengthTaula(n, t);

        errorIOException();

        n = n + 1;

        verificaLengthTaula(n, t);
    }    

    public static void verificaLengthTaula (int n, String t[]) {
        if (t.length!=n) throw new RuntimeException ("La taula no te la llargada indicada...");
        System.out.println("Sortida del metode --> verificaLengthTaula");
    }

    public static void errorIOException() {
        try {
            FileReader f = new FileReader("archivo.txt");
            
        } catch (IOException ioe) {
            System.out.println("Error al leer del archivo: " + ioe.getMessage());
        } 
    }

    public static void errorNullPointerException(String str) {
        try {

          System.out.println(str.length());

        } catch (NullPointerException e ) {

          System.out.println("No se puede imprimir porque el valor de la variable es null" + e.getMessage());
        
        }
    }
}
