import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class VentanaListar extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListar frame = new VentanaListar();
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
	public VentanaListar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] columnas = {"ID de usuario", "Nombre de usuario", "Puntuacion Record", "Lista de partidas"};
		Object[][] datosTabla = {
				{1, "SDNY", 255, "Hola" },
				{2, "SDNY", 255, "Hola" },
				{3, "SDNY", 255, "Hola" },
				{4, "SDNY", 255, "Hola" },
				{5, "SDNY", 255, "Hola" }
		};
		
		
		table = new JTable(datosTabla, columnas);
		table.setForeground(new Color(47, 79, 79));
		table.setBackground(new Color(255, 255, 255));
		
		table.setBounds(10, 77, 666, 392);
		
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Lista de usuarios:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 34, 666, 21);
		contentPane.add(lblNewLabel);
	}
}
