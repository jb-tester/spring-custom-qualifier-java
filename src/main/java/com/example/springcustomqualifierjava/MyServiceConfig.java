package com.example.springcustomqualifierjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServiceConfig {

    @Bean("primaryMyService")
    public MyService myService1() {
        return new MyService(1);
    }
    @Bean
    @SecondaryMyService
    public MyService myService2() {
        return new MyService(2);
    }
}
