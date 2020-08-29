package org.example.util.swing;

import javax.swing.JLabel;

public class LabelUtil
{
    public static JLabel newLabel(final String name)
    {
        return newLabel(name, " ");
    }

    public static JLabel newLabel(final String name, final String text)
    {
        final JLabel label = new JLabel(text);
        label.setName(name);
        return label;
    }
}
