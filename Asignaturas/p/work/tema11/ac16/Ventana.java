package ac16;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

import javax.swing.*;

public class Ventana extends JFrame{

	public Ventana() {
		
		super ("Programa dade alumne.");
		this.getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		
		
		JPanel panel1 = new JPanel(); // panel para título
		JLabel label1 = new JLabel("DADES DE L'ALUMNE");
		label1.setFont(new Font("Arial", Font.BOLD, 24));
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.weighty = 1.0;
		this.add(panel1, constraints);
		constraints.weighty = 0.0;
		
		JPanel panel2 = new JPanel(); // panel para input usuario
		JLabel labelDNI = new JLabel("DNI");
		JTextArea tADNIArea = new JTextArea();
		JLabel labelNOM = new JLabel("NOM");
		JTextArea tANOMArea = new JTextArea();
		JLabel labelEDAT = new JLabel("EDAT");
		JTextArea tAEDATArea = new JTextArea();
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.weighty = 1.0;
		
		panel2.add(labelDNI);
		panel1.add(tADNIArea);
		panel2.add(labelNOM);
		panel1.add(tANOMArea);
		panel2.add(labelEDAT);
		panel1.add(tAEDATArea);
		
		this.add(panel2, constraints);
		constraints.weighty = 0.0;
		
		JPanel panel3 = new JPanel(); // panel para input usuario
		JLabel label3 = new JLabel("NIVELL");
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.weighty = 1.0;
		this.add(panel3, constraints);
		constraints.weighty = 0.0;
		
		panel3.add(label3);
		
		panel1.add(label1);
		
		
	}
	
}
