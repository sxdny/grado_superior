package ac16;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

	public Ventana() {

		super("Programa dade alumne.");
		this.getContentPane().setLayout(new BorderLayout());

		JPanel titleJPanel = new JPanel(new BorderLayout());
		titleJPanel.setPreferredSize(new Dimension(100, 100));
		JLabel label1 = new JLabel("DADES ALUMNES");
		label1.setFont(new Font("Arial", Font.BOLD, 22));
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.CENTER);
		titleJPanel.add(label1);
		this.add(titleJPanel, BorderLayout.PAGE_START);

		SpringLayout layout = new SpringLayout();
		JTextField textField = new JTextField();
		JLabel label = new JLabel("Label");
		// For Horizontal Alignment
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, textField, 0, SpringLayout.HORIZONTAL_CENTER,
				this.getContentPane());

		// For Vertical Alignment
		layout.putConstraint(SpringLayout.VERTICAL_CENTER, textField, 0, SpringLayout.VERTICAL_CENTER,
				this.getContentPane());
		// For Horizontal Alignment
		layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, label, 0, SpringLayout.HORIZONTAL_CENTER,
				this.getContentPane());

		// For Vertical Alignment
		layout.putConstraint(SpringLayout.VERTICAL_CENTER, label, 0, SpringLayout.VERTICAL_CENTER,
				this.getContentPane());
		JPanel middlePanel = new JPanel(layout);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		textField.setPreferredSize(new Dimension(200, 20));
		layout.putConstraint(SpringLayout.WEST, textField, 5, SpringLayout.EAST, label);
		this.add(middlePanel, BorderLayout.CENTER);
		middlePanel.add(label);
		middlePanel.add(textField);

		JPanel downPanel = new JPanel(new BorderLayout());
		downPanel.setPreferredSize(new Dimension(100, 100));
		JLabel label3 = new JLabel("Abajo");
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setVerticalAlignment(JLabel.CENTER);
		downPanel.add(label3, BorderLayout.CENTER);
		this.add(downPanel, BorderLayout.PAGE_END);

		this.setMinimumSize(new Dimension(420, 420));
		this.pack();

	}

}
