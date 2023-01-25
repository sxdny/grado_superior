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

        do {
            

            System.out.println("Elige unas de las siguientes opciones: ");
            System.out.println("1. Crear un nuevo (Circulo) ");
            System.out.println("2. Crear un nuevo (Rombo) ");
            System.out.println("3. Crear un nuevo (Quadrat) ");
            System.out.println("4. Crear un nuevo (Rectangle) ");
            System.out.println("5. Mostrar todos los (Circulos) ");
            System.out.println("6. Mostrar todos los (Rombos) ");
            System.out.println("7. Mostrar todos los (Rectangles) ");
            System.out.println("8. Mostrar todos los (Quadrats) ");
            System.out.println("9. Mostrar TODO ");
            System.out.println("10. Salir del programa.");

            op = sc.nextInt();
            sc.nextLine();
            
            if (op == 1 ) {
                crearCirculo();
            }

            if (op == 2 ) {
                crearRombo();
            }

            if (op == 3 ) {
                crearQuadrat();
            }

            if (op == 4 ) {
                crearRectangle();
            }

            if (op == 5 ) {
                mostrarCercles();
            }

            if (op == 6 ) {
                mostrarRombos();
            }

            if (op == 7 ) {
                mostrarRectangles();
            }

            if (op == 8 ) {
                mostrarQuadrats();
            }

            if (op == 9 ) {
                mostrarTodo();
            }

            if (op == 10) {
                
            }

            if (op < 0 || op >= 11 ) {
                System.out.println("No has elegido una opcion correcta.");
            }


        } while (op != 10);

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

        System.out.println("Lista de Rombos:");
        for (int i = 0; i < rombosCreats; i++) {
            System.out.println(rombos[i].mostrarDades());
        };

    }

    public static void mostrarQuadrats() {

        System.out.println("Lista de Quadrats:");
        for (int i = 0; i < quadratsCreats; i++) {
            System.out.println(quadrats[i].mostrarDades());
        };

    }

    public static void mostrarRectangles() {

        System.out.println("Lista de Rectangles:");
        for (int i = 0; i < rectanglesCreats; i++) {
            System.out.println(rectangles[i].mostrarDades());
        };

    }

    public static void mostrarCercles() {

        System.out.println("Lista de Cercles:");
        for (int i = 0; i < cerclesCreats; i++) {
            System.out.println(cercles[i].mostrarDades());
        };

    }

    public static void mostrarTodo() {

        System.out.println("Lista entera de figuras:");
        for (int i = 0; i < rombosCreats; i++) {
            System.out.println(rombos[i].mostrarDades());
        };

        System.out.println("Lista de Cercles:");
        for (int i = 0; i < cerclesCreats; i++) {
            System.out.println(cercles[i].mostrarDades());
        };

        System.out.println("Lista de Rectangles:");
        for (int i = 0; i < rectanglesCreats; i++) {
            System.out.println(rectangles[i].mostrarDades());
        };

        System.out.println("Lista de Quadrats:");
        for (int i = 0; i < quadratsCreats; i++) {
            System.out.println(quadrats[i].mostrarDades());
        };

    }
}
