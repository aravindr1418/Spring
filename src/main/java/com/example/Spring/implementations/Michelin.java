package com.example.Spring.implementations;

import com.example.Spring.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component("michelin")
public class Michelin implements Tyres {
    @Override
    public String rotate() {
        return "Michelin Tyres";
    }
}
