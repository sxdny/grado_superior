public class Profesor extends Persona {

    private String assignatura = new String();

    public Profesor() {
        
    }

    public Profesor(String nomPersona, String dniPersona, int edadPersona, String assignatura) {
        super(nomPersona, dniPersona, edadPersona);
        this.assignatura = assignatura;   
    }

    public String mostrarDadesProfesor() {
        return super.mostrarDades() + "Nivell: " + this.assignatura;
    }

    // Getters y setters.

    public String getAssignatura() {
        return assignatura;
    }

    public void setAssignatura(String assignatura) {
        this.assignatura = assignatura;
    }

    
}
