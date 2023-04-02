package actividad6_13;

public class InstrumentsPercusio extends InstrumentsMusicals {
    
    public InstrumentsPercusio() {
    }

    public InstrumentsPercusio(String idInstrument, String instrument, String tipoInstrument) {
        super(idInstrument, instrument, tipoInstrument);
    }

    @Override
	public String soProduit() {
		return "Sonido de instrumento de Percusio";
	}

}
