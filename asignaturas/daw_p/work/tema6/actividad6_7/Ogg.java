package actividad6_7;

public class Ogg extends Musica{
	@Override
	public void reproduir() {
		System.out.println("Reproduint ogg");
	}

    public Ogg() {

    }

    public Ogg(double durada) {
        super(durada);
    }
}

