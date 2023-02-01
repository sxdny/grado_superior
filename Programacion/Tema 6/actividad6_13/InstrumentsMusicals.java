package actividad6_13;

public class InstrumentsMusicals implements Sons {
    
    String idInstrument = new String();
    String instrument = new String();
    String tipoInstrument = new String();

    public InstrumentsMusicals() {

    }

    public InstrumentsMusicals(String idInstrument,String instrument, String tipoInstrument) {
        this.idInstrument = idInstrument;
        this.instrument = instrument;
        this.tipoInstrument = tipoInstrument;
    }

    public String getIdInstrument() {
        return idInstrument;
    }

    public void setIdInstrument(String idInstrument) {
        this.idInstrument = idInstrument;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getTipoInstrument() {
        return tipoInstrument;
    }

    public void setTipoInstrument(String tipoInstrument) {
        this.tipoInstrument = tipoInstrument;
    }

    @Override
    public String toString() {
        return "InstrumentsMusicals [instrument=" + instrument + ", tipoInstrument=" + tipoInstrument + "]";
    }

    @Override
    public void soProduit() {
        
    }

}
