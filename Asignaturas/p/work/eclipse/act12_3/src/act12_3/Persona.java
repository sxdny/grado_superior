package act12_3;

public class Persona {
    // Atributos del objeto.
    protected String nombre = new String();
    protected String apellidos = new String();
    protected int edadPersona = 0;

    // Constructor.
    public Persona() {

    }

    public Persona(String nombre, String apellidos, int edadPersona) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edadPersona = edadPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    @Override
    public String toString() {
        return "Persona [apellidos=" + apellidos + ", edadPersona=" + edadPersona + ", nombre=" + nombre + "]";
    }

}
