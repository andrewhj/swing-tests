package org.example.util.swing;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldUtil
{
    public static JTextField newTextField(final String name)
    {
        final JTextField field = new JTextField(20);
        field.setName(name);
        return field;
    }

    public static JTextField newPasswordField(final String name)
    {
        final JTextField field = new JPasswordField(20);
        field.setName(name);
        return field;
    }
}
