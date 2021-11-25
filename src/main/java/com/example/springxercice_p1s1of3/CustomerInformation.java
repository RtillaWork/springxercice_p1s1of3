package com.example.springxercice_p1s1of3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerInformation {

//    @Bean
//    public Customer customer(@Autowired String addr) {
//        return new Customer("Mack Theknife", addr);
//    }

    @Bean
    public Customer customer(@Qualifier("address1") String addr) {
        return new Customer("Mack Theknife", addr);
    }

    @Bean
    public Customer example(@Autowired Customer cust) {
        System.out.println(cust);
        return cust;
    }

}
