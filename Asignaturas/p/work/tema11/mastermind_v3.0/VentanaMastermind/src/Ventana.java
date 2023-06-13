import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.util.*;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {
	
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setResizable(false);
		setTitle("Mastermind");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 711, 427);
		
		// diálogo para confirmar la salida del programa.
		
		this.addWindowListener(new WindowAdapter() {
			
            @Override
            public void windowClosing(WindowEvent e) {
                int choose = JOptionPane.showConfirmDialog(null,
                        "¿Seguro que quieres salir del programa?",
                        "Confirmación para salir del programa", JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
                if (choose == JOptionPane.YES_OPTION) {
                    e.getWindow().dispose();
                    System.out.println("Cerrar");
                  
                } else {
                    System.out.println("No");
                }
            }
        });
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(47, 79, 79));
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opciones");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu.setBackground(new Color(47, 79, 79));
		menuBar.add(mnNewMenu);
		
		JMenuItem menuListarUsuarios = new JMenuItem("Listar usuarios");
		menuListarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaListar ventanaListar = new VentanaListar();
				
				ventanaListar.setVisible(true);
				// ocultar la otra ventana (¿?)
				
			}
		});
		menuListarUsuarios.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu.add(menuListarUsuarios);
		
		JMenuItem menuCrearUsuarios = new JMenuItem("Crear nuevos usuarios");
		menuCrearUsuarios.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu.add(menuCrearUsuarios);
		
		JMenuItem menuSeleccionarUsuario = new JMenuItem("Seleccionar usuario");
		menuSeleccionarUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu.add(menuSeleccionarUsuario);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MASTERMIND");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 341, 108, 14);
		contentPane.add(lblNewLabel);
		
		JLabel labelTitle = new JLabel("Bienvenido");
		labelTitle.setForeground(new Color(255, 255, 255));
		labelTitle.setBounds(249, 131, 211, 43);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 38));
		contentPane.add(labelTitle);
		
		JLabel lblNewLabel_1 = new JLabel("Para comenzar, seleccione o cree un usuario en el menú \"Opciones\".");
		lblNewLabel_1.setForeground(new Color(240, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(146, 185, 424, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSidneySilvaBraz = new JLabel("Sidney Silva Braz de Oliveira 1º DAW");
		lblSidneySilvaBraz.setForeground(new Color(255, 255, 255));
		lblSidneySilvaBraz.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSidneySilvaBraz.setBounds(509, 341, 176, 14);
		contentPane.add(lblSidneySilvaBraz);
		
	}
}
