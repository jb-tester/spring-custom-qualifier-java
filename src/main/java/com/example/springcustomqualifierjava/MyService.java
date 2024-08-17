package com.example.springcustomqualifierjava;

import org.springframework.stereotype.Service;


public class MyService {
    int id;

    public MyService(int id) {
        this.id = id;
    }
    public int getId() {return id;}
}
