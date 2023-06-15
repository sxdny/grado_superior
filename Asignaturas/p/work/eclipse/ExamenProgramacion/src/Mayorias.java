import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class Mayorias extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mayorias frame = new Mayorias();
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
	public Mayorias() throws IOException {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane ppValue = new JTextPane();
		ppValue.setBounds(284, 165, 54, 20);
		contentPane.add(ppValue);
		
		JTextPane psoeValue = new JTextPane();
		psoeValue.setBounds(284, 237, 54, 20);
		contentPane.add(psoeValue);
		
		JTextPane mxValue = new JTextPane();
		mxValue.setBounds(284, 302, 54, 20);
		contentPane.add(mxValue);
		
		JTextPane voxValue = new JTextPane();
		voxValue.setBounds(690, 165, 54, 20);
		contentPane.add(voxValue);
		
		JTextPane podemosValue = new JTextPane();
		podemosValue.setBounds(690, 240, 54, 20);
		contentPane.add(podemosValue);
		
		JTextPane ciudaValue = new JTextPane();
		ciudaValue.setBounds(690, 302, 54, 20);
		contentPane.add(ciudaValue);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(463, 87, 54, 20);
		contentPane.add(textPane);
		
		String[] listaNumeroStrings = new String[7];
		BufferedReader bf = new BufferedReader(new FileReader("./numeros.txt"));
		String line = bf.readLine();
		
		int index = 0;
		while (line != null) {
			listaNumeroStrings[index] = line;
            line = bf.readLine();
            index++;
        }
		
		textPane.setText(listaNumeroStrings[6]);
		ppValue.setText(listaNumeroStrings[0]);
		psoeValue.setText(listaNumeroStrings[1]);
		mxValue.setText(listaNumeroStrings[2]);
		voxValue.setText(listaNumeroStrings[3]);
		podemosValue.setText(listaNumeroStrings[4]);
		ciudaValue.setText(listaNumeroStrings[5]);
       
        // closing bufferreader object
        bf.close();
		
		
		JLabel titulo = new JLabel("CÁLCULO MAYORÍAS");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		titulo.setBounds(398, 27, 187, 30);
		contentPane.add(titulo);
		
		JLabel lblNewLabel = new JLabel("Consellers / Concejales necesarios para tener mayoría:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(77, 87, 376, 14);
		contentPane.add(lblNewLabel);
		
		
		
		JCheckBox ppCheck = new JCheckBox("PP");
		ppCheck.setFont(new Font("Tahoma", Font.BOLD, 14));
		ppCheck.setBounds(199, 165, 97, 23);
		contentPane.add(ppCheck);
		
		JCheckBox chckbxPsoe = new JCheckBox("PSOE");
		chckbxPsoe.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxPsoe.setBounds(199, 237, 97, 23);
		contentPane.add(chckbxPsoe);
		
		JCheckBox chckbxMxme = new JCheckBox("MxME");
		chckbxMxme.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxMxme.setBounds(199, 299, 97, 23);
		contentPane.add(chckbxMxme);
		
		JCheckBox chckbxVox = new JCheckBox("VOX");
		chckbxVox.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxVox.setBounds(543, 167, 97, 23);
		contentPane.add(chckbxVox);
		
		JCheckBox chckbxPodemos = new JCheckBox("PODEMOS");
		chckbxPodemos.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxPodemos.setBounds(543, 239, 97, 23);
		contentPane.add(chckbxPodemos);
		
		JCheckBox chckbxCiudadanos = new JCheckBox("CIUDADANOS");
		chckbxCiudadanos.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxCiudadanos.setBounds(543, 301, 128, 23);
		contentPane.add(chckbxCiudadanos);
		
		JLabel mensaje = new JLabel("");
		mensaje.setBounds(113, 362, 340, 14);
		contentPane.add(mensaje);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int totalConsellers = 0;
				int totalUsuario = Integer.parseInt(textPane.getText());
				String[] partidoStrings = new String[5];
				
				// comprobar que una casilla este marcada
				if (ppCheck.isSelected()) {
					totalConsellers = totalConsellers + Integer.parseInt(ppValue.getText());
					partidoStrings[0] = "PP";
				}
				
				if (chckbxPsoe.isSelected()) {
					totalConsellers = totalConsellers +  Integer.parseInt(psoeValue.getText());
					partidoStrings[1] = "PSOE";
				}
				
				if (chckbxMxme.isSelected()) {
					totalConsellers = totalConsellers +  Integer.parseInt(mxValue.getText());
					partidoStrings[2] = "MxME";
				}
				
				if (chckbxVox.isSelected()) {
					totalConsellers = totalConsellers +  Integer.parseInt(voxValue.getText());
					partidoStrings[3] = "VOX";
				}
				
				if (chckbxPodemos.isSelected()) {
					totalConsellers = totalConsellers +  Integer.parseInt(podemosValue.getText());
					partidoStrings[4] = "PODEMOS";
				}
				
				if (chckbxCiudadanos.isSelected()) {
					totalConsellers = totalConsellers +  Integer.parseInt(ciudaValue.getText());
					partidoStrings[5] = "CIUDADANOS";
				}
				
				// comprobar
				
				String comprobarString = new String();
				
				for (int i = 0; i < partidoStrings.length; i++) {
					if (partidoStrings[i] == null) {
						
					}
					else {
						comprobarString = comprobarString + " " + partidoStrings[i];
					}
				}
				
				if (totalUsuario <= totalConsellers) {
					mensaje.setText(comprobarString + " TIENEN LA MAYORIA ABSOLUTA");
				}
				else {
					mensaje.setText(comprobarString + " NO TIENEN LA MAYORIA ABSOLUTA");
				}
				
				
					
				
			}
		});
		btnComprobar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnComprobar.setBounds(94, 440, 152, 23);
		contentPane.add(btnComprobar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				chckbxCiudadanos.setSelected(false);
				chckbxPodemos.setSelected(false);
				chckbxVox.setSelected(false);
				chckbxMxme.setSelected(false);
				chckbxPsoe.setSelected(false);
				ppCheck.setSelected(false);
				
				ppValue.setText("0");
				psoeValue.setText("0");
				mxValue.setText("0");
				voxValue.setText("0");
				podemosValue.setText("0");
				ciudaValue.setText("0");
				
				textPane.setText("0");
				
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLimpiar.setBounds(365, 440, 152, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnGuardarYCerra = new JButton("Guardar y cerrar");
		btnGuardarYCerra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// guardar en un int array
				int[] numeros = new int[7];
				
				numeros[0] = Integer.parseInt(ppValue.getText());
				numeros[1] = Integer.parseInt(psoeValue.getText());
				numeros[2] = Integer.parseInt(mxValue.getText());
				numeros[3] = Integer.parseInt(voxValue.getText());
				numeros[4] = Integer.parseInt(podemosValue.getText());
				numeros[5] = Integer.parseInt(ciudaValue.getText());
				
				numeros[6] = Integer.parseInt(textPane.getText());
				
				try {
					write("./numeros.txt", numeros);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
			public static void write (String filename, int[]arr) throws IOException {
		        BufferedWriter ow = null;
		        ow = new BufferedWriter(new FileWriter(filename));
		        for (int i = 0; i < arr.length; i++) {
		 
		            ow.write(arr[i]+"");
		            ow.newLine();
		        }
		        ow.flush();
		        ow.close();
		    }
		});
		btnGuardarYCerra.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardarYCerra.setBounds(622, 440, 152, 23);
		contentPane.add(btnGuardarYCerra);
		
		BufferedImage ppLogo_image = ImageIO.read(new File("./PP40.png"));
		JLabel ppLogo = new JLabel(new ImageIcon(ppLogo_image));
		ppLogo.setBounds(106, 165, 62, 22);
		contentPane.add(ppLogo);
		
		BufferedImage psoeLogo_image = ImageIO.read(new File("./psoe40.png"));
		JLabel psoeLogo = new JLabel(new ImageIcon(psoeLogo_image));
		psoeLogo.setBounds(106, 237, 62, 22);
		contentPane.add(psoeLogo);
		
		BufferedImage mxLogo_image = ImageIO.read(new File("./mes40.jpg"));
		JLabel mxLogo = new JLabel(new ImageIcon(mxLogo_image));
		mxLogo.setBounds(106, 302, 62, 22);
		contentPane.add(mxLogo);
		
		BufferedImage voxLogo_image = ImageIO.read(new File("./VOX40.png"));
		JLabel voxLogo = new JLabel(new ImageIcon(voxLogo_image));
		voxLogo.setBounds(463, 165, 62, 22);
		contentPane.add(voxLogo);
		
		BufferedImage podemosLogo_image = ImageIO.read(new File("./podemos40.png"));
		JLabel podemosLogo = new JLabel(new ImageIcon(podemosLogo_image));
		podemosLogo.setBounds(463, 238, 62, 22);
		contentPane.add(podemosLogo);
		
		BufferedImage ciudaLogo_image = ImageIO.read(new File("./ciudadanos40.png"));
		JLabel ciudaLogo = new JLabel(new ImageIcon(ciudaLogo_image));
		ciudaLogo.setBounds(463, 302, 62, 22);
		contentPane.add(ciudaLogo);
		
		
	}
}
