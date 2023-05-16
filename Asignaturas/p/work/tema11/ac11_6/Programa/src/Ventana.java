import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class Ventana extends JFrame{

	public Ventana() {
		
		super ("Programa dade alumne.");
		this.getContentPane().setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		
		JLabel label = new JLabel("Hola me como pitos todos los dias de la semana.");
		
	}
	
}

