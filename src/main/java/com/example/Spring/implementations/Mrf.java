package com.example.Spring.implementations;

import com.example.Spring.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mrf")
@Primary
public class Mrf implements Tyres {
    @Override
    public String rotate() {
        return "MRF Tyres";
    }
}
