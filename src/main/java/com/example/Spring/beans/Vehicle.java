package com.example.Spring.beans;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialze(){
        this.name = "Aravind";
        printhello();
    }
    @PreDestroy
    public void destroy(){
        System.out.println("the bean is going to destroy  ...... DESTROYED");
    }

    public void printhello(){
        System.out.println("Hai "+getName());
    }
}
