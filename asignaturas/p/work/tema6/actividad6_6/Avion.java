package actividad6_6;

public class Avion extends Vehiculo {
    
    private int alas = 0;

    // Constructor.
    public Avion() {

    }

    public Avion(String nombreVehiculo, String tipoVehiculo, int nRuedas, int alas, int capacidad) {
        super(nombreVehiculo, tipoVehiculo, nRuedas, capacidad);
        this.alas = alas;
    }

    public String mostrarDadesAvion() {
        return super.mostrarDades() + "Cantidad de alas:" + this.alas;
    }

    // Getters y setters:

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

}
