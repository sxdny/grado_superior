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
            System.out.println("1. Crear Instrument de Vent.");
            System.out.println("2. Crear Instrument de Percusio.");
            System.out.println("3. Tocar Instrument.");
            System.out.println("4. Salir del programa.");
    
            opcion = sc.nextInt();
            sc.nextLine();
    
            if (opcion == 1) {
                crearInstrumentVent();
            }
    
            if (opcion == 2) {
                crearInstrumentVent();
            }
    
            if (opcion == 3) {
                tocarInstrument();
            }
    
            if (opcion < 0 || opcion >= 5) {
                System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);
        System.out.println("Has salido correctament del programa.");

    }

    public static void crearInstrumentVent() {

        String tipoInstrument = "Vent";
        System.out.println("Nombre del instrumento:");
        String instrument = sc.nextLine();
        System.out.println("Asigne un ID a este instrumento:");
        String idInstrument = sc.nextLine();

        instruments[instrumentsCreats] = new InstruemtsVent(idInstrument, instrument, tipoInstrument);
        instrumentsCreats++;
        
    }

    public static void crearInstrumentPercusio() {

        String tipoInstrument = "Percusio";
        System.out.println("Nombre del instrumento:");
        String instrument = sc.nextLine();
        System.out.println("Asigne un ID a este instrumento:");
        String idInstrument = sc.nextLine();

        instruments[instrumentsCreats] = new InstrumentsPercusio(idInstrument, instrument, tipoInstrument);
        instrumentsCreats++;
        
    }

    public static void tocarInstrument() {

        System.out.println("Introduzca el ID del libro:");
        String idInstrument = sc.nextLine();
        
        for (int i = 0; i < instrumentsCreats; i++) {
            if (idInstrument.equalsIgnoreCase(instruments[i].getIdInstrument())) {
                System.out.println("Tocando el instrumento " + instruments[i].getInstrument());
                instruments[i].soProduit();
            }
        }

    }

}
