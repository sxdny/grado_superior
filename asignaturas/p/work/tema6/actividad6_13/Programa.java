package actividad6_13;

import java.util.Scanner;

public class Programa {
    
    static Scanner sc = new Scanner(System.in);
    static int opcion = 0;
    static InstrumentsMusicals[] instruments = new InstrumentsMusicals[100];
    static int instrumentsCreats = 0;

    public static void main(String[] args) {
        
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Crear un Instrument.");
            System.out.println("2. Tocar Instrument.");
            System.out.println("3. Salir del programa.");
    
            opcion = sc.nextInt();
            sc.nextLine();
    
            if (opcion == 1) {
                crearInstrument();
            }
    
            if (opcion == 2) {
                tocarInstrument(); 
            }
    
            if (opcion < 0 || opcion >= 4) {
                System.out.println("Opcion no valida.");
            }

        } while (opcion != 3);
        System.out.println("Has salido correctament del programa.");

    }

    public static void crearInstrument() {

        System.out.println("Que instrumento desea crear?");
        System.out.println("1. Instrumento de Viento.");
        System.out.println("2. Instrumento de Percusio.");

        int op = 0;
        op = sc.nextInt();
        sc.nextLine();

        if (op == 1) {
            
            System.out.println("Introduce el nombre del instrumento:");
            String instrument = sc.nextLine();
            System.out.println("Introduce un ID para el instrumento:");
            String idInstrument = sc.nextLine();
            String tipoInstrument = "Viento";

            instruments[instrumentsCreats] = new InstruemtsVent(idInstrument,instrument, tipoInstrument);
            instrumentsCreats++;

        }

        else {

            System.out.println("Introduce el nombre del instrumento:");
            String instrument = sc.nextLine();
            System.out.println("Introduce un ID para el instrumento:");
            String idInstrument = sc.nextLine();
            String tipoInstrument = "Percusio";

            instruments[instrumentsCreats] = new InstrumentsPercusio(idInstrument,instrument, tipoInstrument);
            instrumentsCreats++;

        }

    }

    public static void tocarInstrument() {

        System.out.println("Introduzca el ID del libro:");
        String idInstrument = sc.nextLine();
        
        for (int i = 0; i < instrumentsCreats; i++) {
            if (idInstrument.equalsIgnoreCase(instruments[i].getIdInstrument())) {
                
                if (instruments[i] instanceof InstruemtsVent) {
                    System.out.println(instruments[i].soProduit());
                }

                if (instruments[i] instanceof InstrumentsPercusio) {
                    System.out.println(instruments[i].soProduit());
                }

            }
        }

    }

}
