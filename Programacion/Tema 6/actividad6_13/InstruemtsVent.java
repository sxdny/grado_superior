package actividad6_13;

public class InstruemtsVent extends InstrumentsMusicals implements Sons {
    
    public InstruemtsVent() {
    }

    public InstruemtsVent(String idInstrument, String instrument, String tipoInstrument) {
        super(idInstrument, instrument, tipoInstrument);
    }

    @Override
	public void soProduit() {
		System.out.println("Sonido de un instrumento de Viento.");
	}

}
