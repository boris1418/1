package ru.mirea.icbo0819.pr4.ex1;

import javax.swing.*;

public class ContentPaneReplace extends JFrame
{
    private static final long serialVersionUID=1L;

    public ContentPaneReplace()
    {
        super("Table");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contests = new JPanel();
        contests.add(new JButton("AC Milan"));
        contests.add(new JButton("Real Madrid"));


        setContentPane(contests);

        setSize(400,300);

        setVisible(true);
    }

    public static void main (String [] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ContentPaneReplace();
    }
}
