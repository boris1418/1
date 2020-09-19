package ru.mirea.icbo0819.pr4.ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionListner implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        JButton button = new JButton("0X0");
        ActionListener actionListener = new TestActionListner();
        button.addActionListener(actionListener);
    }

    public static void main (String [] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        System.out.println(
                button
        );
    }
}
