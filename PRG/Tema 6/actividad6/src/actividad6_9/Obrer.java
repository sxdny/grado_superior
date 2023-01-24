package actividad6_9;

public class Obrer extends Empleat {

    private String desti = new String();
    private int horasExtra = 0;
    private double preuHoresExtra = 0;

    // Constructors.

    public Obrer() {

    }
    
    public Obrer(String Nom, String Cognoms, String DNI, double salariBase, String desti, int horasExtra, double preuHoresExtra) {
        super(Nom, Cognoms, DNI, salariBase);
        this.desti = desti;
        this.horasExtra = horasExtra;
        this.preuHoresExtra = preuHoresExtra;
    }

    

    // Getters y setters.

    @Override
    public String toString() {
        return "Obrer [desti=" + desti + ", horasExtra=" + horasExtra + ", preuHoresExtra=" + preuHoresExtra + "]";
    }

    public String getDesti() {
        return desti;
    }

    public void setDesti(String desti) {
        this.desti = desti;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getPreuHoresExtra() {
        return preuHoresExtra;
    }

    public void setPreuHoresExtra(double preuHoresExtra) {
        this.preuHoresExtra = preuHoresExtra;
    }

    

    

}
