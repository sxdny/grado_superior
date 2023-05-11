package actividad6_2;

public class CompteBancari {
    private String dniTitular = new String(); // En vez de las comillas.
    private String nomTitular = new String();
    private double saldo = 0;

    // No necesita ni void ni un return. Solo constructores.
    public CompteBancari() {

    }

    // Constructor. Mismo nombre de la clase.
    
    // Asignar lo que le enviamos. this.x
    public CompteBancari(String dniTitular, String nomTitular, double saldo) {
        this.dniTitular = dniTitular;
        this.nomTitular = nomTitular;
        this.saldo = saldo;
    }

    // Ingresar saldo en la cuenta.
    public void ingresar(double quantitat) {
        saldo += quantitat; // saldo = saldo + quantitat.
    }

    // Quitar saldo de la cuenta.
    public void reintegrar(double quantitat) {
        saldo -= quantitat; // saldo = saldo - quantitat.
    }

    // Mostrar saldo disponible de la cuenta.
    public void mostrarSaldo() {
        System.out.println("Saldo disponible: " + saldo);
    }

    /* Getters y setters.
     * Set. Recibe una string y lo asigna
     * Get. Hace un return.
     */

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public String getNomTitular() {
        return nomTitular;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
}
