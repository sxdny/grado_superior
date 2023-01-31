package actividad6_11;

import java.util.Arrays;
import java.util.Scanner;

public class LlistaLlibres {
    
    static Llibre[] llistaLlibres = new Llibre[100];
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

    public void mostraLlibres(String idLlibre) {

        for (int i = 0; i < llibresCreats; i++) {
            if (idLlibre == llistaLlibres[i].getIdLlibre()) {
                System.out.println(llistaLlibres[i].toString());
            }
        }

    }

}
