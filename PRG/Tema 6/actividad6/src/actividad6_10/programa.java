package actividad6_10;

import java.util.Scanner;

public class programa {
    
    static int op = 0;

    static Quadrat[] quadrats = new Quadrat[100];
    static int quadratsCreats = 0;
    static Cercle[] cercles = new Cercle[100];
    static int cerclesCreats = 0;
    static Rectangle[] rectangles = new Rectangle[100];
    static int rectanglesCreats = 0;
    static Rombo[] rombos = new Rombo[100];
    static int rombosCreats = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        

    }

    // Funciones

    public static void crearQuadrat() {

        System.out.println("Introduce la coordenada X:");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la coordenada y:");
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la altura:");
        int height = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la anchura:");
        int width = sc.nextInt();
        sc.nextLine();

        quadrats[quadratsCreats] = new Quadrat(x, y, height, width);

    }

    public static void crearRectangle() {

        System.out.println("Introduce la coordenada X:");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la coordenada y:");
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la altura:");
        int height = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la anchura:");
        int width = sc.nextInt();
        sc.nextLine();
        
        rectangles[rectanglesCreats] = new Rectangle(x, y, height, width);

    }

    public static void crearCirculo() {

        System.out.println("Introduce la coordenada X:");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la coordenada y:");
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el radio de la circunferencia:");
        int radi = sc.nextInt();
        sc.nextLine();

        int width = 0;
        int height = 0;
        
        cercles[cerclesCreats] = new Cercle(x, y, height, width, radi);

    }

    public static void crearRombo() {

        System.out.println("Introduce la coordenada X:");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la coordenada y:");
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la diagonal mayor:");
        int diagonalMayor = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la diagonal menor:");
        int diagonalMenor = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el valor de un lado:");
        int lado = sc.nextInt();
        sc.nextLine();

        int width = 0;
        int height = 0;
        
        rombos[rombosCreats] = new Rombo(x, y, height, width, diagonalMayor, diagonalMenor, lado);

    }

    public static void mostrarRombos() {

        

    }
}
