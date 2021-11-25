package com.example.springxercice_p1s1of3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final PasswordGenerator generator;

    @Autowired
    public Runner(PasswordGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run(String... args ) {
        System.out.println("Heyyo Spring! Let's generate some passwords!");
        System.out.println(generator.generate(8));
        System.out.println(generator.generate(16));

    }
}
