package SaludosGente;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nGente = sc.nextInt();
        String[] nombre = new String[nGente];
        String[] personas = new String[nGente];

        for (int i = 0; i < nGente; i++) {
            System.out.print("Soy ");
            nombre[i] = sc.next();
            personas[i] = nombre[i];
        }

        for (int i = 0; i < nGente; i++) {
            System.out.println("Hola, " + personas[i] + "." );
        }

        sc.close();
    }
}