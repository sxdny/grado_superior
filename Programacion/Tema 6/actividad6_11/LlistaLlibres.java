import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class LlistaLlibres {
    
    static Llibre[] LlistaLlibres = new Llibre[100];
    static int llibresCreats = 0;
    static Scanner sc = new Scanner(System.in);

    public LlistaLlibres() {

    }

    public LlistaLlibres(Llibre[] llistaLlibres) {
        this.LlistaLlibres = llistaLlibres;
    }

    public Llibre[] getLlistaLlibres() {
        return LlistaLlibres;
    }

    public void setLlistaLlibres(Llibre[] llistaLlibres) {
        LlistaLlibres = llistaLlibres;
    }

    @Override
    public String toString() {
        return "LlistaLlibres [LlistaLlibres=" + Arrays.toString(LlistaLlibres) + "]";
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

        LlistaLlibres[llibresCreats] = new Llibre(titulo, autor, genero, idLlibre, paginas);
        llibresCreats++;
    }

    public static void mostrarLlibre() {

        System.out.println("Inserte el ID del libro para mostralo:");
        String idLlibre = sc.nextLine();
        for (int i = 0; i < LlistaLlibres.length; i++) { 
            if (idLlibre.equals(LlistaLlibres[i].getIdLlibre())) {
                LlistaLlibres[i].toString();
            }
            else {
                System.out.println("err.");
            }
        }
    }

    public static void eliminarLlibre() {

        System.out.println("Inserte el ID del libro que quieres eliminar:");
        String idLlibre = sc.nextLine();

        for (int i = 0; i < llibresCreats; i++) { 
            if (idLlibre.equals(LlistaLlibres[i].getIdLlibre())) {
                for (int j = i; j < llibresCreats; j++) {
                    LlistaLlibres[i] = LlistaLlibres[j + 1];
                }
            }
        }
    }


    public static void editarLllibre() {

        System.out.println("Inserte el ID del libro que quiera editar:");
        String idLlibre = sc.nextLine();
        int op = 0;

        for (int i = 0; i < llibresCreats; i++) { 
            if (idLlibre.equals(LlistaLlibres[i].getIdLlibre())) {
                
                System.out.println("Que quieres editar?");
                System.out.println("1. Titulo.");
                System.out.println("2. Autor.");
                System.out.println("3. Genero.");
                System.out.println("4. Numero paginas.");

                op = sc.nextInt();
                sc.nextLine();

                if (op == 1) {
                    System.out.println("Introduce un nuevo Titulo:");
                    String titulo = sc.nextLine();
                    LlistaLlibres[i].setTitulo(titulo);
                }

                if (op == 2) {
                    System.out.println("Introduce un nuevo Autor:");
                    String autor = sc.nextLine();
                    LlistaLlibres[i].setAutor(autor);
                }

                if (op == 3) {
                    System.out.println("Introduce un nuevo Genero:");
                    String genero = sc.nextLine();
                    LlistaLlibres[i].setGenero(genero);
                }

                if (op == 4) {
                    System.out.println("Introduce un nuevo Numero de paginas:");
                    int nPaginas = sc.nextInt();
                    LlistaLlibres[i].setPaginas(nPaginas);
                }

                if (op < 0 || op >= 5) {
                    System.out.println("No has elegido una opcion válida.");
                }


            }
        }

    }
}
