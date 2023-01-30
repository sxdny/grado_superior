package actividad6_10;

import java.util.Scanner;

public class programa {
    
    static int op = 0;

    static int formasCredas = 0;
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
            System.out.println("10. Mostrar Area o Perimetro figuras.");
            System.out.println("11. Salir del programa.");

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
                mostrarCalculos();
            }

            if (op < 0 || op >= 11 ) {
                System.out.println("No has elegido una opcion correcta.");
            }


        } while (op != 10);

    }

    // Funciones

    public static void mostrarCalculos() {

        int x = 0;
        int y = 0;

        int opcion = 0;

        System.out.println("De que forma geométrica quieres mostrar los calculos?");
        System.out.println("1. Cercle - 2. Quadrat - 3. Rectangle - 4. Rombo");

        opcion = sc.nextInt();
        sc.nextLine();


        if (opcion == 1) {
            
            System.out.println("Ingrese las coordenadas del Circulo.");

            x = sc.nextInt();
            sc.nextLine();

            y = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < cerclesCreats; i++) {
                
                if (x == cercles[i].getX() && y == cercles[i].getY()) {
                    cercles[i].mostrarAreaCercle(cercles[i].getRadi());
                    cercles[i].mostrarCircunferenciaCercle(cercles[i].getRadi());
                }
            }

        }

        if (opcion == 2) {

            System.out.println("Ingrese las coordenadas del Quadrat.");

            x = sc.nextInt();
            sc.nextLine();

            y = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < quadratsCreats; i++) {
                
                if (x == quadrats[i].getX() && y == quadrats[i].getY()) {
                    quadrats[i].mostrarAreaQuadrat(quadrats[i].getHeight(), quadrats[i].getWidth());
                    quadrats[i].mostrarPerimetroQuadrat(quadrats[i].getHeight(), quadrats[i].getWidth());
                }
            }

        }

        if (opcion == 3) {
            
            System.out.println("Ingrese las coordenadas del Rectangle.");

            x = sc.nextInt();
            sc.nextLine();

            y = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < rectanglesCreats; i++) {
                
                if (x == rectangles[i].getX() && y == rectangles[i].getY()) {
                    rectangles[i].mostrarAreaRectangle(rectangles[i].getHeight(), rectangles[i].getWidth());
                    rectangles[i].mostrarPerimetreRectangle(rectangles[i].getHeight(), rectangles[i].getWidth());
                }
            }

        }

        if (opcion == 4) {
            
            System.out.println("Ingrese las coordenadas del Rombo.");

            x = sc.nextInt();
            sc.nextLine();

            y = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < rombosCreats; i++) {
                
                if (x == rombos[i].getX() && y == rombos[i].getY()) {
                    rombos[i].mostrarAreaRombo(rombos[i].getDiagonalMenor(), rombos[i].getDiagonalMayor());
                    rombos[i].mostrarPerimetreRectangle(rombos[i].getLado());
                }
            }

        }

        if (opcion < 0 || opcion >= 5) {
            System.out.println("No has elegido una opcion válida.");
        }

    }

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
        quadratsCreats++;
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
        rectanglesCreats++;
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
        cerclesCreats++;
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
        rombosCreats++;
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
