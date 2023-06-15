

public class Programa {

	public static void main(String[] args) {
		
		
		Model m = new Model();
		Vista v = new Vista();
		Controlador c = new Controlador(m,v);
		
		v.setControlador(c);
		v.setVisible(true);
	}

}




