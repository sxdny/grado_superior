package ac11_2;

import javax.swing.*;
import java.awt.FlowLayout;

public class ac11_2 {
    public static void main(String[] args) {
        // creacion JFrame
        JFrame frame = new JFrame("FlowLayoutDemo");

        // creacion JPanel
        JPanel pane = (JPanel) frame.getContentPane();

        // creacion de los Labels
        JLabel label1 = new JLabel("Counter:");
        JLabel label2 = new JLabel("Step:");

        // creacion del TextField
        JTextField textField = new JTextField("0", 5);
        // para que no sea editable
        textField.setEditable(false);
        // para que el texto de "textField" esté a la derecha
        textField.setHorizontalAlignment(SwingConstants.RIGHT);

        // creacion de los JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Up");
        JRadioButton radioButton2 = new JRadioButton("Down");
        // creación del ButtonGroup
        ButtonGroup group = new ButtonGroup();
        // añadimos los botones al grupo
        group.add(radioButton1);
        group.add(radioButton2);

        // numeros para el JComboBox
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        // creación del JComboBox que incluya la Array "numbers"
        JComboBox comboBox = new JComboBox<>(numbers);
        // creacion boton
        JButton button = new JButton("Button 1");

        // añadimos los elementos en orden al JPanel
        pane.setLayout(new FlowLayout());
        pane.add(label1);
        pane.add(textField);
        pane.add(radioButton1);
        pane.add(radioButton2);
        pane.add(label2);
        pane.add(comboBox);
        pane.add(button);

        frame.pack();
        frame.setVisible(true);
    }
}
