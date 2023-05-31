import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    
    public Ventana() {
        super("Programa Alumnos y Profesores");
        this.setMinimumSize(new Dimension(300, 300));
    }

    JButton jButton = new JButton("Crear alumno");

}
