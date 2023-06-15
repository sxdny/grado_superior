import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CelsiusAFahreinheirt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private double conversor = 0.0;
	private double fah = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelsiusAFahreinheirt frame = new CelsiusAFahreinheirt();
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
	public CelsiusAFahreinheirt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		
		textField.setBounds(46, 60, 120, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Conversor Celsius a Fahrenheirt");
		lblNewLabel.setBounds(106, 11, 224, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(376, 19, 1, 1);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(251, 60, 120, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Celsius");
		lblNewLabel_1.setBounds(46, 91, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fahrenheirt");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBounds(251, 91, 76, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblSon = new JLabel("Son");
		lblSon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSon.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSon.setBounds(176, 58, 55, 20);
		contentPane.add(lblSon);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// obtengo el valor
				conversor = Integer.parseInt(textField.getText());
				fah = (conversor * 9 / 5) + 32;
				
				textField_1.setText(fah + " Celsius");
			}
		});
		
		btnNewButton.setBounds(163, 137, 89, 23);
		contentPane.add(btnNewButton);
	}
}
