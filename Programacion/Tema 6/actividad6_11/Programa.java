import java.util.Scanner;

public class Programa {
    
    static int opcion = 0;
    static Scanner sc = new Scanner(System.in);

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
                LlistaLlibres.insertarLlibre();
            }

            if (opcion == 2) {
                LlistaLlibres.editarLllibre();;
            }

            if (opcion == 3) {
                LlistaLlibres.mostrarLlibre();
            }

            if (opcion == 4) {
                LlistaLlibres.eliminarLlibre();
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

}
