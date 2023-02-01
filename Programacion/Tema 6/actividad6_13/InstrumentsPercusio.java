package actividad6_13;

public class InstrumentsPercusio extends InstrumentsMusicals implements Sons {
    
    public InstrumentsPercusio() {
    }

    public InstrumentsPercusio(String idInstrument, String instrument, String tipoInstrument) {
        super(idInstrument, instrument, tipoInstrument);
    }

    @Override
	public void soProduit() {
		System.out.println("Sonido de un instrumento de Percusio.");
	}

}
