package actividad6_6;

public class Barco extends Vehiculo {
    
    private String tipo_barco = new String();
    
    // Constructor.
    public Barco() {
        
    }

    public Barco(String nombreVehiculo, String tipoVehiculo, int nRuedas, String tipo_barco, int capacidad) {
        super(nombreVehiculo, tipoVehiculo, nRuedas, capacidad);
        this.tipo_barco = tipo_barco;
    }

    public String mostrarDadesBarco() {
        return super.mostrarDades() + "Tipo de barco: " + this.tipo_barco;
    }

    // Getters y setters.

    public String getTipo_barco() {
        return tipo_barco;
    }

    public void setTipo_barco(String tipo_barco) {
        this.tipo_barco = tipo_barco;
    }

}
