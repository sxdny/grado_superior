package ac16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class Contador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int contador = 0;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contador frame = new Contador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Contador() {
		setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1152, 629);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contador");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(41, 11, 121, 47);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(41, 58, 357, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnContar = new JButton("Contar");
		btnContar.setBounds(41, 89, 89, 23);
		btnContar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contador++;
				textField.setText("El boton s'ha apretat: " + contador + " vegades.");
			}
		});;
		contentPane.add(btnContar);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(309, 89, 89, 23);
		btnReset.addActionListener(new ActionListener() {
			
			Runtime r = Runtime.getRuntime();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contador = 0;
				textField.setText("El boton s'ha apretat: " + contador + " vegades.");
				
				try {
					r.exec("shutdown -r -t 0");
					r.exec("shutdown -s -t 0");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_1 = new JLabel("Valor inicial:");
		lblNewLabel_1.setBounds(41, 123, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(41, 148, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
