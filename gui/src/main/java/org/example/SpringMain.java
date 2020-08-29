package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMain
{
    public static void main(String[] args)
    {
        final ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(SpringMain.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
//        SpringApplication.run(SpringMain.class, args);
    }
}
