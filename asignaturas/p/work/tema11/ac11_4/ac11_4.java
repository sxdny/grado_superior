package ac11_4;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class ac11_4 {

    public static void main(String[] args) {

        GridLayout grid = new GridLayout(4, 4, 2, 2);

        // Contenidor d'alt nivell: finestra principal
        JFrame calculadora = new JFrame("Calculadora");
        calculadora.setLayout(new BorderLayout());
        
        // Panell de contingut
        Container panell = calculadora.getContentPane();

        Color dG = new ColorUIResource(32, 32, 32);
        
        panell.setBackground(dG);

        calculadora.setMinimumSize(new Dimension(250, 400));

        // Display de la calculadora
        JTextField textField = new JTextField("0", 5);
        textField.setFont(new Font(null, 0, 50));
        // para que no sea editable
        textField.setEditable(false);
        // para que el texto de "textField" esté a la derecha
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBackground(Color.YELLOW);
        textField.setForeground(Color.BLACK);
        textField.setBorder(BorderFactory.createLineBorder(dG, 10, false));

        // posicinamos el textField al principio de la página
        panell.add(textField, BorderLayout.PAGE_START);

        // Panell auxiliar on posar els botons
        JPanel panellBotons = new JPanel();
        // poner un borde en el Panel de botones
        panellBotons.setBorder(BorderFactory.createLineBorder(dG, 10, false));
        // cambio de color del fondo del panel de botones
        panellBotons.setBackground(dG);

        panellBotons.setLayout(grid);

        // botons numeros y estilos
        JButton boto1 = new JButton("1");
        boto1.setFont(new Font(null, 0, 20));
        boto1.setForeground(Color.WHITE);
        boto1.setBackground(new Color(60, 60, 60));

        JButton boto2 = new JButton("2");
        boto2.setFont(new Font(null, 0, 20));
        boto2.setForeground(Color.WHITE);
        boto2.setBackground(new Color(60, 60, 60));

        JButton boto3 = new JButton("3");
        boto3.setFont(new Font(null, 0, 20));
        boto3.setForeground(Color.WHITE);
        boto3.setBackground(new Color(60, 60, 60));

        JButton boto4 = new JButton("4");
        boto4.setFont(new Font(null, 0, 20));
        boto4.setForeground(Color.WHITE);
        boto4.setBackground(new Color(60, 60, 60));

        JButton boto5 = new JButton("5");
        boto5.setFont(new Font(null, 0, 20));
        boto5.setForeground(Color.WHITE);
        boto5.setBackground(new Color(60, 60, 60));

        JButton boto6 = new JButton("6");
        boto6.setFont(new Font(null, 0, 20));
        boto6.setForeground(Color.WHITE);
        boto6.setBackground(new Color(60, 60, 60));

        JButton boto7 = new JButton("7");
        boto7.setFont(new Font(null, 0, 20));
        boto7.setForeground(Color.WHITE);
        boto7.setBackground(new Color(60, 60, 60));

        JButton boto8 = new JButton("8");
        boto8.setFont(new Font(null, 0, 20));
        boto8.setForeground(Color.WHITE);
        boto8.setBackground(new Color(60, 60, 60));

        JButton boto9 = new JButton("9");
        boto9.setFont(new Font(null, 0, 20));
        boto9.setForeground(Color.WHITE);
        boto9.setBackground(new Color(60, 60, 60));

        JButton boto0 = new JButton("0");
        boto0.setFont(new Font(null, 0, 20));
        boto0.setForeground(Color.WHITE);
        boto0.setBackground(new Color(60, 60, 60));

        // botons funcions y estilos
        JButton botoC = new JButton("C");
        botoC.setFont(new Font(null, 0, 20));
        botoC.setForeground(Color.WHITE);
        botoC.setBackground(new Color(60, 60, 60));

        JButton botoEquals = new JButton("=");
        botoEquals.setFont(new Font(null, 0, 20));
        botoEquals.setForeground(Color.WHITE);
        botoEquals.setBackground(new Color(60, 60, 60));

        JButton botoSlash = new JButton("/");
        botoSlash.setFont(new Font(null, 0, 20));
        botoSlash.setForeground(Color.WHITE);
        botoSlash.setBackground(new Color(60, 60, 60));

        JButton botoTimes = new JButton("X");
        botoTimes.setFont(new Font(null, 0, 20));
        botoTimes.setForeground(Color.WHITE);
        botoTimes.setBackground(new Color(60, 60, 60));

        JButton botoMinus = new JButton("-");
        botoMinus.setFont(new Font(null, 0, 20));
        botoMinus.setForeground(Color.WHITE);
        botoMinus.setBackground(new Color(60, 60, 60));

        JButton botoPlus = new JButton("+");
        botoPlus.setFont(new Font(null, 0, 20));
        botoPlus.setForeground(Color.WHITE);
        botoPlus.setBackground(new Color(60, 60, 60));

        // Afegir botons a panell auxiliar

        // numeros
        panellBotons.add(boto7);
        panellBotons.add(boto8);
        panellBotons.add(boto9);
        panellBotons.add(botoPlus);
        panellBotons.add(boto4);
        panellBotons.add(boto5);
        panellBotons.add(boto6);
        panellBotons.add(botoMinus);
        panellBotons.add(boto1);
        panellBotons.add(boto2);

        // funcions
        panellBotons.add(boto3);
        panellBotons.add(botoTimes);
        panellBotons.add(boto0);
        panellBotons.add(botoC);
        panellBotons.add(botoEquals);
        panellBotons.add(botoSlash);

        // Afegir panell auxiliar de botons a interface
        panell.add(panellBotons, BorderLayout.CENTER);

        calculadora.setVisible(true);

    }

}
