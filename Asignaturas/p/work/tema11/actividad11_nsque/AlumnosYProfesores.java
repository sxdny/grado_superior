import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
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
	 * @throws IOException
	 */
	public AlumnosYProfesores() throws IOException {

		if (personasFile.length() == 0) {
			// si el archivo está vacio, no creamos ningún objeto para leerlo
			// sino nos da un EOFException
		} else { // si el archivo no está vacio...
	
			FileInputStream fis = new FileInputStream(personasFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
	
			try {
	
				while (true) { // recorremos el archivo
					Persona persona = (Persona) ois.readObject();
					personas.add(persona);
				}
	
			} catch (EOFException eof) { // capturamos la excepcion de fin del archivo
				System.out.println("Final del archivo");
			} catch (IOException | ClassNotFoundException ex) {
				ex.printStackTrace();
			}
	
			ois.close();
	
		}

		setTitle("Creacion de alumnos y profesores");
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

		JMenu mnNewMenu = new JMenu("Crear");
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
				
				JOptionPane.showConfirmDialog(null, fields, "Inserte los datos del Alumno", JOptionPane.OK_CANCEL_OPTION);

				String nombre = tFNombreField.getText();
				String apellidos = tFApellidosField.getText();
				String cursoString = tFCursoField.getText();
				int edad = Integer.parseInt(tFEdadField.getText());
				
				personas.add(new Alumno(nombre, apellidos, edad, cursoString));
				
				for (Persona persona : personas) {
					System.out.println(persona.toString().toString());
				}
				
				try {
					fos = new FileOutputStream(personasFile);
					oos = new ObjectOutputStream(fos);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				for (Persona persona : personas) { // escribir objeto en el archivo
		            try {
						oos.writeObject(persona);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
		        }

		        try {
					oos.flush();
					oos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
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
				
				JOptionPane.showConfirmDialog(null, fields, "Inserte los datos del Profesor", JOptionPane.OK_CANCEL_OPTION);

				String nombre = tFNombreField.getText();
				String apellidos = tFApellidosField.getText();
				String asignatura = tFCursoField.getText();
				int edad = Integer.parseInt(tFEdadField.getText());
				
				personas.add(new Profesor(nombre, apellidos, edad, asignatura));
			
				for (Persona persona : personas) {
					System.out.println(persona.toString().toString());
				}
				
				try {
					fos = new FileOutputStream(personasFile);
					oos = new ObjectOutputStream(fos);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				for (Persona persona : personas) { // escribir objeto en el archivo
		            try {
						oos.writeObject(persona);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
		        }

				for (Profesor profesor : profesores) { // escribir objeto en el archivo
		            try {
						oos.writeObject(profesor);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
		        }

		        try {
					oos.flush();
					oos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		        
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenu mnNewMenu_1 = new JMenu("Listar");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Alumnos");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JPanel panelTable = new JPanel();
				GridLayout grid = new GridLayout();
				grid.setVgap(5);
				panelTable.setLayout(grid);

				for (Persona persona : personas) {
					if (persona instanceof Alumno) {
						alumnos.add((Alumno) persona);
					}
				}

				for (Alumno alumno : alumnos) {
					JLabel label = new JLabel(alumno.getNombre());
				}



			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Profesores");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Crear Alumnos y Profesores");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel.setBounds(242, 157, 547, 81);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Use el menú superior para crear alumnos y profesores");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(348, 237, 328, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Para Listar tanto Alumnos como Profesores, use el apartado \"Listar\"");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(309, 262, 412, 14);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Usa \"Opciones\" para Salir del programa");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(396, 287, 238, 14);
		contentPane.add(lblNewLabel_1_1_1);
	}
}
