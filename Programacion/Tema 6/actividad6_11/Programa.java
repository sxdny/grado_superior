package actividad6_11;

import java.util.Scanner;
import java.util.UUID;

public class Programa {
    
    static int opcion = 0;
    static Scanner sc = new Scanner(System.in);
    static LlistaLlibres llibres = new LlistaLlibres();
    static int llibresCreats = 0;

    public static void main(String[] args) {
        
        do {
            
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1. Crear un *NUEVO* libro.");
            System.out.println("2. Modificar un libro.");
            System.out.println("3. Mostrar el libro.");
            System.out.println("4. Eliminar un libro.");
            System.out.println("5. Salir del progama.");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                insertarLlibre();
            }

            if (opcion == 2) {
                // editarLllibre();
            }

            if (opcion == 3) {
                mostrarLlibres();
            }

            if (opcion == 4) {
                // eliminarLlibre();
            }

            if (opcion == 5) {
                System.exit(0);
            }

            if (opcion < 0 || opcion >= 6) {
                System.out.println("Na has elegido una opción válida.");
            }

        } while (opcion != 5);
        System.out.println("Has salido correctamente del programa.");

    }

    public static String generarCodigoLlibre(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static void insertarLlibre() {

        System.out.println("Introduzca el titulo del libro:");
        String titulo = sc.nextLine();
        System.out.println("Introduzca el autor del libro:");
        String autor = sc.nextLine();
        System.out.println("Introduzca el genero del libro:");
        String genero = sc.nextLine();
        System.out.println("Introduzca las paginas que contiene el libre:");
        int paginas = sc.nextInt();
        sc.nextLine();

        String idLlibre = generarCodigoLlibre();
        System.out.println("Libro creado! ID del libro = " + idLlibre);

        Llibre llibre = new Llibre(titulo, autor, genero, idLlibre, paginas);

        llibres.insertarLlibre(llibre);
        
    }

    public static void mostrarLlibres() {

        System.out.println("Inserte el ID del libro que desee mostrar:");
        String idLlibre = sc.nextLine();

        llibres.mostraLlibres(idLlibre);

    }

    
    // public static void mostrarLlibre() {

    //     System.out.println("Inserte el ID del libro para mostralo:");
    //     String idLlibre = sc.nextLine();
    //     for (int i = 0; i < LlistaLlibres.llibresCreats; i++) { 
    //         if (idLlibre == LlistaLlibres.llistaLlibres[i].getIdLlibre()) {
    //             LlistaLlibres.llistaLlibres[i].toString();
    //         }
    //     }
    // }

    // public static void eliminarLlibre() {

    //     System.out.println("Inserte el ID del libro que quieres eliminar:");
    //     String idLlibre = sc.nextLine();

    //     for (int i = 0; i < LlistaLlibres.llibresCreats; i++) { 
    //         if (idLlibre == LlistaLlibres.llistaLlibres[i].getIdLlibre()) {
    //             for (int j = i; j < LlistaLlibres.llibresCreats; j++) {
    //                 LlistaLlibres.llistaLlibres[i] = LlistaLlibres.llistaLlibres[j + 1];
    //             }
    //         }
    //     }
    // }


    // public static void editarLllibre() {

    //     System.out.println("Inserte el ID del libro que quiera editar:");
    //     String idLlibre = sc.nextLine();
    //     int op = 0;

    //     for (int i = 0; i < LlistaLlibres.llibresCreats; i++) { 
    //         if (idLlibre == LlistaLlibres.llistaLlibres[i].getIdLlibre()) {
                
    //             System.out.println("Que quieres editar?");
    //             System.out.println("1. Titulo.");
    //             System.out.println("2. Autor.");
    //             System.out.println("3. Genero.");
    //             System.out.println("4. Numero paginas.");

    //             op = sc.nextInt();
    //             sc.nextLine();

    //             if (op == 1) {
    //                 System.out.println("Introduce un nuevo Titulo:");
    //                 String titulo = sc.nextLine();
    //                 LlistaLlibres.llistaLlibres[i].setTitulo(titulo);
    //             }

    //             if (op == 2) {
    //                 System.out.println("Introduce un nuevo Autor:");
    //                 String autor = sc.nextLine();
    //                 LlistaLlibres.llistaLlibres[i].setAutor(autor);
    //             }

    //             if (op == 3) {
    //                 System.out.println("Introduce un nuevo Genero:");
    //                 String genero = sc.nextLine();
    //                 LlistaLlibres.llistaLlibres[i].setGenero(genero);
    //             }

    //             if (op == 4) {
    //                 System.out.println("Introduce un nuevo Numero de paginas:");
    //                 int nPaginas = sc.nextInt();
    //                 LlistaLlibres.llistaLlibres[i].setPaginas(nPaginas);
    //             }

    //             if (op < 0 || op >= 5) {
    //                 System.out.println("No has elegido una opcion válida.");
    //             }


    //         }
    //     }

    // }

}
