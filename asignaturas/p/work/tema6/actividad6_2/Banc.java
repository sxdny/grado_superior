// Funciona en Ubuntu.

package actividad6_2;

import java.util.Scanner;

public class Banc {

    static int comptesCreats = 0;
    static CompteBancari[] comptes = new CompteBancari [100];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {

        int opcion = 0;

        do {
            System.out.println("Elige una de las siguientes opciones: \n ");
            System.out.println("1. Crear cuenta...");
            System.out.println("2. Ingresar en la cuenta...");
            System.out.println("3. Reintegrar de la cuenta...");
            System.out.println("4. Mostrar informacion de la cuenta...");
            System.out.println("5. Salir del programa...");

            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                crearCompte();
            }
            if (opcion == 2) {
                ingressarDoblers();
            }
            if (opcion == 3) {
                reintegrarDoblers();
            }
            if (opcion == 4) {
                mostrarSaldo();
            }
            if (opcion > 5 || opcion < 0) {
                System.out.println("No has introducido una opcion valida. \n");
            }
        } while (opcion != 5);
    }

    // Crear cuenta.

    public static void crearCompte() {

        System.out.println("Ingrese sus datos a continuacion: ");

        System.out.println("DNI:");
        String dniTitular = scanner.nextLine();

        System.out.println("Tu nombre:");
        String nomTitular = scanner.next();

        System.out.println("Introduce su saldo:");
        double saldo = scanner.nextDouble();
        
        // Generar el objeto y guardarlo en la posicion indicada.
        comptes[comptesCreats] = new CompteBancari(dniTitular, nomTitular, saldo);
        comptesCreats = comptesCreats + 1;
    }

    // Ingresar doblers.

    public static void ingressarDoblers() {
    
        System.out.println("Ingrese su DNI:");
        String dniTitular = scanner.next();
        scanner.nextLine();


        // Buscar en el array, donde esta la cuenta.
        for (int i = 0; i < comptesCreats; i++) { // Para no recorrer todos los 100 espacios.
            if (dniTitular.equals(comptes[i].getDniTitular())) {
                // comptes[i].setSaldo(cantidadAIngresar + comptes[i].getSaldo()); // Asignar saldo.

                System.out.println("Ingrese la cantidad a ingresar: ");

                int cantidadAIngresar = scanner.nextInt();

                comptes[i].ingresar(cantidadAIngresar);
            }
        }
    }

    // Reintegrar doblers.

    public static void reintegrarDoblers() {
        System.out.println("Ingrese su DNI:");
        String dniTitular = scanner.nextLine();

        // Buscar en el array, donde esta la cuenta.
        for (int i = 0; i < comptesCreats /* Para no recorre los 100 espacios. */; i++) {
            if (dniTitular.equals(comptes[i].getDniTitular())) {
                // comptes[i].setSaldo(cantidadAIngresar + comptes[i].getSaldo()); // Asignar saldo.

                System.out.println("Ingrese la cantidad a reintegrar: ");

                int cantidadAReintegrar = scanner.nextInt();

                comptes[i].reintegrar(cantidadAReintegrar);
            }
        }
    }

    // Mostrar saldo.
    public static void mostrarSaldo() {
        System.out.println("Ingrese su DNI:");
        String dniTitular = scanner.nextLine();

        for (int i = 0; i < comptesCreats /* Para no recorrer los 100 espacios. */; i++) {
            if (dniTitular.equals(comptes[i].getDniTitular())) {
                comptes[i].mostrarSaldo();
            }
        }
    }
}
