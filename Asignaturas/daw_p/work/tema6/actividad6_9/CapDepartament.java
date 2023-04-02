package actividad6_9;

public class CapDepartament extends Qualificat {
    
    private int treballadorsAlCarrec = 0;
    private int projectes = 0;
    

    public CapDepartament() {

    }

    public String mostrarDadesBarco() {
        return super.mostrarDades() + "Treballadores al carrec: " + this.treballadorsAlCarrec + " " + "Projectes: " + this.projectes;
    }

    @Override
    public String toString() {
        return "CapDepartament [treballadorsAlCarrec=" + treballadorsAlCarrec + ", projectes=" + projectes + "]";
    }

    public CapDepartament(String Nom, String Cognoms, String DNI, double salariBase, String titulacio,
            String departament, double plus, int treballadorsAlCarrec, int projectes) {
        super(Nom, Cognoms, DNI, salariBase, titulacio, departament, plus);
        this.treballadorsAlCarrec = treballadorsAlCarrec;
        this.projectes = projectes;
    }

    public int getTreballadorsAlCarrec() {
        return treballadorsAlCarrec;
    }

    public void setTreballadorsAlCarrec(int treballadorsAlCarrec) {
        this.treballadorsAlCarrec = treballadorsAlCarrec;
    }

    public int getProjectes() {
        return projectes;
    }

    public void setProjectes(int projectes) {
        this.projectes = projectes;
    }

}
