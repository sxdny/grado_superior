package actividad6_9;

public class Qualificat extends Empleat {
    
    private String titulacio = new String();
    private String departament = new String();
    private double plus = 0;

    
    // Constuctor.

    public Qualificat() {

    }
    
    public Qualificat(String Nom, String Cognoms, String DNI, double salariBase, String titulacio, String departament,double plus) {
        super(Nom, Cognoms, DNI, salariBase);
        this.titulacio = titulacio;
        this.departament = departament;
        this.plus = plus;
    }

    
    // Getters y setters.

    @Override
    public String toString() {
        return "Qualificat [titulacio=" + titulacio + ", departament=" + departament + ", plus=" + plus + "]";
    }

    public String getTitulacio() {
        return titulacio;
    }

    public void setTitulacio(String titulacio) {
        this.titulacio = titulacio;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public double getPlus() {
        return plus;
    }

    public void setPlus(double plus) {
        this.plus = plus;
    }

    

}
