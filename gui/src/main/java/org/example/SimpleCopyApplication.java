package org.example;

import net.miginfocom.layout.AC;
import net.miginfocom.layout.LC;
import org.example.components.SampleFrame;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

import static javax.swing.SwingUtilities.invokeAndWait;
import static org.example.util.swing.ButtonUtil.addActionToButton;
import static org.example.util.swing.ButtonUtil.newButton;
import static org.example.util.swing.LabelUtil.newLabel;
import static org.example.util.swing.TextFieldUtil.newTextField;

public class SimpleCopyApplication extends SampleFrame
{
    private static final long serialVersionUID = 1L;

    public SimpleCopyApplication()
    {
        super();
        setMigLayout(new LC().wrapAfter(1), new AC().align("center"), new AC());

        final JTextField textField = newTextField("textToCopy");
        final JButton button = newButton("copyButton", "Copy text to label");
        final JLabel label = newLabel("copiedText");

        addActionToButton(button, () -> label.setText(textField.getText()));

        add(textField);
        add(button);
        add(label);

        pack();
    }

    public static void main(final String[] args) throws InvocationTargetException, InterruptedException
    {
        invokeAndWait(() ->
                      {
                          final JFrame frame = new SimpleCopyApplication();
                          frame.setVisible(true);
                      });
    }
}
