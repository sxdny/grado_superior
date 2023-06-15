package act12_3;

import java.io.Serializable;

public class Profesor extends Persona implements Serializable  {

    private String asignatura = new String();
    
    public Profesor() {

    }

    public Profesor(String nombre, String apellidos, int edadPersona, String asignatura) {
        super(nombre, apellidos, edadPersona);
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor [asignatura=" + asignatura + "]";
    }

    
}
