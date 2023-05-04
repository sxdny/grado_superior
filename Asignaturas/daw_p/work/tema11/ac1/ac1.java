package ac1;

import java.awt.*;
import javax.swing.*;

public class ac1 {

    public static void main(String[] args) { 
        //Contenidor d'alt nivell: finestra principal
        JFrame calculadora = new JFrame("Calculadora");
        calculadora.setLayout(new GridLayout(1, 1));

        //Panell de contingut
        Container panell = calculadora.getContentPane();
        panell.setLayout(new GridLayout(1, 1));
        GridLayout grid = new GridLayout();
        
        //panell.setLayout(grid);

        calculadora.setSize(350, 510);
        //Display de la calculadora
        JLabel display = new JLabel("Un video");
        
        panell.add(display);

        //Panell auxiliar on posar els botons
        JPanel panellBotons = new JPanel();
        panell.setLayout(grid);

        JButton boto1 = new JButton("1");
        JButton boto2 = new JButton("2");
        JButton boto3 = new JButton("3");
        JButton boto4 = new JButton("4");
        JButton boto5 = new JButton("5");
        JButton boto6 = new JButton("6");
        JButton boto7 = new JButton("7");
        JButton boto8 = new JButton("8");
        JButton boto9 = new JButton("9");
        JButton boto0 = new JButton("0");

        JButton botoC = new JButton("C");
        JButton botoEquals = new JButton("=");
        JButton botoSlash = new JButton("/");
        JButton botoTimes = new JButton("X");
        JButton botoMinus = new JButton("-");
        JButton botoPlus = new JButton("+");

        //Afegir botons a panell auxiliar
        panellBotons.add(boto1);
        panellBotons.add(boto2);
        panellBotons.add(boto3);
        panellBotons.add(boto4);
        panellBotons.add(boto5);
        panellBotons.add(boto6);
        panellBotons.add(boto7);
        panellBotons.add(boto8);
        panellBotons.add(boto9);
        panellBotons.add(boto0);

        panellBotons.add(botoC);
        panellBotons.add(botoEquals);
        panellBotons.add(botoSlash);
        panellBotons.add(botoTimes);
        panellBotons.add(botoMinus);
        panellBotons.add(botoPlus);

        //Afegir panell auxiliar de botons a interface
        panell.add(panellBotons);

        calculadora.setVisible(true);

    }

}
