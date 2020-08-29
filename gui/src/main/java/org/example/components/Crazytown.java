package org.example.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Crazytown extends JDialog
{
    private JPanel contentPane;
    private JButton okButton;

    public Crazytown() {
        contentPane = new JPanel();
        final TextArea textArea = new TextArea();
        okButton = new JButton("Ok");
        okButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(final ActionEvent e)
            {
                textArea.setText(e.getActionCommand());
            }
        });
        contentPane.add(textArea);
        contentPane.add(okButton);

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(okButton);
    }

    public static void main(String[] args)
    {
        final Crazytown crazytown = new Crazytown();
        crazytown.pack();
        crazytown.setVisible(true);
        System.exit(0);

    }
}
