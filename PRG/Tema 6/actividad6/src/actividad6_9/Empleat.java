package actividad6_9;

public class Empleat {

    private String Nom = new String();
    private String Cognoms = new String();
    private String DNI = new String();
    private double salariBase = 0;

    //  Constructor.
    public Empleat() {
    
    }

    public Empleat(String Nom, String Cognoms, String DNI, double salariBase) {
        this.Nom = Nom;
        this.Cognoms = Cognoms;
        this.DNI = DNI;
        this.salariBase = salariBase;
    }

    // Getters y setters.

    @Override
    public String toString() {
        return "Empleat [Nom=" + Nom + ", Cognoms=" + Cognoms + ", DNI=" + DNI + ", salariBase=" + salariBase + "]";
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getCognoms() {
        return Cognoms;
    }

    public void setCognoms(String cognoms) {
        Cognoms = cognoms;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public double getSalariBase() {
        return salariBase;
    }

    public void setSalariBase(double salariBase) {
        this.salariBase = salariBase;
    }

    

}
