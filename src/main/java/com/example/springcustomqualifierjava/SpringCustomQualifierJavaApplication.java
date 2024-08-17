package com.example.springcustomqualifierjava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCustomQualifierJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCustomQualifierJavaApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(AnotherService anotherService) {
        return args -> {
            System.out.println("--------------------------------------");
            System.out.println(anotherService);
            System.out.println("--------------------------------------");
        };
    }
}
