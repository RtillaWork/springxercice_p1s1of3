package com.example.springxercice_p1s1of3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Addresses {

    @Bean
    @Primary
    public String address() {
        return "Green Hill St";
    }

    @Bean
    public String address1() {
        return "Address One";
    }

    @Bean
    public String address2() {
        return "Address Two";
    }
}