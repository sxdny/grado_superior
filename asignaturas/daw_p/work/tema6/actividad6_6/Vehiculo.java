package actividad6_6;

public class Vehiculo {
    
    // Atributos del objeto "serVivo (un ser vivo)".
    protected String nombreVehiculo = new String();
    protected String tipoVehiculo = new String();
    protected int nRuedas = 0;
    protected int capacidad = 0;

    // Constructor.
    public Vehiculo() {

    }

    public Vehiculo(String nombreVehiculo, String tipoVehiculo, int nRuedas, int capacidad) {
        this.nombreVehiculo = nombreVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.nRuedas = nRuedas;
        this.capacidad = capacidad;
    }

    public String mostrarDades() {
        return "Nombre vehiculo:" + this.nombreVehiculo + " " + "Tipo Vehiculo:" + this.tipoVehiculo + " " + "Cantidad de ruedas: " + this.nRuedas + " " + "Capacidad del vehiculo: " + this.capacidad;
    }

    // Getters y setters.

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getnRuedas() {
        return nRuedas;
    }

    public void setEdadVehiculo(int nRuedas) {
        this.nRuedas = nRuedas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}