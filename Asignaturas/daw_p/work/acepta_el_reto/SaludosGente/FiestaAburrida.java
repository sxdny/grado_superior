package SaludosGente;

import java.util.Scanner;

public class FiestaAburrida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nGente = sc.nextInt();
        String[] nombre = new String[nGente];

        for (int i = 0; i < nGente; i++) {
            System.out.print("Soy ");
            nombre[i] = sc.next();;
        }

        for (int i = 0; i < nGente; i++) {
            System.out.println("Hola, " + nombre[i] + "." );
        }

        sc.close();
    }
}