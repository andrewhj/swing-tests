package org.example.components;

import net.miginfocom.layout.AC;
import net.miginfocom.layout.LC;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public abstract class SampleFrame extends JFrame
{
    public SampleFrame() throws HeadlessException
    {
        setTitle(getClass().getCanonicalName());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        myLayout();
    }

    public SampleFrame(final String name)
    {
        this();
        setName(name);
    }

    public void myLayout()
    {
        final GridBagLayout layout = new GridBagLayout();
        //        layout.getcon
        layout.addLayoutComponent("nameField", new JTextField());

        //        final JPanel jPanel = new JPanel(layout);
        setLayout(layout);
    }

    public void setMigLayout(final LC layout, final AC columns, final AC rows)
    {
        setLayout(new MigLayout(layout, columns, rows));
    }

    public void setMigLayout()
    {
        setMigLayout(new LC(), new AC(), new AC());
    }

}
