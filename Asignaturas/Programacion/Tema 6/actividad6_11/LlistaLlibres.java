package actividad6_11;

import java.util.Arrays;
import java.util.Scanner;

public class LlistaLlibres {
    
    /* Si no va, pone static. */Llibre[] llistaLlibres = new Llibre[100];
    static int llibresCreats = 0;
    static Scanner sc = new Scanner(System.in);

    public LlistaLlibres() {

    }

    public LlistaLlibres(Llibre[] llistaLlibres) {
        this.llistaLlibres = llistaLlibres;
    }

    public Llibre[] getllistaLlibres() {
        return llistaLlibres;
    }

    public void setllistaLlibres(Llibre[] llistaLlibres) {
        this.llistaLlibres = llistaLlibres;
    }

    @Override
    public String toString() {
        return "LlistaLlibres [LlistaLlibres=" + Arrays.toString(llistaLlibres) + "]";
    }

    public void insertarLlibre(Llibre llibre) {
        llistaLlibres[llibresCreats] = llibre;
        llibresCreats++;
    }

    public void mostrarTodosLlibres() {
        for (int i = 0; i < llibresCreats; i++) {
            System.out.println(llistaLlibres[i].toString());
        }
        
    }

    public void mostraLlibres(String idLlibre) {
        for (int i = 0; i < llibresCreats; i++) {
            if (idLlibre.equals(llistaLlibres[i].getIdLlibre())) {
                System.out.println(llistaLlibres[i].toString());
            }
        }
    }

    public void eliminarLlibres(String idLlibre) {

        for (int i = 0; i < llibresCreats; i++) { 
            if (idLlibre.equals(llistaLlibres[i].getIdLlibre())) {
                llibresCreats--;
                for (int j = i; j < llibresCreats; j++) {
                    llistaLlibres[i] = llistaLlibres[j + 1];
                }
            }
        }
    }

    public void editarLlibres(String idLlibre) {

        int op = 0;
        
        for (int i = 0; i < llibresCreats; i++) { 
            if (idLlibre.equals(llistaLlibres[i].getIdLlibre())) {
                System.out.println("Que quieres editar?");
                System.out.println("1. Titulo.");
                System.out.println("2. Autor.");
                System.out.println("3. Genero.");
                System.out.println("4. Numero paginas.");

                op = sc.nextInt();
                sc.nextLine();

                if (op == 1) {
                    System.out.println("Introduce un nuevo Titulo:");
                    String nTitulo = sc.nextLine();
                    llistaLlibres[i].setTitulo(nTitulo);
                }

                if (op == 2) {
                    System.out.println("Introduce un nuevo Autor:");
                    String nAutor = sc.nextLine();
                    llistaLlibres[i].setAutor(nAutor);
                }

                if (op == 3) {
                    System.out.println("Introduce un nuevo Genero:");
                    String nGenero = sc.nextLine();
                    llistaLlibres[i].setGenero(nGenero);
                }

                if (op == 4) {
                    System.out.println("Introduce un nuevo Numero de paginas:");
                    int nNumeroPaginas = sc.nextInt();
                    sc.nextLine();
                    llistaLlibres[i].setPaginas(nNumeroPaginas);
                }

                if (op < 0 || op >= 5) {
                    System.out.println("No has elegido una opcion valida...");
                }

            }
        }

    }

}

