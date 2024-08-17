package com.example.springcustomqualifierjava;

import org.springframework.stereotype.Service;

@Service
public class AnotherService {
    private final MyService primaryMyService;
    private final MyService secondaryMyService;

    public AnotherService(@PrimaryMyService MyService primaryMyService, // error
                          @SecondaryMyService MyService secondaryMyService) // ok
    {
        this.primaryMyService = primaryMyService;
        this.secondaryMyService = secondaryMyService;
    }

    @Override
    public String toString() {
        return "AnotherService{" +
               "primaryMyService=" + primaryMyService.getId() +
               ", secondaryMyService=" + secondaryMyService.getId() +
               '}';
    }
}
