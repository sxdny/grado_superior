package actividad6_13;

public class InstruemtsVent extends InstrumentsMusicals {
    
    public InstruemtsVent() {
    }

    public InstruemtsVent(String idInstrument, String instrument, String tipoInstrument) {
        super(idInstrument, instrument, tipoInstrument);
    }

    @Override
	public String soProduit() {
		return "Sonido de instrumento de Vent";
	}

}
