import java.awt.*;
import javax.swing.*;

public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(new FlowLayout());

        JButton bt1 = new JButton("Versiones");
        JButton bt2 = new JButton("Jugar");

        ImageIcon img = new ImageIcon("C:/Users/ciclesgs.EAAULA111W-009/Documents/GitHub/Actividades-Grado-Superior/Asignaturas/daw_p/work/tema11/mine.png");
        frame.setIconImage(img.getImage());

        frame.setSize(800, 500);

        frame.setTitle("Minecraft");

        panel.add(bt1);
        panel.add(bt2);

        frame.setVisible(true);

    }

}
