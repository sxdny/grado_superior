package actividad6_1;

public class Persona {
    String dni = new String();
    String nom = new String();
    short edat = 0;

    public Persona() {

    }

    public Persona(String nom, String dni, short edat) {
        this.nom = nom;
        this.dni = dni;
        this.edat = edat;
    }

    // Getters y setters.

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public short getEdat() {
        return edat;
    }
    public void setEdat(short edat) {
        this.edat = edat;
    }

    public void mostrarDatos () {
        System.out.println("Visualitzacio de dades de la persona p1:");
        System.out.println("DNI..........:" + dni);
        System.out.println("Nom..........:" + nom);
        System.out.println("Edat..........:" + edat);
    }

    

}
