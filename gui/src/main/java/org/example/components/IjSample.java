package org.example.components;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IjSample // implements Publisher<ActionEvent>
{
    private JTextField nameField;
    private JPanel panel1;
    private JButton closeButton;
    private Flux<ActionEvent> flux;

    public IjSample()
    {
        closeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(final ActionEvent e)
            {
            }
        });
    }

    public static void main(final String[] args)
    {
        JFrame frame = new JFrame("IjSample");
        frame.setContentPane(new IjSample().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    static class IjSampleEventSubscription implements Subscription
    {
        @Override
        public void request(final long l)
        {
        }

        @Override
        public void cancel()
        {

        }
    }
}
