package act12_2;

import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.Statement;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class AlumnosYProfesores extends JFrame {

	File personasFile = new File("personas.txt");

	static int alumnosCreados = 0;
	static int profesoresCreados = 0;

	Vector<Alumno> alumnos = new Vector<>();
	Vector<Profesor> profesores = new Vector<>();
	Vector<Persona> personas = new Vector<>();

	FileOutputStream fos;
	ObjectOutputStream oos;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					// conexión a la base de datos (para recibir los indices)
					String urlDatabase = "jbdc:mysql://localhost:3306/instituto";

					String user = "root";
					String passwd = "";
					
					try {
						
						Connection con = DriverManager.getConnection(urlDatabase, user, passwd);
						java.sql.Statement stmt = con.createStatement();
						
						// recibir indices
						ResultSet resultSet = stmt.executeQuery("SELECT COUNT(*) FROM alumnes");
						ResultSet resultSet2 = stmt.executeQuery("SELECT COUNT(*) FROM profesores");
						
						alumnosCreados = Integer.parseInt(resultSet.getString("id"));
						profesoresCreados = Integer.parseInt(resultSet2.getString("id"));
						
					} catch (Exception e) {
						System.out.println(e);

					}
					
					// creación del frame
					AlumnosYProfesores frame = new AlumnosYProfesores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public AlumnosYProfesores() throws IOException {
		
		setTitle("Inserción de alumnos y profesores en la base de datos.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 553);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu_2 = new JMenu("Opciones");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Salir");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_4);

		JMenu mnNewMenu = new JMenu("Insertar");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Alumno");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JPanel fields = new JPanel();
				GridLayout gridLayout = new GridLayout(4, 1);
				gridLayout.setVgap(5);
				fields.setLayout(gridLayout);
				fields.add(new JLabel("Nombre:"));
				JTextField tFNombreField = new JTextField(10);
				fields.add(tFNombreField);
				fields.add(new JLabel("Apellidos:"));
				JTextField tFApellidosField = new JTextField(10);
				fields.add(tFApellidosField);
				fields.add(new JLabel("Curso:"));
				JTextField tFCursoField = new JTextField(10);
				fields.add(tFCursoField);
				fields.add(new JLabel("Edad:"));
				JTextField tFEdadField = new JTextField(10);
				fields.add(tFEdadField);

				JOptionPane.showConfirmDialog(null, fields, "Inserte los datos del Alumno",
						JOptionPane.OK_CANCEL_OPTION);

				String nombre = tFNombreField.getText();
				String apellidos = tFApellidosField.getText();
				String cursoString = tFCursoField.getText();
				int edad = Integer.parseInt(tFEdadField.getText());

				personas.add(new Alumno(nombre, apellidos, edad, cursoString));
				alumnosCreados++;

				String urlBaseDeDatoString = "jdbc:mysql://localhost:3306/instituto";

				String usuari = "root";
				String password = "";

				try {
					
					Connection con = DriverManager.getConnection(urlBaseDeDatoString, usuari, password);

					PreparedStatement stmt = con.prepareStatement("INSERT INTO alumnes VALUES(?,?,?,?,?)");

					stmt.setInt(1, alumnosCreados);
					stmt.setString(2, nombre);
					stmt.setString(3, apellidos);
					stmt.setInt(4, edad);
					stmt.setString(5, cursoString);

					int i = stmt.executeUpdate();
					System.out.println(i + " records inserted");

					con.close();

				} catch (Exception ex) {
					System.out.println(ex);
				}

			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Profesor");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JPanel fields = new JPanel();
				GridLayout gridLayout = new GridLayout(4, 1);
				gridLayout.setVgap(5);
				fields.setLayout(gridLayout);
				fields.add(new JLabel("Nombre:"));
				JTextField tFNombreField = new JTextField(10);
				fields.add(tFNombreField);
				fields.add(new JLabel("Apellidos:"));
				JTextField tFApellidosField = new JTextField(10);
				fields.add(tFApellidosField);
				fields.add(new JLabel("Asignatura:"));
				JTextField tFCursoField = new JTextField(10);
				fields.add(tFCursoField);
				fields.add(new JLabel("Edad:"));
				JTextField tFEdadField = new JTextField(10);
				fields.add(tFEdadField);

				JOptionPane.showConfirmDialog(null, fields, "Inserte los datos del Profesor",
						JOptionPane.OK_CANCEL_OPTION);

				String nombre = tFNombreField.getText();
				String apellidos = tFApellidosField.getText();
				String asignatura = tFCursoField.getText();
				int edad = Integer.parseInt(tFEdadField.getText());

				personas.add(new Profesor(nombre, apellidos, edad, asignatura));
				profesoresCreados++;

				String urlBaseDeDatoString = "jdbc:mysql://localhost:3306/instituto";

				String usuari = "root";
				String password = "";

				try {

					Connection con = DriverManager.getConnection(urlBaseDeDatoString, usuari, password);

					PreparedStatement stmt = con.prepareStatement("INSERT INTO profesores VALUES(?,?,?,?,?)");

					stmt.setInt(1, profesoresCreados);
					stmt.setString(2, nombre);
					stmt.setString(3, apellidos);
					stmt.setInt(4, edad);
					stmt.setString(5, asignatura);

					int i = stmt.executeUpdate();
					System.out.println(i + " records inserted");

					con.close();

				} catch (Exception ex) {
					System.out.println(ex);
				}

			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("INSERTAR Alumnos y Profesores");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel.setBounds(242, 157, 547, 81);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(
				"Use el menú superior para INSERTAR alumnos y profesores en la base de datos.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(348, 237, 328, 30);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Usa \"Opciones\" para Salir del programa");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(396, 287, 238, 14);
		contentPane.add(lblNewLabel_1_1_1);
	}
}
