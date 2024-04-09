package com.example.Spring.implementations;

import com.example.Spring.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component("bosespeaker")
public class BoseSpeaker implements Speakers {
    @Override
    public String makeSound() {
        return "Bose Speaker";
    }
}
