
public class Alumno {

	String nombre = new String();
	String apellidos = new String();
	String curso = new String();
	int edad = 0;
	
	public Alumno(String nombre, String apellidos, String curso, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.edad = edad;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + ", edad=" + edad + "]";
	}
	
}


