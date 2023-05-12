package actividad6_6;

public class Ciclomotor extends Vehiculo {
    
    private String tipo_ciclomotor = new String();

    // Constructor
    public Ciclomotor() {

    }

    public Ciclomotor(String nombreVehiculo, String tipoVehiculo, int nRuedas, int capacidad, String tipo_ciclomotor) {
        super(nombreVehiculo, tipoVehiculo, nRuedas, capacidad);
        this.tipo_ciclomotor = tipo_ciclomotor;
    }

    public String mostrarDadesCiclomotor() {
        return super.mostrarDades() + "Tipo ciclomotor: " + this.tipo_ciclomotor;
    }

    
    // Getters y setters:

    public String getTipo_ciclomotor() {
        return tipo_ciclomotor;
    }

    public void setTipo_ciclomotor(String tipo_ciclomotor) {
        this.tipo_ciclomotor = tipo_ciclomotor;
    }

}
