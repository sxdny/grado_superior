package act12_2;

import java.io.Serializable;

public class Alumno extends Persona implements Serializable  {

    private String curso = new String();
    
    public Alumno() {

    }

    public Alumno(String nombre, String apellidos, int edadPersona, String curso) {
        super(nombre, apellidos, edadPersona);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno [curso=" + curso + "]";
    }

    
}
