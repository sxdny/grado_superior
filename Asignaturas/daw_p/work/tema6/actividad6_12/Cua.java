package actividad6_12;

public class Cua {
    
    int nPersonas = 0;
    Persona[] cuaPersonas = new Persona[100];
    public Cua() {

    }

    public Cua(int nPersonas) {
        this.nPersonas = nPersonas;
    }

    public int getnPersonas() {
        return nPersonas;
    }

    public void setnPersonas(int nPersonas) {
        this.nPersonas = nPersonas;
    }

    @Override
    public String toString() {
        return "Cua [nPersonas=" + nPersonas + "]";
    }

    public void insertarPersona(Persona persona) {
        cuaPersonas[nPersonas] = persona;
        nPersonas++;
    }

    public void eliminarPersona() {
        nPersonas--;
        for (int i = 0; i < nPersonas; i++) {
            cuaPersonas[i] = cuaPersonas[i + 1];
        }
    }

    public void mostraEstatCua() {
        System.out.println("Numero de personas en la cola:");
        System.out.println(nPersonas);
        System.out.println("Personas:");
        for (int i = 0; i < nPersonas; i++) {
            System.out.println(cuaPersonas[i].toString());
        }
    }

}
