package actividad6_5;

public class Persona {
    // Atributos del objeto.
    protected String nomPersona = new String();
    protected String dniPersona = new String();
    protected int edadPersona = 0;

    // Constructor.
    public Persona() {

    }

    public Persona(String nomPersona, String dniPersona, int edadPersona) {
        this.nomPersona = nomPersona;
        this.dniPersona = dniPersona;
        this.edadPersona = edadPersona;
    }

    public String mostrarDades() {
        return "Nom: " + this.nomPersona + " " + "DNI: " + this.dniPersona + " " + "Edad: " + this.edadPersona;
    }

    // Getters y setters.

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public String getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(String dniPersona) {
        this.dniPersona = dniPersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    

}
