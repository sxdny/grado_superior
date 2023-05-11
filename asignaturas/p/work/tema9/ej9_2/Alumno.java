public class Alumno extends Persona {

    private String nivelAc = new String();
    
    public Alumno() {

    }

    public Alumno(String nomPersona, String dniPersona, int edadPersona, String nivelAc) {
        super(nomPersona, dniPersona, edadPersona);
        this.nivelAc = nivelAc;
    }

    public String mostrarDadesAlumne() {
        return super.mostrarDades() + "Nivell: " + this.nivelAc;
    }
}
