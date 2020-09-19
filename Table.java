package ru.mirea.icbo0819.pr4.ex1;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Table
{
    public static void createGUI()
    {
        JFrame frame = new JFrame("Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Result:");
        frame.getContentPane().add(label);

        frame.setPreferredSize(new Dimension(400,300));

        frame.pack();
        frame.setVisible(true);
    }

    public static void main (String [] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI();
            }
        });
    }
}

