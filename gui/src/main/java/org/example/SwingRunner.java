package org.example;

import org.example.components.IjSample;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SwingRunner implements CommandLineRunner
{
    @Override
    public void run(final String... args) throws Exception
    {
        IjSample.main(args);
    }
}
