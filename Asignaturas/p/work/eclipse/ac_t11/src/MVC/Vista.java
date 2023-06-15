import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEdad;
	private JTextField textFieldNombre;
	private JButton btnMoreYears;
	private JButton btnLessYears;
	private JLabel lblResult;

	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setColumns(10);
		
		JLabel lblEdad = new JLabel("Age");
		
		JLabel lblNombre = new JLabel("Name");
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		
		btnMoreYears = new JButton("Add years");
		btnMoreYears.setActionCommand("ADDYEARS");
		
		btnLessYears = new JButton("Substract years");
		btnLessYears.setActionCommand("SUBYEARS");
		
		lblResult = new JLabel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEdad, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnMoreYears)
							.addPreferredGap(ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
							.addComponent(btnLessYears))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblResult, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
							.addGap(11)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEdad)
						.addComponent(textFieldEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addComponent(lblResult)
					.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnMoreYears)
						.addComponent(btnLessYears))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getTextFieldEdad() {
		return textFieldEdad;
	}

	public void setTextFieldEdad(JTextField textFieldEdad) {
		this.textFieldEdad = textFieldEdad;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public JLabel getLblResult() {
		return lblResult;
	}

	public void setLblResult(JLabel lblResult) {
		this.lblResult = lblResult;
	}
	
	void setControlador(Controlador c) {
		btnMoreYears.addActionListener(c);
		btnLessYears.addActionListener(c);
	}
}
