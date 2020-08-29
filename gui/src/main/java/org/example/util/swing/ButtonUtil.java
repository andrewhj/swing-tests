package org.example.util.swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonUtil
{
    public static JButton newButton(final String name, final String text)
    {
        final JButton button = new JButton(text);
        button.setName(name);
        return button;
    }

    public static void addActionToButton(final JButton button, final Runnable action)
    {
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(final ActionEvent e)
            {
                action.run();
            }
        });
    }
}
