package actividad6_12;

public class Persona {
    
    String nom = new String();
    String cognoms = new String();
    String DNI = new String();
    int edad = 0;

    public Persona() {
        
    }
    
    public Persona(String nom, String cognoms, String DNI, int edad) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.DNI = DNI;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nom=" + nom + ", cognoms=" + cognoms + ", DNI=" + DNI + ", edad=" + edad + "]";
    }

    


}
