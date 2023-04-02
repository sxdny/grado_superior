package actividad6_12;

import java.util.Scanner;

public class Programa {

    static int opcion = 0;
    static Scanner sc = new Scanner(System.in);
    static Cua cua = new Cua();

    public static void main(String[] args) {
        
        do {
            
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1. Anadir persona a la cola");
            System.out.println("2. Mostra estado de la cola.");
            System.out.println("3. Eliminar persona de la cola.");
            System.out.println("4. Salir del programa.");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                insertar();
            }

            if (opcion == 2) {
                estado();
            }

            if (opcion == 3) {
                eliminar();
            }

            if (opcion < 0 || opcion >= 5) {
                System.out.println("No has introducido una opcion valida.");
            }

        } while (opcion != 4);
        System.out.println("Has salido correctamente del programa.");

    }

    public static void insertar() {

        System.out.println("Nombre de la persona:");
        String nom = sc.nextLine();
        System.out.println("Apellidos de la persona:");
        String cognoms = sc.nextLine();
        System.out.println("DNI de la persona:");
        String DNI = sc.nextLine();
        System.out.println("Edad de la persona:");
        int edad = sc.nextInt();
        sc.nextLine();

        Persona persona = new Persona(nom, cognoms, DNI, edad);

        cua.insertarPersona(persona);

    }

    public static void estado() {
        cua.mostraEstatCua();
    }

    public static void eliminar() {
        cua.eliminarPersona();
    }

    
}
