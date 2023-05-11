package ac11_3;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class ac11_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayoutDemo");
        JPanel pane = (JPanel) frame.getContentPane();
        pane.setLayout(new BorderLayout());
        JButton button = new JButton("Button 1 (PAGE START)");
        pane.add(button, BorderLayout.PAGE_START);
        //Make the center component big, since that&#39;s the
        //typical usage of BorderLayout.
        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(200, 100));
    
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));
        subPanel.add(new JButton("Central 1"));
        subPanel.add(new JButton("Central 2"));
        subPanel.add(new JButton("Central 3"));
        subPanel.add(new JButton("Central 4"));
        subPanel.add(new JButton("Central 5"));

        pane.add(subPanel, BorderLayout.CENTER);

        button = new JButton("Button 3 (LINE_START)");
        pane.add(button, BorderLayout.LINE_START);
        button = new JButton("Long-named Button 4 (PAGE_END)");
        pane.add(button, BorderLayout.PAGE_END);
        button = new JButton("5 (LINE_END)");
        pane.add(button, BorderLayout.LINE_END);
        frame.pack();
        frame.setVisible(true);
    }
}