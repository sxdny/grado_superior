import java.util.Arrays;
import java.util.Scanner;

public class Armario {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena1 = new String();
        String cadena2 = new String();
        String cadena3 = new String();
        String cadena4 = new String();
        String resultado1 = new String();
        String resultado2 = new String();
        String resultado3 = new String();

        int nV = 0;
        int nI = 0;
        
        cadena1 = sc.nextLine();
        cadena2 = sc.nextLine();
        cadena3 = sc.nextLine();
        cadena4 = sc.nextLine();

        for (int i = 0; i < cadena1.length(); i++) {
            if (cadena1.charAt(i) ==  'V') { nV++; }
            if (cadena1.charAt(i) ==  'I') { nI++; }
            if (cadena1.charAt(i) ==  'A') { nI++; nV++; }
        }

        if (nV > nI) {
            resultado1 = "VERANO";
        }

        if (nI > nV) {
            resultado1 = "INVIERNO";
        }

        if (nI == nV) {
            resultado1 = "EMPATE";
        }

        nV = 0;
        nI = 0;

        for (int i = 0; i < cadena2.length(); i++) {
            if (cadena2.charAt(i) ==  'V') { nV++; }
            if (cadena2.charAt(i) ==  'I') { nI++; }
            if (cadena2.charAt(i) ==  'A') { nI++; nV++; }
        }

        if (nV > nI) {
            resultado2 = "VERANO";
        }

        if (nI > nV) {
            resultado2 = "INVIERNO";
        }

        if (nI == nV) {
            resultado2 = "EMPATE";
        }

        nV = 0;
        nI = 0;

        for (int i = 0; i < cadena3.length(); i++) {
            if (cadena3.charAt(i) ==  'V') { nV++; }
            if (cadena3.charAt(i) ==  'I') { nI++; }
            if (cadena3.charAt(i) ==  'A') { nI++; nV++; }
        }

        if (nV > nI) {
            resultado3 = "VERANO";
        }

        if (nI > nV) {
            resultado3 = "INVIERNO";
        }

        if (nI == nV) {
            resultado3 = "EMPATE";
        }

        nV = 0;
        nI = 0;

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);

        sc.close();
    }

}
