package actividad6_6;

import java.util.Scanner;

public class mainProgram {
    
    static int opcion = 0;
    static int barcosCreados = 0;
    static int ciclomotoresCreados = 0;
    static int avionesCreados = 0;

    static Barco[] barcos = new Barco[100];
    static Ciclomotor[] ciclomotores = new Ciclomotor[100];
    static Avion[] aviones = new Avion[100];

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       
        do {
            
            System.out.println("1. Crear un nuevo Barco.");
            System.out.println("2. Crear un nuevo Ciclomotor.");
            System.out.println("3. Crear un nuevo Avion.");
            System.out.println("4. Mostrar todos los Barcos.");
            System.out.println("5. Mostrar todos los Ciclomotores.");
            System.out.println("6. Mostrar todos los Aviones.");
            System.out.println("7. Mostrar todos los vehiculos.");
            System.out.println("8. SALIR del programa..");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                crearBarco();
            }

            if (opcion == 2) {
                crearCiclomotor();
            }

            if (opcion == 3) {
                crearAvion();
            }

            if (opcion == 4) {
                mostrarBarcos();
            }

            if (opcion == 5) {
                mostrarCiclomotores();
            }

            if (opcion == 6) {
                mostrarAviones();
            }

            if (opcion == 7) {
                mostrarTodo();
            }

            if (opcion < 0 || opcion >= 9) {
                System.out.println("No has elegido una opcion valida.");
            }

        } while (opcion != 8);
        System.out.println("Has salido correctamente del programa.");

    }

    public static void crearBarco() {
        System.out.println("Introduzca el nombre del vehiculo:");
        String nombreVehiculo = sc.nextLine();

        System.out.println("Introduzca el tipo de vehiculo:");
        String tipoVehiculo = sc.nextLine();

        System.out.println("Introduzca la cantidad de ruedas que tiene el vehiculo:");
        int nRuedas = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca la capacidad del vehiculo:");
        int capacidad = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca el tipo de barco:");
        String tipo_barco = sc.nextLine();

        barcos[barcosCreados] = new Barco(nombreVehiculo, tipoVehiculo, nRuedas, tipo_barco, capacidad);
        barcosCreados++;
    }

    public static void crearCiclomotor() {
        
        System.out.println("Introduzca el nombre del vehiculo:");
        String nombreVehiculo = sc.nextLine();

        System.out.println("Introduzca el tipo de vehiculo:");
        String tipoVehiculo = sc.nextLine();

        System.out.println("Introduzca la cantidad de ruedas que tiene el vehiculo:");
        int nRuedas = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca la capacidad del vehiculo:");
        int capacidad = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca el tipo de ciclomotor:");
        String tipo_ciclomotor = sc.nextLine();

        ciclomotores[ciclomotoresCreados] = new Ciclomotor(nombreVehiculo, tipoVehiculo, nRuedas, capacidad, tipo_ciclomotor);
        ciclomotoresCreados++;

    }

    public static void crearAvion() {
        
        System.out.println("Introduzca el nombre del vehiculo:");
        String nombreVehiculo = sc.nextLine();

        System.out.println("Introduzca el tipo de vehiculo:");
        String tipoVehiculo = sc.nextLine();

        System.out.println("Introduzca la cantidad de ruedas que tiene el vehiculo:");
        int nRuedas = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca la capacidad del vehiculo:");
        int capacidad = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca la cantidad de las alas del avion:");
        int alas = sc.nextInt();

        aviones[avionesCreados] = new Avion(nombreVehiculo, tipoVehiculo, nRuedas, alas, capacidad);
        avionesCreados++;

    }

    public static void mostrarBarcos() {
        System.out.println("Lista de barcos: ");
        for (int i = 0; i < barcosCreados; i++) {
            System.out.println(barcos[i].mostrarDades());
        }
    }

    public static void mostrarCiclomotores() {
        System.out.println("Lista de ciclomotores: ");
        for (int i = 0; i < ciclomotoresCreados; i++) {
            System.out.println(ciclomotores[i].mostrarDades());
        }
    }

    public static void mostrarAviones() {
        System.out.println("Lista de aviones: ");
        for (int i = 0; i < avionesCreados; i++) {
            System.out.println(aviones[i].mostrarDades());
        }
    }

    public static void mostrarTodo() {
        System.out.println("Lista de barcos: ");
        for (int i = 0; i < barcosCreados; i++) {
            System.out.println(barcos[i].mostrarDades());
        }
        System.out.println("Lista de aviones: ");
        for (int i = 0; i < avionesCreados; i++) {
            System.out.println(aviones[i].mostrarDades());
        }
        System.out.println("Lista de ciclomotores: ");
        for (int i = 0; i < ciclomotoresCreados; i++) {
            System.out.println(ciclomotores[i].mostrarDades());
        }
    }

}
